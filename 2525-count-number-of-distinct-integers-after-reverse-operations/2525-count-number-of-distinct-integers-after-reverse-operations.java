class Solution {
    public int countDistinctIntegers(int[] nums) {
         HashSet<Integer> set= new HashSet<>();
        for (int i=0; i<nums.length; i++){
            set.add(nums[i]);
            set.add(reverseNum(nums[i]));
        }
        return set.size();
    }

    public int reverseNum(int num){
        int result=0;
        while (num!=0){
            result= result*10+num%10;
            num=num/10;
        }
       return result;
    }
}