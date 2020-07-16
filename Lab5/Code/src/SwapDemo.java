public class SwapDemo {
	static int arg1 = 100;
	static int arg2 = 200;
	public static void main(String[] args) {
	displayValues("Before Swapping...", arg1, arg2);
	swapValues();
	displayValues("After Swapping...",arg1,arg2);
	 // make call to swapValues() and displayValues()

	}

	public static  void swapValues() {;
	int temp = arg1;
	arg1=arg2;
	arg2=temp;
	           // Write logic to swap values

	}
	
	public static void displayValues(String str,int arg1, int arg2) {
		System.out.println(str);
		System.out.println("arg1 = " + arg1);
		System.out.println("arg2 = " + arg2);
	}
}