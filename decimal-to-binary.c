#include<stdio.h>
void dec_bin(int a);
void main(){
    int a;
    printf("enter the number : ");
    scanf("%d",&a);
    dec_bin(a);
}
void dec_bin(int a){
 int r[20];
 int i,j,rem;
 i=0;
  while(a!=0){
    rem=a%2;
    a=a/2;
    r[i]=rem;
    ++i;
  }
  for (j=i-1;j>=0;--j)
  printf("%d",r[j]);
}