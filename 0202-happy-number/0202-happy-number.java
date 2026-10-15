class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set=new HashSet<>();
       while(n!=1)
       {
        if(set.contains(n))
        {
            return false;
        }
        set.add(n);
        int temp=n;
        int sum=0;
        while(temp!=0){
           int rem=temp%10;
            sum +=Math.pow(rem,2);
            temp=temp/10;
        }
        n=sum;
       } 
       return true;
    }
}