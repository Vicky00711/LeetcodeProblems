class Solution {
    public int fib(int n) {
        int[] arr= new int[n+1];
        return fibo(n, arr);
    }

    public int fibo(int n, int[] arr){
        if (n<=1) return n;
        if (arr[n]!=0) return arr[n];

        int ans= fibo(n-1,arr)+fibo(n-2,arr);
        arr[n]=ans;
        return ans;
    }
}