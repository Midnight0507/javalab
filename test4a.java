// 4. a. Given two strings text1 and text2, return the length of their longest common subsequence. A
// subsequence of a string is a new string generated from the original string with some characters
// (can be none) deleted without changing the relative order of the remaining characters. (eg, "ace"
// is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a
// subsequence that is common to both strings. If there is no common subsequence, return 0.

import java.util.Scanner;

class test4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int i = 0, j = 0, m = 0, c = 0;
        
        for (i = 0; i < s1.length(); i++) {
            for (j = m; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    c = c + 1;
                    m = j + 1;
                    break;
                }
            }
        }
        
        System.out.println("Length of longest substring: " + c);
    }
}

// EXPECTED OUTPUT:
// Sample Input:
// abcde
// actrse
// Sample Output: 3