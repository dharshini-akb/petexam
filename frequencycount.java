import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(!list.contains(arr[i]))
            {
            list.add(arr[i]);
            }
        }
        
        for(int x:list)
        {
            int count=0;
            for(int i=0;i<n;i++)
            {
                
                  
                if(x==arr[i])
                {
                    count=count+1;
                }
                
            }
            System.out.println(x+" "+count);
        }
            
    }
}