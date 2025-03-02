package week2day4;

public class ConcreteClass extends HdfcHq {

	// since this is a normal class which extends the abstract class and
	// (indirectly) Rbi interface - it has to use all the unimplemented methods of
	// Rbi Interface and HdfcHq abstract class as follows

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		System.out.println("Mandatory");

	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		System.out.println("20000 per transaction");

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("New customer addition");

	}

	@Override
	void creditCardLimit() {
		// TODO Auto-generated method stub
		System.out.println("5 lakhs is the new limit");

	}

	public static void main(String[] args) {
		ConcreteClass CC = new ConcreteClass();
		CC.kyc();
		System.out.println("Pancard we declared in Rbi Interface:  " + pancard);
		CC.internetBanking();

	}

}
