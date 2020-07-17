public class Employee {
 String empId;
 String empName;
 Address addr;
    
 public void setEmpID(String empId) {
	 this.empId=empId;
	 
 }
 public void setName( String empName) {
	 this.empName=empName;
 }
 public String getEmpId() {
	 return empId;
 }
 public String getEmpName() {
	 return empName;
 }
 public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
 
 class Association{
		public void main(String[] args)  {
			Employee emp=new Employee();
			Address addr=new Address();
			System.out.println(emp.getEmpId()+emp.getEmpName()+"is employee of"+addr.getAddrLine1()+addr.getAddrLine2());
		 
	 }
 }
 
 
 
 // Identity variables and methods. Create association with Address

}
