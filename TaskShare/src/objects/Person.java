package objects;

public class Person implements Comparable<Person> {
	
	String username;
	String name;
	int phoneNumber;
	String email;
	
	// TODO: figure out how to put a picture with a person
	
	public Person(String username, String name) {
		this.name = name;
	}
	
	public Person(Person person) {
		name = person.name;
	}
	
	@Override
	public int compareTo(Person rhs) {
		return name.compareTo(rhs.name);
	}
}
