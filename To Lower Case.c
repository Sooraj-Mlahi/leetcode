char * toLowerCase(char * s){

     int n= strlen(s);
     for(int i=0;i<n;i++)
     {
         if(s[i]<97)
         {
             if(s[i]>=65 && s[i]<=90)
             {
                s[i]=s[i]+32;
             }
         }
     }

   return s;
 
}