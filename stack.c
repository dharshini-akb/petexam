#include<stdio.h>
int stack[100];
int top=-1;
void push(int data)
{
    
   top++;
   stack[top]=data;
    
}
void pop()
{
    if(top==-1)
    {
        return;
    }
    top--;
}
int peek()
{
    if(top==-1)
    {
        return 0;
    }
   return stack[top];
}
int main()
{
    int operations;
    int p=0;
    scanf("%d",&operations);
    while(operations-->0)
    {
        int n;
        scanf("%d",&n);
        if(n==1)
        {
            int data;
            scanf("%d",&data);
            push(data);
        }
        else if(n==2)
        {
            pop();
        }
        else
        {
            p=peek();
        }
    }

if(top==-1)
{
    printf("empty\n");
    return 0;
}
if(p!=0)
{
    printf("%d\n",p);
}
while(top!=-1)
{
    if(top==0)
    {
        printf("%d\n",stack[top]);
        return 0;
    }
    else
    {
        printf("%d->",stack[top]);
        top--;
    }
}
}






