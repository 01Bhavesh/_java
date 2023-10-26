class Table
{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i <= 10; i++)
		{
			int x = num * i;
			System.out.println(" "+num+" * "+i+" = " +x);
		}
	}
}