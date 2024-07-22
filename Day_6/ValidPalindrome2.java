class Solution {
    public boolean validPalindrome(String s) {
        
        int si=0 , ei=s.length()-1;

        while(si <= ei){
            if(s.charAt(si) != s.charAt(ei)){
                return isPalindrome(s , si+1 , ei) || isPalindrome(s , si , ei-1);
            }

            si++;
            ei--;
        }

        return true;
    }

    public boolean isPalindrome(String s , int i , int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j))  return false;

            i++;
            j--;
        }

        return true;
    }
}