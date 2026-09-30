class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = temp.length() - 1;
        System.out.println(temp);
        while (i < j) {
            if (temp.toUpperCase().charAt(i) == temp.toUpperCase().charAt(j)){
                i ++;
                j --;
            } else {
                return false;
            }
        }
        return true;
    }
}
