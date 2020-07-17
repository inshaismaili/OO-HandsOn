public class AccManager {
	public void fillAccountData(Account a1) {
	System.out.println("Enter accountno:");
	String Acc_NO=Console.readLine();
	System.out.println("Enter Name:");
	String Name=Console.readLine();
	System.out.println("Enter balance:");
	double balance=Console.readDouble();
	a1.setName(Name);
	a1.setBalance(balance);
	a1.setAccNo(Acc_NO);
	//Complete the statements

	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
