package homework;

import java.util.Scanner;

public class worksheet2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		int number = 10;
		double mile[] = new double[11];
		double kilo[] = new double[11];
		while(i<11)
		{
			mile[i] = number;
			number += 10;
			i++;
		}
		
		/*
		 * Exercise 1:
			Write a program that prints a conversion table from
		 	miles to kilometres,to an accuracy of two decimal places.
		 	The program should produce the following output.
		 */
		System.out.println("miles"+"\t\t"+"kilometres");
		for(i=0;i<mile.length;i++)
		{
			System.out.println((int)mile[i]+"\t\t"+(double)Math.round(mile[i]/0.6214*100)/100);
		}
		System.out.println();
		
		i = 0;
		number = 10;
		while(i<11)
		{
			kilo[i] = number;
			number += 10;
			i++;
		}
		
		/*
		 * Exercise 2:
			Modify the program so that it prints, after the table created in
			the previous exercise, a table that contains conversions from kilometres
			to miles to two decimal places. The table should look like the following.
		 */
		System.out.println("kilometres"+"\t\t"+"miles");
		for(i=0;i<kilo.length;i++)
		{
			System.out.println((int)kilo[i]+"\t\t\t"+(double)Math.round(kilo[i]*0.6214*100)/100);
		}
		System.out.println();
		
		/*
		 * Exercise 3:
			Modify your program so that the user can select what kind of
			conversion table must be printed. In the beginning your program
			should print the following text.
		 */
		char type;
		System.out.print("Pleas Input 'm' or 'k':");
		type = in.next().charAt(0);		
		if(type == 'm')
		{
			System.out.println("miles"+"\t\t"+"kilometres");
			for(i=0;i<mile.length;i++)
			{
				System.out.println((int)mile[i]+"\t\t"+(double)Math.round(mile[i]/0.6214*100)/100);
			}
		}
		else
		{
			System.out.println("kilometres"+"\t\t"+"miles");
			for(i=0;i<kilo.length;i++)
			{
				System.out.println((int)kilo[i]+"\t\t\t"+(double)Math.round(kilo[i]*0.6214*100)/100);
			}
		}
		System.out.println();
		
		/*
		 * Exercise 4:
			Modify your program, so the user can select the
			upper limit of the conversion table (up to a maximum of 10000). 
			Your program should print the following text.
			
		*  Exercise 5:
			Fully test your program. Include error checking, 
			so that if the user enters a wrong letter, or number, 
			the program tells the user they must enter the options again.
		 */
		int Maxbound;
		System.out.print("Please Input a Maxbound:");
		Maxbound = in.nextInt();
		while(Maxbound>10000)
		{
			System.out.println("Input Error! Pleas Input within 10000");
			Maxbound = in.nextInt();
		}
		System.out.print("Pleas Input 'm' or 'k':");
		in.nextLine();
		type = in.next().charAt(0);
		while(type != 'k' && type != 'm')
		{
			System.out.println("Input Error! Pleas Input 'm' or 'k'");
			type = in.next().charAt(0);
		}
		double miles[] = new double[Maxbound/10];
		double kilometres[] = new double[Maxbound/10];
		i = 0;
		number = 10;
		while(number<=Maxbound)
		{
			kilometres[i] = number;
			number += 10;
			i++;
		}
		i = 0;
		number = 10;
		while(number<=Maxbound)
		{
			miles[i] = number;
			number += 10;
			i++;
		}
		if(type == 'm')
		{
			System.out.println("miles"+"\t\t"+"kilometres");
			for(i=0;i<miles.length;i++)
			{
				System.out.println((int)miles[i]+"\t\t"+(double)Math.round(miles[i]/0.6214*100)/100);
			}
		}
		else
		{
			System.out.println("kilometres"+"\t\t"+"miles");
			for(i=0;i<kilometres.length;i++)
			{
				System.out.println((int)kilometres[i]+"\t\t\t"+(double)Math.round(kilometres[i]*0.6214*100)/100);
			}
		}
		System.out.println();
		
		in.close();
	
	}

}
