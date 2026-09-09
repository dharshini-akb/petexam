#include<stdio.h>
int main()
{
    int n;
    int arr[100];
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    
    if(n%2==0)
    {
        printf("%d %d",arr[(n/2)-1],arr[n/2]);
    }
    else 
    {
        printf("%d",arr[n/2]);
    }
    
}