int romanToInt(char* s) {
    int res=0,pre=0,i,j;
    char roman[7]={'I','V','X','L','C','D','M'};
    int val[7]={1,5,10,50,100,500,1000};
    for(i=strlen(s)-1;i>=0;i--)
    {
        for(j=0;j<7;j++)
        {
            if(s[i]==roman[j])
            {
            if(val[j]<pre)
            {
               res=res-pre;
               pre=pre-val[j];
               res=res+pre;
            }
            else
            {
                res=res+val[j];
                pre=val[j];
            }
            }
        }
    }
    return res;
}