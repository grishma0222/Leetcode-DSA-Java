class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
      s=s.replaceAll("[^a-z0-9]","");
      int n=s.length();
      int i=0;
      int j=n-1;

    while(i<j)
     {
        if(s.charAt(i)!=s.charAt(n-1-i))
        {
            return false;
        }
        i++;
        j--;
     }
     return true;
    }
}