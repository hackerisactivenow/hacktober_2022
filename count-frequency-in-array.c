#include<stdio.h>
int main(){
    int a[50];
    int i,x,n,count;
    printf("enter the size of array",i+1);
    scanf("%d",&n);
    for (i = 0; i < n; i++)
    {
        printf("enter the %d element of the array ");
        scanf("%d",&a[i]);
    }
    printf("enter the elemnt which frequency calculated");
    scanf("%d",&x);
    for (i = 0; i < n; i++)
    {
        if (x==a[i])
        {
            count+=1;
        }  
    }
    printf("the frequency of %d in this array is %d ",x,count);  
    return 0;
}