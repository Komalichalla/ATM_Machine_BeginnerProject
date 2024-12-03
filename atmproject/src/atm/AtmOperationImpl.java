package atm;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class AtmOperationImpl implements AtmInterface {

	Atm atm = new Atm();
	Map<Double,String> ministmt = new HashMap<>();
	
	@Override
	public void viewBalance() {
	    System.out.println("Your Current available balance is : " +atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount <= atm.getBalance()) 
		{
		System.out.println("Amount withdrawn is : " +withdrawAmount);
		atm.setBalance(atm.getBalance() - withdrawAmount);
		ministmt.put(withdrawAmount, " Withdrawn Successfully !");
		viewBalance();
		}
		else 
		{
			System.out.println("Insufficient balance.");
		}	
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("Deposited Amount is : "+depositAmount);
		atm.setBalance(atm.getBalance() + depositAmount);
		ministmt.put(depositAmount, " Deposited Sucessfully !");
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		Set<Double> set = ministmt.keySet();
		for( Double d:set) {
			System.out.println(d +"="+ ministmt.get(d));
		}
		
	}

}
