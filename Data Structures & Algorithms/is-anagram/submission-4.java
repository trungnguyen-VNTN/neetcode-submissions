class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = convertToMap(s);
        Map<Character, Integer> tMap = convertToMap(t);
        if (tMap.size() != sMap.size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if (!tMap.containsKey(entry.getKey()))
                return false;
            if ((tMap.get(entry.getKey()) - entry.getValue()) != 0)
                return false;
        }
        return true;
    }

    public Map<Character, Integer> convertToMap(String s) {
        char[] sArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            if (map.containsKey(sArr[i])) {
                map.put(sArr[i], map.get(sArr[i]) + 1);
            } else {
                map.put(sArr[i], 1);
            }
        }
        return map;
    }
}
