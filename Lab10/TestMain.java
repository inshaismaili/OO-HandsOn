public class TestMain {
	public static void main(String[] args) {
		
	// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		
		
		Employee employees[] = new Employee[4];
		for(int i=0;i<employees.length;i++) {
			System.out.println("\nFor Employee: "+(i+1));
			Roles r = new Roles();
	// Assign objects of Employee to employees declared above
	
			String empId,name;
			int roleId;
			double basic, hra,allowedprc;
			System.out.println("Name:");
			name = Console.readLine();
			System.out.println("EmpId:");
			empId = Console.readLine();
			System.out.println("RoleId:");
			roleId = Console.readInt();
			System.out.println("Basic:");
			basic = Console.readDouble();
			System.out.println("Allowedercentage:");
			allowedprc = Console.readDouble();
			System.out.println("HRA:");
			hra = Console.readDouble();
			employees[i] = new Employee(name, empId, basic, hra, allowedprc, roleId);
		}

	// Assign objects of Employee to employees declared above
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport empReport = new EmployeeReport();
		empReport.setDtReport(dtReport);
	// Invoke display() method by passing the employee array
		
		empReport.display(employees);
		
	}		
}








		


















