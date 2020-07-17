public class Employee {
	private String Name;
	private double salary;
	private double allowance;
	private double basic;
	private double Hra;
	private String empId;
	Roles role = new Roles();
	// Identity variables of Employee 
	
	public void  setSalary(double salary) {
		this.salary=salary;
	}
	public void setAllowance(double allowance) {
		this.allowance=allowance;
	}
	public void setBasic(double basic) {
		this.basic=basic;
	}
	public void setHra(double Hra) {
		this.Hra=Hra;
	}
	public double getSalary() {
		return salary;
	}
	public double getAllowance() {
		return allowance;
	}
	public double getBasic() {
		
		return basic;
	}
	public double getHra() {
		return Hra;
	}
	public void setEmpId(String empId) {
		this.empId=empId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return Name;
		
	}

	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;

	 
	// Create getter and setter methods

	
}}





















