package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	public Employee(Integer id, String name, Double salary) {
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		salary=salary*(1+percentage/100);
	}
	public String toString() {
		return id+", "+name+", "+String.format("%.2f", salary);
	}
	
	
}
