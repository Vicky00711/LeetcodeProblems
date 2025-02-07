class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
         int count=0;
        HashSet<String> set= new HashSet<>();
        for (int i=0; i<words.length; i++){
            
            if (set.contains(reverseString(words[i], 0))){
                count++;
                set.remove(reverseString(words[i], 0));
            }
            set.add(words[i]);
        }
        return count;
    }

    public String reverseString(String str, int idx){
        if(str.length()==idx){
            return "";
        }
        String ans= reverseString(str, idx+1) + str.charAt(idx);
        return ans;
    }
}