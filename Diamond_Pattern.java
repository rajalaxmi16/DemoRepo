package Patterns.programs;

public class Diamond_Pattern {

	public static void main(String[] args) 
	{
		int size=10;
		int mid=size/2+1;
		
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<=size; j++)
			{
				if(j==mid || j==size-mid+1)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			if(i<=size/2)
			{
				mid--;
			}
			else
			{
				mid++;
			}
			System.out.println();
		}


	}

}
