import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            list.add(arr[i]);
        }
        while(true)
        {
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                int pos=sc.nextInt();
                int val=sc.nextInt();
                list.add(pos-1,val);
                break;
                case 2:
                pos=sc.nextInt();
                list.remove(pos-1);
                break;
                case 3:
                int key=sc.nextInt();
                if(!list.contains(key))
                {
                    System.out.println("elementnotfound");
                }
                else{
                    System.out.println("elementfound");
                }
                break;
                default:
                return;
                
            }
        }
        
    }
}