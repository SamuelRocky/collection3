package collection3;

public class Staff {
	private int id;
	private String name;
	private int age;
	private int salary;
	private boolean isMale;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Staff(int id, String name, int age, int salary, boolean isMale) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isMale = isMale;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", isMale=" + isMale
				+ "]";
	}
	
	

}
