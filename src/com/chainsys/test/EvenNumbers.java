package com.chainsys.test;

public class EvenNumbers
{
	public static void main(String[] args)
	{
		EvenNumbers.evenNumbers();
		}

public static void evenNumbers()
{
	int i,remainder=0,temp;
	int number=1546903;
	temp=number;
	for(i=0;i<=temp;i++)
	{
		remainder=temp%10;
		if(remainder%2==0)
		{
			System.out.println(remainder);
			temp=temp/10;
		}
	}
  }
}



