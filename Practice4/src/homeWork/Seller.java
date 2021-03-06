package homeWork;

public class Seller extends Person {
	private Book[] sellerBooks;
	
	Seller(String sellerName, Book[] sellerBooks)
	{
		super(sellerName);
		this.sellerBooks = sellerBooks;
	}
	
	public void SayFirstComment()
	{
		System.out.println(String.format("%s: �ȳ��ϽŰ� ������! �ѹ� ���� å�� ��󺸰�!", GetPersonName()));
		System.out.println(" ***** å ����Ʈ *****");
		System.out.println(String.format("%s%20s%11s%20s%11s", 
			sellerBooks[0].GetBookName(),
			sellerBooks[1].GetBookName(),
			sellerBooks[2].GetBookName(),
			sellerBooks[3].GetBookName(),
			sellerBooks[4].GetBookName()
		));
		System.out.println(String.format("%d%10d%11d%11d%12d", 
			sellerBooks[0].GetBookPrice(),
			sellerBooks[1].GetBookPrice(),
			sellerBooks[2].GetBookPrice(),
			sellerBooks[3].GetBookPrice(),
			sellerBooks[4].GetBookPrice()
		));
	}
	
	public Book[] GetSellerBooks()
	{
		return sellerBooks;
	}
}
