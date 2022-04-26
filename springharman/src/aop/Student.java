package aop;

public class Student {
	int id;
	String name;
	int age;
	public int getId() {
		System.out.println("getting id");

		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		System.out.println("getting name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("getting age");

		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
