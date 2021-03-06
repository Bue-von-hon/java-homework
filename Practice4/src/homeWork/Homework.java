/*
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
		
		Book javaBook = new Book("자바", 20000);
		Book jspBook = new Book("JSP", 21000);
		Book pythonBook = new Book("파이썬", 18000);
		Book cPlusPlusBook = new Book("C++", 22000);
		Book DBBook = new Book("DB", 17000);
		
		Book[] computerScienceBooks = new Book[] { 
				javaBook,
				jspBook,
				pythonBook,
				cPlusPlusBook,
				DBBook
		};
		
		Seller seller = new Seller("이유환", computerScienceBooks);
		seller.SayFirstComment();
		
		while(true)
		{
			String buyingBookName;
			int buyingBookPrice;
			
			System.out.print("책이름과 금액 입력 ---> ");
			buyingBookName = scan.next();
			buyingBookPrice = scan.nextInt();
			
			int change = GetChange(computerScienceBooks, buyingBookName, buyingBookPrice);
			
			if(change == -2)
			{
				System.out.println(String.format("%s: 옛끼 이놈! 그 물건은 여기서 안팔아!", seller.GetPersonName()));
				System.out.println(String.format("%s책은 존재하지 않습니다. 해당하는 책을 입력해주세요.", buyingBookName));
			}
			else if(change == -1)
			{
				System.out.println(String.format("%s: 옛끼 이놈! 다시한번 거스름돈이 모자르기만 해봐!", seller.GetPersonName()));
				System.out.println(String.format("금액이 작아 %s책을 구매할 수 없습니다.", buyingBookName));
				
			}
			else if(change >= 0)
			{
				System.out.println(String.format("%s: 여기 거스름돈 받아가!", seller.GetPersonName()));
				System.out.println(String.format("거스름돈 %d원을 받았다!", change));
				break;
			}
		}
		
		System.out.println(String.format("%s: Do Come Back~", seller.GetPersonName()));
	}
}
*/