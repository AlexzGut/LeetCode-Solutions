class Solution {
    /*
    Using ASCII values to check alphanumeric characters and
    convert uppercase characters to lowercase characters when needed.
    runtime 1ms 
    Time Complexity O(N)
    */
    public boolean isPalindrome(String s) {
        int len = s.length();
        char[] chars = new char[len];
        int validChars = 0;
        // Checks the characters are alphanumeric
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if( ('a' <= c && c <= 'z') || ('0' <= c && c <= '9') ) {
                chars[validChars++] = c;
            // converts to lowercase
            } else if ('A' <= c && c <= 'Z') {
                chars[validChars++] = (char)(c + 32);
            }
        }
        //validate if the processed string is a palindrome
        for (int i = 0; i < validChars / 2; i++) {
            if (chars[i] != chars[validChars - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    /*
    // First approach using the built-in function regex.
    // runtime 13ms 
    public boolean isPalindrome(String s) {
        String regex = "\\W";
        String character = "";
        String str = s.replaceAll(regex, character);

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    */
    
}
