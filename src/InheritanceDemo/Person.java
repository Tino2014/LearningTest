package InheritanceDemo;

public class Person {
	private String name;
	
	public Person( String n ) {
		this.name = n;
		System.out.println("#1 ");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String s) {
		name = s;
	}
}
