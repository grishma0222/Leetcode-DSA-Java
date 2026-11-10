class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        int max=Arrays.stream(salary).max().getAsInt();
        int min=Arrays.stream(salary).min().getAsInt();
       double sum=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(salary[i]!=max && salary[i]!=min){
                sum +=salary[i];
                c++;
            }
        }
        double res=(double) sum/c;
        return res;
    }
}