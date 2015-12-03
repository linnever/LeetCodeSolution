/*Valid Anagram 
Given two strings s and t, write a function to determine if t is an anagram of s.
For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:

You may assume the string contains only lowercase alphabets.*/

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int[] alphabet =new int [26];
        for(int i = 0; i< s.length();i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}


//sort
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == t || s.equals(t)) 
        {
        return true;
        }
    char[] sArray = s.toCharArray();
    Arrays.sort(sArray);
    String sortedS = new String(sArray);
    char[] tArray = t.toCharArray();
    Arrays.sort(tArray);
    String sortedT = new String(tArray);
    return sortedS.equals(sortedT);  
    }
}