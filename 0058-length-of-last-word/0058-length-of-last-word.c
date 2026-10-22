int lengthOfLastWord(char* s) {
    int c=0,i,l;
    l=strlen(s);
    for(i=l-1;i>=0;i--)
    {
        if(s[i]!=' ')
        {
            c++;
        }
        else
        {
            if(c>0)
            {
                break;
            }
        }
    }
    return c;

}