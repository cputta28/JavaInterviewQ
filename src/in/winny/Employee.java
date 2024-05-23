	package in.winny;

public class Employee {

	private int id;
	private String name;

	public Employee( int id, String name) {
	 this.id=id;
	 this.name=name;
	}
	public int getId() {return id;}
    public void setId(int id) {this.id=id;}
	public String getName() {return name;}
	public void  setName(String name) {this.name=name;}
	
	@Override
	public int hashCode(){
		return id;
	}
	@Override
	public boolean equals(Object object) {
		Employee employee=(Employee)object;
		return this.id==employee.getId()&&this.name.equals(employee.getName());
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		
		Employee employee=new Employee(101,"Raju");
		Employee employee2=new Employee(101,"Raju");
	
	System.out.println("is hashCode()same:"+(employee.hashCode()==employee2.hashCode()));
	
	System.out.println("is hashCode()same:"+(employee == employee2 ));

	System.out.println("is equals() same:"+(employee.equals(employee2)));
	
	/*
	 * Set<Employee>employees=new HashSet<>(); employees.add(employee);
	 * employees.add(employee2); System.out.println(employees);
	 */
	
	
	}
	
	
	
	
}
