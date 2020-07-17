public class DecimalSplitter {
	private static final double fraction = 0;

	 static boolean isOdd(int num) {
		return (num%2!=0);//Complete the logic
		
		}

	 static int getWhole(double  num) {
//Complete the logic
		return (int) num;
	}
	
static	double getFraction(double num) {
//Complete the logic
	double fraction = num - getWhole(num);
	return fraction;
	}
}









