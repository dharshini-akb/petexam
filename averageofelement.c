#include<stdio.h>
int main()
{
    int arr[100];
    int n;
    int sum=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    double avg =(double)sum/n;
    printf("%lf",avg);
}