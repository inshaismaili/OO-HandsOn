public class ResultFinder {
	private int m1;
	private int m2;
	private int m3;
	
	public void setM1(int m1) {
		this.m1=m1;
	}
	public void setM2(int m2) {
	this.m2=m2;
	}
	public void setM3(int m3) {
		this.m3=m3;
	}
	public int getM1() {
		return m1;
	}
	public int getM2() {
		return m2;
	}
	
	public int getM3() {
		return m3;
	}
	// Create setter and getter methods 

	public void displayMarks() {
System.out.println("Enter mark1:"+getM1());
System.out.println("Enter mark2:"+getM2());
System.out.println("ENTER mark3:"+getM3());

	
	}
	public int getTotal() {
		int total=m1+m2+m3;
		return total;
//		complete the logic
	}
	public double getAverage() {
		double average=getTotal()/3.0;
		return average;
//		complete the logic
	}
	
public String getResult() {
	double average=getAverage();
	if (average>=80)
		return "GRADE A";
	else if(average<80 && average>=60)
		return "Grade B";
	else if(average>=40 && average<60)
		return "GRADE C";
	else 
		return "GRADE D";
		
//		complete the logic
	

	
}}
