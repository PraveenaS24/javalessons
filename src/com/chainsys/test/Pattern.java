package com.chainsys.test;

public class Pattern {

	public static void main(String[] args) {
	Pattern.triangle();
}
public static void triangle()
{
	int countA=0;
	for(countA=1;countA<=9;countA++)
	{
		for(int countB=10;countB>countA;countB--)
		{
			System.out.print(".");
		}
		for(int countC=countA;countC>=1;countC--)
		{
			System.out.print(countC);
		}
		for(int countD=2;countD<=countA;countD++)
		{
			System.out.print(countD);
		}
		System.out.println();
	}
}
}