public class Person{
	
	private String name;

	public Person(){
	name = "No name yet";
	age = 10;
	}
	public Person(String initialName){
	name = initialName;
	}
	public void setName(String newName){	//mutator method (always void)
	name = newName;
	}
	public String getName(){
	return name;
	}
	public void writeOutput(){
	System.out.println("Name: " + name);
	}
	public boolean sameName(Person otherPerson){
	return(this.name.equalsIgnoreCase(otherPerson.name));
	}
	}