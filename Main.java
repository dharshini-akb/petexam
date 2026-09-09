import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        char stack[]=new char[100];
        String s = sc.next();
        int top=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
        
        if(ch=='('||ch=='['||ch=='{')
        {
            top++;
            stack[top]=ch;
        }
        else if(ch==')'||ch=='}'||ch==']')
        {
            if(top==-1)
            {
                System.out.println("unbalanced");
                return;
            }
          char pop=stack[top];
            top--;
            if(ch==')'&& pop!='('||ch=='}'&& pop!='{'||ch==']'&&pop!='[')
            {
                System.out.println("unbalaned");
                return;
            }
        }
        }
        if(top==-1)
        {
            System.out.println("balanced");
            return;
        }
        else
        {
            System.out.println("unbalanced");
            return;
        
        }
        
    }
}