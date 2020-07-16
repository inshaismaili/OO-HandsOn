public class TestMain {
	public static void main(String[] args) {
		SwapData obj = new SwapData();

		
  System.out.println("Enter value of  arg1:");
 String arg1=Console.readLine();
 System.out.println("Enter value of args2:");
 String arg2=Console.readLine();
//Read values of arg1 and arg2 from Console

       obj.setArg1(arg1);
       obj.setArg2(arg2);
// Call set methods of SwapData object

		obj.displayValues("Before Swapping...");

		obj.swapValues();

		obj.displayValues("After Swapping...");
	}
}
