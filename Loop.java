package com.simplilearn.Loop;

import java.util.Scanner;
public class Loop {

	public static void main(String args[])
	{
		int i=1;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
		for(i=11;i<=15;i++)
		{
			System.out.println(i);
		}
	}
	
}
