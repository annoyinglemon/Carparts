public class Person{
	
	private String name;
	private int age;

	public Person(){
	name = "No name yet";

	age = 10;

	}
	public Person(String initialName, int age){
	this.name = initialName;
	this.age = age;
	}
	public void setName(String newName){	//mutator method (always void)
	name = newName;
	}
	public String getName(){
	return name;
	}
	public int getAge(){
	return age;
	}
	public void writeOutput(){
	System.out.println("Name: " + this.name);
	System.out.println("Age: " + this.age);
	System.out.print("Final phase");
	}
	public boolean samePerson(Person otherPerson){
	return(this.name.equalsIgnoreCase(otherPerson.name) && this.age==otherperson.age);
	}
	}