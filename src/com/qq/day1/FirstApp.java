package com.qq.day1;

import java.util.Arrays;
import java.util.Scanner;

public class FirstApp 
{
	public static void main(String[] args) 
	{
		String sInput;
		
		Scanner sc = new Scanner(System.in);
		sInput = sc.nextLine();
		
		String[] aIns = sInput.split(" ");
		if(aIns.length>=3)
		{
			Integer[] aNums = new Integer[aIns.length-2];
		
			for(int i=0;i<aNums.length;i++)
			{
				try
				{
					aNums[i] = Integer.parseInt(aIns[i+2]);
				}
				catch(Exception e)
				{
					System.out.println("incorrect format");
				}
			}		
			Arrays.sort(aNums);
		
			if(aIns[1].equals("min"))
			{
				System.out.println("The min is "+aNums[0]);
			}
			else if(aIns[1].equals("max"))
			{
				System.out.println("The max is "+aNums[aNums.length-1]);
			}
			else
			{
				System.out.println("The input format is incorrect ");
			}
		}
		else
		{
			System.out.println("The input format is incorrect");
		}
	}

}
