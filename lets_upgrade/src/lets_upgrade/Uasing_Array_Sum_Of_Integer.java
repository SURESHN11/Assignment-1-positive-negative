package lets_upgrade;

import java.util.Scanner;

public class Uasing_Array_Sum_Of_Integer {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int size = sc.nextInt();
	int [] a = new int[size];
	int sum = 0;
	System.out.println("Enter the element to the Array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Calculate the sum of the integer");
	for(int j=0;j<a.length;j++)
	{
		sum += a[j];	
	}
	System.out.println("sum of the integer :" + sum);
}
}
