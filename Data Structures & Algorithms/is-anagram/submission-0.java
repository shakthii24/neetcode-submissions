class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arr = new int[26];
        boolean anagram = true;

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            arr[ch1 - 'a'] += 1;
            arr[ch2 - 'a'] -= 1;
        }

        for(int j : arr){
            if(j != 0){
                anagram = false;
                break;
            }
        }

        return anagram;
    }
}
