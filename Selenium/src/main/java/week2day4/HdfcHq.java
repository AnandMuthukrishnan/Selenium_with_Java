package week2day4;

public abstract class HdfcHq implements Rbi{
	
	// overriding only one method from interface for sambiradaya(Tamil) purpose
	@Override
	public void internetBanking() {
		System.out.println("IB mandatory");
		
	}
	// it can have their own implemented methods as follows
	public void hqLocation()
	{
		System.out.println("Mumbai is the HeadQuarters");
	}
	// decalring one unimplemented method as follows
	
	abstract void creditCardLimit();
	
	// but we cannot create object for abstract class 
	// so we will be creating another class to extend this absract class ( which in turns extends the functionaility of the Rbi Interface as well)
	
	// That class is called Concrete Class

	

}
