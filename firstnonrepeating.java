import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
     String s=sc.next();
    
    
   int freq[]=new int[26];
   for(int i=0;i<s.length();i++)
   {
       freq[s.charAt(i)-'a']++;
   }
   int answer=-1;
   for(int i=0;i<s.length();i++)
   {
       
       if(freq[s.charAt(i)-'a']==1)
       {
          answer=s.charAt(i);
          break;
       }
   }
   if(answer==-1)
   {
       System.out.println("-1");
   }
   else
   {
       System.out.println((char)answer);
   }
    }
    
}