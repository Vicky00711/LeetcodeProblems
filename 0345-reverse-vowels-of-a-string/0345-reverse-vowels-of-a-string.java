class Solution {
    public String reverseVowels(String s) {
        Stack<Character> ans= new Stack<>();
        char[] s1=s.toCharArray();

        HashSet<Character> set = new HashSet<>();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='a'|| s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
                set.add(s.charAt(i));
            }
        }



        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='a'|| s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
                ans.push(s.charAt(i));
            }

        }

        for (int i=0; i<s.length(); i++){
            if (set.contains(s.charAt(i))){
                s1[i]=ans.pop();
            }
        }
        String ans2="";
        for(int i=0; i<s1.length; i++){
            ans2= ans2+s1[i];
        }
        return ans2;


    }
}