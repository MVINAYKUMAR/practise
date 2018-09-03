import java.util.*;
public class LawnTest {
	public static int N=4;
	
public static void main(String[] arg)
{
	  
	  double arr[];
	  arr=new double[N];
	  
	  Lawn a=new Lawn();
	  Scanner sc = new Scanner(System.in);
	for(int i=1;i<=N;i++)
	{
		System.out.println("Enter Area of Lawn "+i+":");
		int area=sc.nextInt();
		double fee=a.lawnMovingFee(area);
		System.out.println("The Weekly fee of Lawn" + i +"is" +fee );
		arr[i-1]=fee;
	}
	int high=a.LawnNumber(arr);
	System.out.println("Lawn number with highest  monthly fee " +high);
	
	double sum=0;
	Arrays.sort(arr);
	for(int i=0;i<N;i++)
	       sum=sum+arr[i];
	double avg=sum/N;
	System.out.println("Total Weekely fee is "+sum);
	System.out.println("Lowest Weekely fee is "+ arr[0]);
	System.out.println("Highest Monthly fee is "+ arr[N-1]*4);
	System.out.println("Average Weekely fee is "+avg);
}
}
