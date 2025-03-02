package week2day4;

public class Icicibank implements Rbi {

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		System.out.println("Pancard is mandate to create the ICICI bank account");

	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		System.out.println("For payment more than 10 lakhs,Pancard is must in ICICI");

	}

	public static void main(String[] args) {
		Icicibank icici = new Icicibank();
		icici.kyc();
		icici.Withdraw();
		icici.add();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition of new Account in ICICI");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
	}

}
