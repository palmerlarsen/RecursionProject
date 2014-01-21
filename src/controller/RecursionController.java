package controller;

public class RecursionController
{

	private int factorial(int currentNumber)
	{
		int factValue= 0;
		if(currentNumber >= 0)
		{
			if(currentNumber <=1)
			{
				return 1;
			}
			else
			{
				return factorial(currentNumber - 1) * currentNumber ;
			}
		}
		return factValue;
	}
	
	public void start()
	{
		for(int count = 0; count < 80; count++)
		{
			System.out.println(factorial(count));
		}
		
		
		System.out.println(factorial(5));
	}
	
}
