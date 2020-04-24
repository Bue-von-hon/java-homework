package homeWork;

public class Car implements CarController 
{
	private int speed;
	private String kind;
	
	Car(int speed, String kind)
	{
		this.speed = speed;
		this.kind = kind;
	}
	
	public void Print()
	{
		System.out.println(String.format("%s%d", kind, speed));
	}
	
	public int GetCarSpeed()
	{
		return speed;
	}
	
	public String GetCarKind()
	{
		return kind;
	}
}