package homeWork;

import java.util.Scanner;
/*
public class Homework {
	public static class HomeworkMath
	{
		private static int[] numbers;
		
		HomeworkMath(int[] numbers)
		{
			this.numbers = numbers;
		}
		
		public static int GetSum()
		{
			int sum = 0;
			for(int index = 0; index < numbers.length; index++)
			{
				sum = sum + numbers[index];
			}
			return sum;
		}
		
		public static double GetAverage()
		{
			int sum = GetSum();
			double average = sum / (double) numbers.length;
			return average;
		}
		
		public static void PrintElements()
		{
			for(int index = 0; index < numbers.length; index++)
			{
				System.out.println(numbers[index]);
			}
		}
	}
	
	public static int GetArrayLength(Scanner scan)
	{
		System.out.print("���� �� �Է� ---> ");
		int arrayLength = scan.nextInt();
		
		return arrayLength;
	}
	
	public static void PushElementInArray(Scanner scan, int[] numbers)
	{
		System.out.print("����� ���� �Է� ---> ");
		for(int index = 0; index < numbers.length; index++)
		{
			numbers[index] = scan.nextInt();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		try
		{
			int arrayLength = GetArrayLength(scan);
			int[] numbers = new int[arrayLength];
			
			PushElementInArray(scan, numbers);
			
			HomeworkMath homeworkMath = new HomeworkMath(numbers);
			
			System.out.println(String.format("��: %d", homeworkMath.GetSum()));
			System.out.println(String.format("���: %f", homeworkMath.GetAverage()));
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("[-] Fail to execute...");
		}
		finally 
		{
			System.out.println("Shutdown this project...");
		}
	}
}
*/