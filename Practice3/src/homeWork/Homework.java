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
		System.out.print("원소 수 입력 ---> ");
		int arrayLength = scan.nextInt();
		
		return arrayLength;
	}
	
	public static void PushElementInArray(Scanner scan, int[] numbers)
	{
		System.out.print("계산할 숫자 입력 ---> ");
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
			
			System.out.println(String.format("합: %d", homeworkMath.GetSum()));
			System.out.println(String.format("평균: %f", homeworkMath.GetAverage()));
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
