class Solution {
    public boolean isPalindrome(String s) {
        String cleartext = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleartext.length() - 1;

        while (left < right) {
            if (cleartext.charAt(left) != cleartext.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
    }
}