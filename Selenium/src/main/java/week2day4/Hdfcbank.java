package week2day4;

public class Hdfcbank implements Rbi {

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		System.out.println("Pancard is mandate to create the bank account in HDFC Bank");

	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		System.out.println("For payment more than 10 lakhs,Pancard is must in HDFC Bank");

	}

	public static void main(String[] args) {
		Hdfcbank hdfc = new Hdfcbank();
		hdfc.kyc();
		hdfc.Withdraw();
		hdfc.add();
		hdfc.bankRate();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition of new Account in HDFC Bank");
	}

	//Creating the below method to make sure that class(which implements the interface) 
	//can also have their own methods in addition to that of which were declared in INTERFACE

	public void bankRate() {

		System.out.println("Interest rate will start from 10%");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
	}

}
