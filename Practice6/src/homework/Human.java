package homework;

public class Human {
	private String name;
	private String[] rockScissorsPaper = {"����", "����", "��"}; 
	
	public Human(String name)
	{
		this.name = name;
	}
	
	public String GetHumanName()
	{
		return name;
	}
	
	public String GetRockScissorsPaper()
	{
		int index = (int)(Math.random()*3);
		return rockScissorsPaper[index];
	}
}
