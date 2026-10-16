class Solution {
    public boolean checkPerfectNumber(int num) {
        long sum=1;
        if(num<=1){
            return false;
        }
       for(int i=2;i<=num/i;i++)
       {
        if(num%i==0)
        {
            sum +=i;
        
       
       if(i!=num/i)
       {
        sum +=num/i;
       } 
        }
       }
       return num==sum;
    }
}