import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt();
        int height[]=new int[w];
        for(int i=0;i<w;i++)
        {
            height[i]=sc.nextInt();
        }
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int max=-1;
        for(int i=0;i<n;i++ )
        {
            if(height[i]>=max)
            {
                max=height[i];
            }
            left[i]=max;
        }
         max=-1;
        for(int i=n-1;i>=0;i--)
        {
            if(height[i]>=max)
            {
                max=height[i];
            }
            right[i]=max;
        }
        int total=0;
        for(int i=0;i<n;i++)
        {
            total=total+Math.min(left[i],right[i])-height[i];
        }
        System.out.print(total);
    }
}