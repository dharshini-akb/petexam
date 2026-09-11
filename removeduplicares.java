import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            
        if(!list.contains(x))
        {
            list.add(x);
        }
        }
        for(int x:list)
        {
            System.out.print(x+" ");
        }
    }
    
}