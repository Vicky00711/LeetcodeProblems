class Solution {
    public int compress(char[] chars) {
        String ans="";
        int i=0;
        int j=0;

        if (chars.length==1){
            ans=ans+chars[i]+1;
            return 1;
        }
        while (j<chars.length){
            if (chars[i]==chars[j]){

                j++;
            }
            else if (chars[i]!=chars[j]  ){

                int count=j-i;
                if (count>1){
                    ans= ans+chars[i]+(j-i);
                    i=j;
                }
                else if (count==1){
                    ans= ans+chars[i];
                    i=j;
                }


            }
        }
       
        ans= ans+chars[i];
        if (j-i>1){
            ans= ans+ (j-i);
        }
       


        for (int k=0; k<ans.length(); k++){
            chars[k]=ans.charAt(k);
        }

        return ans.length();
    }
}