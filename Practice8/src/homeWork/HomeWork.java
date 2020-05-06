package homeWork;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args)
	{
		AddInterface ai;
		
		System.out.println("* 람다식 활용 *");
		
		ai = () -> {
			int number1 = 0;
			int number2 = 0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("두 정수 입력 --> ");
			number1 = scan.nextInt();
			number2 = scan.nextInt();
			
			System.out.println(String.format("%d + %d = %d", number1, number2, number1 + number2));
		};
		ai.add();
		
		ai = () -> {
			int number = 0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("합의 범위 --> ");
			number = scan.nextInt();
			
			int sum = 0;
			for(int index = 1; index <= number; index++)
			{
				if(index % 2 == 0)
				{
					sum += index;
				}
			}
			System.out.println(String.format("%d 부터 %d 까지 짝수의 합: %d", 1, number, sum));
		};
		ai.add();
	}
}
