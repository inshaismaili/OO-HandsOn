public class Cache {
	private static int MAX_CAPACITY = 0;
	
	// Implement static block
static {
	System.out.println("Enter initial max_capacity:");
	MAX_CAPACITY=Console.readInt();
}
	static int getMaxCapacity() {
		System.out.println("Returning MAX_CAPACITY");
		return MAX_CAPACITY;
	}
}
