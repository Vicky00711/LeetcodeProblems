class Solution {
    public  boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i])+1);
            }

        }

        System.out.println(map);

        Set<Integer> set= new HashSet<>();
        for (Integer keys:map.keySet()){
             set.add(map.get(keys));
        }

        if (set.size()==map.size()){
            return true;
        }

        else {
            return false;
        }

    }
}