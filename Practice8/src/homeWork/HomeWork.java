package homeWork;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args)
	{
		AddInterface ai;
		
		System.out.println("* ���ٽ� Ȱ�� *");
		
		ai = () -> {
			int number1 = 0;
			int number2 = 0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("�� ���� �Է� --> ");
			number1 = scan.nextInt();
			number2 = scan.nextInt();
			
			System.out.println(String.format("%d + %d = %d", number1, number2, number1 + number2));
		};
		ai.add();
		
		ai = () -> {
			int number = 0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("���� ���� --> ");
			number = scan.nextInt();
			
			int sum = 0;
			for(int index = 1; index <= number; index++)
			{
				if(index % 2 == 0)
				{
					sum += index;
				}
			}
			System.out.println(String.format("%d ���� %d ���� ¦���� ��: %d", 1, number, sum));
		};
		ai.add();
	}
}
