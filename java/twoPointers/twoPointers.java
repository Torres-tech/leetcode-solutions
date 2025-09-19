class Solution {
    public boolean isPalindrome(String s) {
        //create the left and right pointers
        int i = 0 , j = s.length() -1;
        while (i<j) {
             // skip non-alphanumeric on the left
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            // skip non-alphanumeric on the right
            while(j>i && !Character.isLetterOrDigit(s.charAt(j))) j--;
            //if left character is not the same at the right character, then return false
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
            return false;
            //if they are the same, keep moving
            abc xyz abc xyz
            i++;
            j--;
        } return true;
    }
}
