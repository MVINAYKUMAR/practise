import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedPar {

    // Complete the isBalanced function below.
  
    
    
    static String isBalanced(String s)
    {
       int top=-1;
          char stack[];
       char a[]=s.toCharArray();
        int f=0;
        stack=new char[a.length];
        for(int i=0;i<a.length;i++)
        {
            
            if(a[i]=='(' || a[i]=='{' || a[i]=='[')
            {
                stack[++top]=a[i];
            }
            if(a[i]==')' || a[i]=='}' || a[i]==']')
            {
                
                if(top==-1)
                {
                    f=0;
                    break;
                }
                
                char c=stack[top--];
                if((c=='(' && (a[i]==')')) || (c=='{' && (a[i]=='}')) || (c=='[' && (a[i]==']')))
                {
                    f=1;
                }
                   else
                   {
                       f=0;
                       break;
                   }
            }
            
           
            }
    
                   if(f==1 && top==-1)
                   {
                       return "YES".toString();
                   }
                   else
                   return "NO".toString();
                   }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter());

        int t = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.next();

            String result = isBalanced(s);
System.out.println(result);
          
        }

       

        scanner.close();
    }
}
