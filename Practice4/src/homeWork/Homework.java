package homeWork;

import java.util.Scanner;

public class Homework {
	
	public static int GetChange(Book[] computerScienceBooks, String buyingBookName, int buyingBookPrice)
	{
		for(int index = 0; index < computerScienceBooks.length; index++)
		{
			if(computerScienceBooks[index].GetBookName().equals(buyingBookName))
			{
				if(computerScienceBooks[index].GetBookPrice() > buyingBookPrice)
				{
					return -1;
				}
				else
				{
					return buyingBookPrice - computerScienceBooks[index].GetBookPrice();
				}
			}
		}
		return -2;
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		Book javaBook = new Book("�ڹ�", 20000);
		Book jspBook = new Book("JSP", 21000);
		Book pythonBook = new Book("���̽�", 18000);
		Book cPlusPlusBook = new Book("C++", 22000);
		Book DBBook = new Book("DB", 17000);
		
		Book[] computerScienceBooks = new Book[] { 
				javaBook,
				jspBook,
				pythonBook,
				cPlusPlusBook,
				DBBook
		};
		
		Seller seller = new Seller("����ȯ", computerScienceBooks);
		seller.SayFirstComment();
		
		while(true)
		{
			String buyingBookName;
			int buyingBookPrice;
			
			System.out.print("å�̸��� �ݾ� �Է� ---> ");
			buyingBookName = scan.next();
			buyingBookPrice = scan.nextInt();
			
			int change = GetChange(computerScienceBooks, buyingBookName, buyingBookPrice);
			
			if(change == -2)
			{
				System.out.println(String.format("%s: ���� �̳�! �� ������ ���⼭ ���Ⱦ�!", seller.GetPersonName()));
				System.out.println(String.format("%så�� �������� �ʽ��ϴ�. �ش��ϴ� å�� �Է����ּ���.", buyingBookName));
			}
			else if(change == -1)
			{
				System.out.println(String.format("%s: ���� �̳�! �ٽ��ѹ� �Ž������� ���ڸ��⸸ �غ�!", seller.GetPersonName()));
				System.out.println(String.format("�ݾ��� �۾� %så�� ������ �� �����ϴ�.", buyingBookName));
				
			}
			else if(change >= 0)
			{
				System.out.println(String.format("%s: ���� �Ž����� �޾ư�!", seller.GetPersonName()));
				System.out.println(String.format("�Ž����� %d���� �޾Ҵ�!", change));
				break;
			}
		}
		
		System.out.println(String.format("%s: Do Come Back~", seller.GetPersonName()));
	}
}