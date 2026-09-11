import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
       while(true)
       {
           int x =sc.nextInt();
           if(x==-1)
           {
               break;
           }
          
           if(!list.contains(x))
           {
           list.add(x);
           }
           
       }
       for(int x:list)
       {
           System.out.println(x);
       }
    }
}
