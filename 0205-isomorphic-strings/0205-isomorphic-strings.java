class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length()!=t.length()){
            return false;
        }


        else {

            HashMap<Character, Character> mapS= new HashMap<>();
            HashMap<Character, Character> mapT= new HashMap<>();

            for (int i=0; i<s.length(); i++){
                if (mapS.containsKey(s.charAt(i))) {
                    if (mapS.get(s.charAt(i)) != t.charAt(i)) {
                        return false;
                    }

                }     
                mapS.put(s.charAt(i), t.charAt(i));
                    
                }

            for (int i=0; i<t.length(); i++){
                if (mapT.containsKey(t.charAt(i))) {
                    if (mapT.get(t.charAt(i)) != s.charAt(i)) {
                        return false;
                    }
                }
                mapT.put(t.charAt(i), s.charAt(i));

            }

                
            }
            
        
            return true;


        // if (s.length()!=t.length()){
        //     return false;
        // }


        // else {
        //     Stack<Character> stS= new Stack<>();
        //     Stack<Character> stT= new Stack<>();

        //     HashSet<Character> setS= new HashSet<>();
        //     HashSet<Character> setT= new HashSet<>();

        //     for (int i=0; i<s.length(); i++){
        //         stS.add(s.charAt(i));
        //     }
        //     for (int i=0; i<t.length(); i++){
        //         stT.add(t.charAt(i));
        //     }
            
        //     while (stS.size()>0 && stT.size()>0){
        //         char itemS= stS.pop();
        //         char itemT=stT.pop();
                
        //         if (setT.size()==0 && setS.size()==0){
        //             setT.add(itemT);
        //             setS.add(itemS);
                    
        //         }
        //         else {
        //             if (setS.contains(itemS) && !setT.contains(itemT)){
        //                 return false;
        //             }
        //             if (!setS.contains(itemS) && setT.contains(itemT)){
        //                 return false;
        //             }
        //             if (!setT.contains(itemS) && !setS.contains(itemT)){
        //                 setT.add(itemT);
        //                 setS.add(itemS);
        //             }
        //         }
                
        //     }

        // }
        // return true;
    }
}