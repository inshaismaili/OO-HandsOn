public class EmployeeDemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		
		storeData(emp);
		
		showData(emp);
	}

	public static void storeData(Employee emp)  {
		System.out.println("Enter EmpId : ");
		String empId = Console.readLine();
		
		System.out.println("Enter Name : ");
		String name = Console.readLine();
		
		System.out.println("Address Line1 : ");
		String addrLine1 = Console.readLine();
		
		System.out.println("Address Line2 : ");
		String addrLine2 = Console.readLine();
		
		System.out.println("Address City : ");
		String city = Console.readLine();
		
		System.out.println("Address Pin : ");
		String pin = Console.readLine();
		
		Address adr=new Address();
		adr.setAddress1(addrLine1);
		adr.setAddress2(addrLine2);
		adr.setCity(city);
		adr.setpin(pin);
		
		emp.setEmpID(empId);
		emp.setAddr(adr);
		emp.setName(name);
		


	}
	public static void showData(Employee emp) {
		
		System.out.println("Emp Id : "+emp.getEmpId());
		System.out.println("Name : "+emp.getEmpName());
		System.out.println("--------------------------------------------");
		System.out.println("Addr Line1 : "+emp.getAddr().getAddrLine1());
		System.out.println("Addr Line2 : "+emp.getAddr().getAddrLine2());
		System.out.println("City : "+emp.getAddr().getCity());
		System.out.println("Pin : "+emp.getAddr().getPin());
		System.out.println("--------------------------------------------");

		


	}
}














