// Name: Monisha Jain G.N
// Higher Qualification: MCA (Master of Computer Applications)
// College: PES Banglore
// github: https://github.com/jainmonisha17?tab=repositories


//  Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


// Input: s = "listen", t = "silent"
// Output: true

// Input: s = "rat", t = "car"
// Output: false

import java.util.*;

public class isAnagram {
    public boolean isAnagram(String s, String t) {

        // check if the lengths of both strings are equal, if not return false
        if(s.length() != t.length()) {
            return false;
        }

        // create hash map to store the frequency of characters in both the strings
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char currentCharS = s.charAt(i);
            int currentFreqS = freqMap.getOrDefault(currentCharS, 0);
            freqMap.put(currentCharS, currentFreqS + 1);


            char currentCharT = t.charAt(i);
            int currentFreqT = freqMap.getOrDefault(currentCharT, 0);
            freqMap.put(currentCharT, currentFreqT - 1);
        }

        // if all characters have a frequency of 0, this means that 't' is an anagram of 's'

        for(char ch: freqMap.keySet()) {
            if(freqMap.get(ch) != 0) {
                return false;
            }
        }
    return true;
    }

    public static void main(String[] args) {
        isAnagram obj = new isAnagram();

        // TEST CASE 1
        String s1 = "listen";
        String t1 = "silent";
        System.out.println(obj.isAnagram(s1, t1));

        // Test case 2
        String s2 = "hello";
        String t2 = "world";
        System.out.println(obj.isAnagram(s2, t2)); // Expected output: false

        // Test case 3
        String s3 = "anagram";
        String t3 = "nagaram";
        System.out.println(obj.isAnagram(s3, t3)); // Expected output: true

        // Test case 4
        String s4 = "rat";
        String t4 = "car";
        System.out.println(obj.isAnagram(s4, t4)); // Expected output: false

        // Test case 5
        String s5 = "";
        String t5 = "";
        System.out.println(obj.isAnagram(s5, t5)); // Expected output: true
  }
}


// Time Complexity
// The time complexity of this algorithm is , where  is the length of the strings. This is because the algorithm iterates over each character in the strings once and performs a constant amount of work for each character.

// Space Complexity
// The space complexity of this algorithm is , as the size of the hash map is proportional to the number of unique characters in the strings. In the worst case, all characters in the strings are unique, so the size of the hash map would be 26 (the number of letters in the alphabet).

// However, in most cases, the number of unique characters is much smaller than 26, so the space complexity is closer to , where  is the number of unique characters in the strings.

