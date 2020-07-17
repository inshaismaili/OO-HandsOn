public class Employee {
	private String Name;
	private double salary;
	private double allowedprc;
	private double basic;
	private double hra;
	private String empId;
	Roles role = new Roles();
	// Identity variables of Employee 
	public Employee(String Name,String emp_id,double basic,double hra,double allowedprc,int role_id){
		this.Name=Name;
		this.empId=emp_id;
		this.basic=basic;
		this.hra=hra;
		this.setAllowedprc(allowedprc);
		this.role.setRoleid(role_id);
		
	}
	public void  setSalary(double salary) {
		this.salary=salary;
	}
	public void setAllowance(double allowance) {
		this.allowedprc=allowance;
	}
	public void setBasic(double basic) {
		this.basic=basic;
	}
	public void setHra(double Hra) {
		this.hra=Hra;
	}
	
	public double getSalary() {
	 return SalaryCalculator.getSalary(this);
	}
	
	public double getAllowance() {
		return SalaryCalculator.getAllowance(this);
		}
	public double getAllowedprc() {
		return allowedprc;
	}
	
	public double getBasic() {
		
		return basic;
	}
	public double getHra() {
		return hra;
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
	public void setAllowedprc(double allowedprc) {
		this.allowedprc = allowedprc;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;


	 
	// Create getter and setter methods

	
}
}




















