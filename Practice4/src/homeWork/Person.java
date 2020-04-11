package homeWork;

public abstract class Person {
	private String personName;
	
	public Person(String personName)
	{
		this.personName = personName;
	}
	
	public String GetPersonName()
	{
		return personName;
	}
	
}
