class Solution {
    public int myAtoi(String s) {
        int i=0;
   int sign=1;
   int n=s.length();
  for(;i<n && s.charAt(i)==' ';i++);
    if(i<n && s.charAt(i)=='-')
    {
        sign=-1;
        i++;
    }
    else if(i<n && s.charAt(i)=='+')
    {
            i++;
    }
    long num=0;
for(;i<n;i++){
    char ch=s.charAt(i);
    if(ch<'0' ||ch>'9'){
        break;
    }
    int digit=ch-'0';
    num =num*10+digit;
    if(sign==1 && num>Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
    }
    if(sign==-1 && -num<Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
    }
}
  return (int)(num*sign);
    }
}
