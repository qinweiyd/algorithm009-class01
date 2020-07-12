class Solution {
    public boolean isAnagram(String s, String t) {
         if (s == null && t == null) return true;
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        
        for (char sc : s.toCharArray()) {
            count[sc - 'a']++;
        }
        for (char tc : t.toCharArray()) {
            count[tc - 'a']--;
        }
        for(int i = 0; i< 26; i++){
            if (count[i] != 0) return false;
        }
        return true;
    }
}