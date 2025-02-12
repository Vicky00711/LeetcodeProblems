class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i=0; i<arr.length; i++){

            if (map.containsKey(arr[i])){
                int freq=map.get(arr[i]);
                map.put(arr[i], freq+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        HashMap<Integer, Integer> map2= new HashMap<>();
        for (Integer keys: map.keySet()) {
            if (map2.containsKey(map.get(keys))){
                int freq=map2.get(map.get(keys));
                map2.put(map.get(keys), freq+1);
            }
            else {
                map2.put(map.get(keys), 1);
            }
        }

        for(Integer values: map2.values()){
            if (values>1){
                return false;
            }
        }
        return true;
    }
}