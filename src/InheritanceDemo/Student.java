package InheritanceDemo;


public class Student extends Person {
	private String name;
	
	public Student () {
		this("Student");
		System.out.println("#2 ");
	}
	
	public Student (String s) {
		super(s);
		setName("debug"); 
		
		System.out.println("#3 ");
	}
	
	public void setName() {
		name = "debug";
	}
	
	/* public String getName() {
		return name;
	}*/
	
}
