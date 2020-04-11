
import java.util.Scanner;

public class HomeWorkOne 
{
	public static int GetSum(int[] scores)
	{
		int sum = 0;
		for(int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		return sum;
	}
	
	public static double GetAverage(int[] scores)
	{
		int sum = GetSum(scores);
		
		double average = sum / (double) scores.length;
		
		return average;
	}
	
	public static void main(String[] args)
	{
		int [] scores = new int[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("수 입력 -->");
		
		for(int i = 0; i < scores.length; i++)
		{
			scores[i] = scan.nextInt();
		}
		
		System.out.printf("합: %d \n", GetSum(scores));
		System.out.printf("평균: %g \n", GetAverage(scores));
	}
	

}
