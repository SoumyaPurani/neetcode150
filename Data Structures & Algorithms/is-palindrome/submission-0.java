class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equalsIgnoreCase(reversed);
    }
}
