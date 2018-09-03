public class Lawn

	{
	static int N=4;
	
	public Lawn()
	{
		
		
	}
		public double lawnMovingFee(double area)
		{
			
			double fee=0;
			if(area<500)
			{
				fee=40;
			}
			if(area>=500 && area<900)
			{
				fee=60;
			}
			if(area>=900 && area<1500)
			{
				fee=75;
			}
			if(area>=1500)
			{
				fee=100;
			}
			return fee;
		}
		public int LawnNumber(double fee[])
		{
			int high=0;
			for(int i=1;i<N;i++)
			{
				if(fee[i]>fee[high])
				{
					high=i;
				}
			}
		return high+1;
		
	}
}