#include<stdio.h>
int front=-1;
int rear=-1;
int queue[100];
void push(int data)
{
    if(front==-1)
    {
        front=0;
    }
    queue[++rear]=data;
}
void pop()
{
    if(front==-1||front>rear)
    {
        return;
    }
    front++;
    if(front>rear)
    {
        front=-1;
        rear=-1;
    }
}
int peek()
{
    if(front>rear||front==-1)
    {
       return 0; 
    }
  return queue[front];  
}

int main()
{
    int o;
    scanf("%d",&o);
    int p=0;
    while(o-->0)
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
    if(front==-1)
    {
        printf("Empty\n");
        return 0;
    }
    if(p!=0)
    {
       printf("%d\n",p); 
    }
    while(front<=rear)
    {
        if(front==rear)
        {
            printf("%d\n",queue[front]);
            return 0;
        }
        printf("%d->",queue[front]);
        front++;
    }
    
}