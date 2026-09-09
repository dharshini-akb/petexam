import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
       
        int n;
        n=sc.nextInt();
         int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
      
        if(n%2==0)
        {
            double median=(double)(arr[n/2]+arr[(n/2)-1])/2.0;
            System.out.println(median);
        }
        else
        {
            System.out.println(arr[n/2]);
        }
    }
}