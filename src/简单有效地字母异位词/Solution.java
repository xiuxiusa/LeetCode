package 简单有效地字母异位词;


import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}