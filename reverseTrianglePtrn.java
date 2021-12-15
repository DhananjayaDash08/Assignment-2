package Geekster_Test;

import java.util.Scanner;

public class reverseTrianglePtrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int num= sc.nextInt();
		int i, j;
        for(i=1; i<=num; i++)
        {
        	for(j=5; j>=i; j--)
        	{
        		System.out.print('*');
        	}
        	System.out.println();
        }

	}

}
