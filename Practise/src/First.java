import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
class First{
	int ex(int n)
	{
		int r=0;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				for(int k=1;k<=j;k++)
					r=r+1;
			}
		}
		return r;
	}
	public static void main(String arg[]) {
		First f=new First();
		String a="this is vinay";
		String b[]=a.split(" ");
		for(int i=b.length-1;i>=0;i--)
			System.out.print(b[i]+" ");
		//System.out.println(f.ex(2));
		
		 
		
			 
           
	    }
	
}
