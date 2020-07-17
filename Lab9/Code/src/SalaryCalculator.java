public class SalaryCalculator {
	public static double getSalary(Employee emp) {
		double salary = 0.0;
		emp.setSalary(salary = emp.getHra() + emp.getBasic() + emp.getAllowance());
	// Complete the logic
		
		return salary;
	}
	public static double getAllowance(Employee emp) {
		double allowance = 0.0;

	// Complete the logic
allowance=emp.getBasic()*emp.getAllowance()*0.01;
		return allowance;
	}
}
