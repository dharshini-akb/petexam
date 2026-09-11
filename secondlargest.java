import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
    int secondlargest=0;
    int largest=0;
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]>largest)
        {
            secondlargest=largest;
            largest=arr[i];
        }
        if(arr[i]>secondlargest && arr[i]!=largest)
        {
            secondlargest=arr[i];
        }
    }
    System.out.println(largest+" ");
    System.out.println(secondlargest+" ");
    }
    
}