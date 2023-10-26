class AddArgs
{
	public static void main(String[] args)
	{
		if(args.length >= 2)
		{
			float sum = 0;             //int sum =0;
			for(int i = 0 ; i < args.length; i++)
			{
				sum = sum + Float.parseFloat(args[i]);  //sum=sum+Integer.parseInt(args[i])
			}
			System.out.println("addiion: " +sum);
		}
		else
		{
			System.out.println("minimum 2 arguments required");
		}
	}
}