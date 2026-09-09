import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int currentsum=0;
        int temp;
        int maxsum=Integer.MIN_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            temp=arr[i]+currentsum;
            if(temp>arr[i])
            {
                currentsum=temp;
            }
            else{
                currentsum=arr[i];
            }
        
        if(currentsum>maxsum)
        {
            maxsum=currentsum;
        }
        }
        System.out.println(maxsum);
    }
}