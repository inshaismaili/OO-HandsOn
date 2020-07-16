public class SwapData {
	private String arg1;
	private String arg2;

	public void swapValues() {
       String temp;
       temp=arg1;
       arg1=arg2;
       arg2=temp;
	//Logic to swap values
	
	}

	public void displayValues(String str) {
    System.out.println(str);
    System.out.println("Value1:"+arg1);
    System.out.println("Value2:"+arg2);
    //Display string message with values of arg1 and arg2

	}
  
	public void  setArg1(String arg1) {
		this.arg1=arg1;
	}
	public void  setArg2(String arg2) {
		this.arg2=arg2;
	}
	public String getArg1() {
		return arg1;
	}
	public String getArg2() {
		return arg2;
		// Create setter and getter methods 

}}
