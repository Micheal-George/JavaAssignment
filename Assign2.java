package com.day1;

public class Assign2 {

	
	public static void main(String[] args) {
		
		int num=1;
		String bag="";
			for(int i=1;i<=num;i++)
				{
				if(num%i==0)
					
					{if(i==num)
						bag=bag+i;
			
					else
						bag=bag+i+",";	
					}
		}
			
		if(num>=2&&num<=100)
			System.out.println(bag);	
		else
			System.out.println("Invalid Number");	
	}
}
