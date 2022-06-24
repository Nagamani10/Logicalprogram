package Logicalprograming;

import java.util.Scanner;

public class fibonacciseries {
public static void main(String[] args) {
	int num1 = 0;
	int num2 = 1;
	int nextnum;
	int lengthOfSeries;
	System.out.println("Enter the lenght");
	Scanner sc = new Scanner(System.in);
	lengthOfSeries = sc.nextInt();
	for (int i = 0; i<lengthOfSeries; i++)
	{
		System.out.println(num1 +"");
		nextnum=num1+num2;
		num1=num2;
		num2=nextnum;
		}
}
}
