class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap, List<String>> mapFinal = new HashMap<>();
        for (String s : strs) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            mapFinal.putIfAbsent(map, new ArrayList<String>());
            mapFinal.get(map).add(s);
        }
        return new ArrayList<>(mapFinal.values());
    }
}
