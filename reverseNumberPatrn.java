package Geekster_Test;

import java.util.Scanner;

public class reverseNumberPatrn {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter num:");
			int num= sc.nextInt();
			int i, j;
			for(i=1; i<=num; i++)
			{
				int count=0;
				for(j=5; j>=i; j--)
				{
					count++;
					System.out.print(count+" ");			
				}
				System.out.println();
			}
		}
	}
