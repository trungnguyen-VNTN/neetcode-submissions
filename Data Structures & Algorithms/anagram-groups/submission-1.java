class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap, List<String>> mapFinal = new HashMap<>();
        for (String s : strs) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            List<String> list = mapFinal.getOrDefault(map, new ArrayList<String>());
            list.add(s);
            mapFinal.put(map,list);
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> sublist : mapFinal.values()) {
            result.add(sublist);
        }
        return result;
    }
}
