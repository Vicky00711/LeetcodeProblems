class Solution {


    public boolean isPalindrome(int x) {
        int original=x;
        int result=0;
        while (x>0){
            result= result*10+x%10;
            x=x/10;
        }
        if (result==original){
            return true;
        }
        else {
            return false;
        }


            // if (x < 0) {
            //     return false;
            // }
            // String s1 = String.valueOf(x);
            // String s2 = reverse(s1, s1.length() - 1);
            // return s1.equals(s2);
        }

        // public String reverse(String s, int idx) {
        //     if (idx < 0) {
        //         return "";
        //     }

        //     // Recursive case: build the reversed string
        //     return s.charAt(idx) + reverse(s, idx - 1);
        // }


}