package homeWork;

public class Book {
	private String bookName;
	private int bookPrice;
	
	Book(String bookName, int bookPrice)
	{
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public String GetBookName()
	{
		return bookName;
	}
	
	public int GetBookPrice()
	{
		return bookPrice;
	}
}
