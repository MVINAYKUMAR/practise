import java.util.*;

public class Dictionary {
	public String sort(String s)
	{
		char[] c=s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static void main(String arg[])
	{
		Dictionary d=new Dictionary();
		int i=1;
		HashMap<String,ArrayList<String>> hs=new  HashMap<String,ArrayList<String>>();
		Scanner scr=new Scanner(System.in);
		for(i=1;i<3;i++){
			String name=scr.nextLine();
			String s=d.sort(name);
			System.out.println(s);

			ArrayList<String> k=hs.get(s);
			System.out.println(k);
			if(k==null) k=new ArrayList<String>();
			k.add(name);
			hs.put(s, k);
			
			
		}
		Iterator it=hs.keySet().iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(hs.get(o));
		}
		System.out.println(hs);

		
	}

}
