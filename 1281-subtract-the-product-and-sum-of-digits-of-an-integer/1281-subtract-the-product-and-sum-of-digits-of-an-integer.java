class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int prod=1;
        int sum=0;
        while(n!=0){
            int rem=n%10;
             prod *=rem;
            n=n/10;
        }
        n=temp;
        while(n!=0){
            int rem=n%10;
            sum  +=rem;
            n=n/10;
        }
        return (prod-sum);
    }
}