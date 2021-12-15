package Geekster_Test;

import java.util.Scanner;

public class numseriespattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int num= sc.nextInt();
		int i, j, count=0;
		for(i=1; i<=num; i++)
		{

			for(j=1; j<=i; j++)
			{
				count++;
				System.out.print(count+" ");			
			}
			System.out.println();
		}

	}

}
