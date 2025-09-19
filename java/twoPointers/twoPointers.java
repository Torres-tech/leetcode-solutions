class Solution {
    public boolean isPalindrome(String s) {

        int i = 0 , j = s.length() -1;
        while (i<j) {

             // skip non-alphanumeric on the left
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            // skip non-alphanumeric on the right
            while(j>i && !Character.isLetterOrDigit(s.charAt(j))) j--;


            
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
            return false;
            i++;
            j--;
        } return true;
    }
}
