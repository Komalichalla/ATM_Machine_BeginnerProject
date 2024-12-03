package atm;
import java.util.Scanner;

public class UserInterface {
   private static int status;
   public static void main(String[] args) {
	   
	AtmOperationImpl impl = new AtmOperationImpl();   
	Scanner scan = new Scanner(System.in);
	int atmnumber = 123456;
	int atmpin = 123;
	System.out.println("WELCOME TO THE ATM MACHINE");
	System.out.println("ENTER THE ACCOUNT NUMBER: ");
	int atmnumber2 = scan.nextInt();
	System.out.println("ENTER THE ATM PIN: ");
	int atmpin2 = scan.nextInt();
	
	if(atmnumber == atmnumber2 && atmpin == atmpin2) {
		while(true) {
		System.out.println(" 1.View avilable Balance.\n 2.Withdrawn Amount\n 3.Deposite Amount\n 4.View mini statement\n 5.Exit ");
		System.out.println("Enter the choice:");
		int ch = scan.nextInt();
		if (ch == 1) {
			impl.viewBalance();
		}
		else if (ch == 2) {
			System.out.println("Enter the amount to withdraw:");
			double withdrawn = scan.nextDouble();
			impl.withdrawAmount(withdrawn);
		}
		else if (ch == 3) {
			System.out.println("Enter the amount to deposit:");
			double depositAmount = scan.nextDouble();
			impl.depositAmount(depositAmount);
			
		}
		else if (ch == 4) {
			impl.viewMiniStatement();
		}
		else if (ch == 5) {
			System.out.println("Please collect your ATM card\n Thank you");
			System.exit(status);
		}
		else {
			System.out.println("Choose the options available");
		}
	}
	}
	else {
		System.out.println("INCORRECT ACCOUNT NUMBER OR PIN.");
	}
	
}
}
