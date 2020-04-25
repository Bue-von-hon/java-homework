package homeWork;

public class SportsCar extends Car 
{
	String name;
	
	SportsCar(int speed, String kind, String name)
	{
		super(speed, kind);
		this.name = name;
	}
	
	public String GetCarOwnerName()
	{
		return name;
	}
	
	public void Print()
	{
		System.out.println(String.format("%d%15s%45s", GetCarSpeed(), GetCarKind(), GetCarOwnerName()));
	}
}
