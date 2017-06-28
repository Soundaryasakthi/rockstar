#include<stdio.h>
int main()
{
 int n,s[50],temp,i,j,k,count=0;
 scanf("%d",&n);
 for(i=0;n!=0;i++)
 {
  s[i]=n%10;
  n=n/10;
  count++;
 }
 for(i=0;i<count;i++)
 {
  for(j=i+1;j<count;j++)
  {
   if(s[i]>s[j])
   {
    temp=s[j];
    s[j]=s[i];
    s[i]=temp;
   }
  }
 }
 scanf("%d",&k);
 for(i=0;i<count-k;i++)
 {
  printf("%d",s[i]);
 }
    return 0;
}
