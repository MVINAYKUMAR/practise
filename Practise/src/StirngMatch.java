
public class StirngMatch {
	public static final int d=256;
	public void match(String pat,String txt,int q)
	{
		int p=0,t=0,h=1,m=pat.length(),n=txt.length(),j=0;
		for(int i=0;i<m-1;i++)
		{
			h=(h*d)%q;
		}
		for( int i=0;i<m;i++)
		{
			p=((p*d)+txt.charAt(i))%q;
			t=((t*d)+pat.charAt(i))%q;
		}
		
		for(int i=0;i<n-m;i++)
		{
			
			if(p==t)
			{
				
				for(j=0;j<m;j++)
				{
					if(pat.charAt(j)!=txt.charAt(i+j))
						break;
				}
				
				if(j==m)
				{
					System.out.println("match found at "+i);
				}
			}
			if(i<m-n)
			{
				t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+1))%q;
				if(t<0)
					t=t+q;
				System.out.println(t);
			}
		}
	}
public static void main(String arg[])
{
	StirngMatch a=new StirngMatch();
	String txt = "GEEKS FOR GEEKS";
    String pat = "GEEK";
    int q = 101; // A prime number
    a.match(pat, txt, q);
}

}
