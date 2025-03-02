package week2day4;

public interface Rbi 
{
	//abstract method --> Unimplemented methods or hidden methods
	
	//Unimplemented methods
	public void kyc();
	
	//Unimplemented methods
	public void Withdraw();
	
	// if we implements this interface by any other class - 
	//then that class should have implement all the unimplemented methods in this interface
	
	// for example , in the above lines - we have two umimplemented methods ---And i have two more classes which were implementing the Rbi interface
	
	
	// Added the below method in the middle to ensure that class which implemens this interface were throwing error Error because 
	// of the absence of the below methods in them
	public void add();
	
	//declaring and initialising the below variable - to show that interface can hvae their own variable (which can be overridden)
	String pancard = "ABCD1234";
	
	
	// Till Java 1.7 ---> Abstraction is 100% in Interface , that means all should be unimplemented methods (empty methods without any actions inside)
	//But from Java 1.8 --> we can declare implemented methods also . Need not to be 100% abstract
	// Method should be either static or default as follows
	
	
	static void atmPayment() {
		System.out.println("Transaction limit is 20000rs per day");
		
		// why there is no main method available here
		//Because we cannot create the object for Interface
		
	}
	
	
	public void internetBanking();
	
	// if we see the Hdfcbank and Icicibank - bothof them were normal classes - And so they have to implement all the unimplemented classes in Rbi interface
	
	
	// But we are having other option called ABSTRACT class, 
	// and there is no compulsion for static class to derive all the unimplemented methods
	
	// so let me create a separate abstract class called HdfcHq which implements Rbi interface  
	

}
