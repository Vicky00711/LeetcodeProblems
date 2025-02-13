class Solution {
   public String[] findWords(String[] words) {
        HashMap<Character, Integer> map=new HashMap<>();
        String a="qwertyuiop";
        String b="asdfghjkl";
        String c= "zxcvbnm";



        for (int i=0; i<a.length(); i++){
            map.put(a.toLowerCase().charAt(i), 1);
        }
        for (int i=0; i<b.length(); i++){
            map.put(b.toLowerCase().charAt(i), 2);
        }
        for (int i=0; i<c.length(); i++){
            map.put(c.toLowerCase().charAt(i), 3);
        }
        List<String> result = new ArrayList<>();

        for (int i=0; i< words.length; i++) {
            if (words[i].isEmpty()) continue; // Skip empty words

            int row = map.get(words[i].toLowerCase().charAt(0));
            boolean isValid = true;
            for (int j=0; j<words[i].length();j++) {
                if (map.get(words[i].toLowerCase().charAt(j)) != row) {
                    isValid = false;
                    break;
                }
            }
            if (isValid){
                result.add(words[i]);
            }



    }
        String[] answer= new String[result.size()];
        int k=0;
        for (int i=0; i< result.size(); i++){
            answer[k++]= result.get(i);
        }
        return answer;

    } 
}