public class EmployeeReport {
	private String dtReport;
	
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}
	private void displayHeader() {
		printLine();
		System.out.print("EMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
	}
	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}
	public void display(Employee empArr[]) {
		displayHeader();
		
		// Complete the logic 	
		System.out.println("EMP_ID\tNAME\tROLE\t\tBASIC\tHRA\tALLOWANCE\tSALARY");
		for(int i=0;i<empArr.length;i++) {
			Employee emp = empArr[i];
			System.out.println(emp.getEmpId()+"\t"+emp.getName()+"\t"+RoleBuilder.getRoleDescription(emp.getRole().getRoleId())+"\t"+emp.getBasic()+"\t"+emp.getHra()+"\t"+emp.getAllowance()+"\t"+emp.getSalary());
		}
		
		displayFooter(empArr.length);
		
	}
	public void setDtReport(String dtReport) {
		this.dtReport = dtReport;
	}
	public String getDtReport() {
		return dtReport;
	}
}