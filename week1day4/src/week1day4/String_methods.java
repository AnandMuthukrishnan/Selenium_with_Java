package week1day4;

public class String_methods {
	public static void main(String[] args) {
		String test="TestLeaf";
				String test1="TestLeaf";
				String test2 = new String("TestLeaf");
				String test3 = new String("TestLeaf");
				if(test == test1)
				{
					System.out.println("Literally declared values were matching , as Java has assigned same memory for both the variables");
				}
				else {
					System.out.println("Literally declared values were not matching ");
				}
				
				
				if(test == test2)
				{
					System.out.println("Literally declared value and instantiated were matching , as Java has assigned same memory for both the variables");
				}
				else {
					System.out.println("Literally declared value and instantiated were not matching , as Java assign Heap space memory for instantaited value and String Constant memory for literal value");
				}
				
				
				if(test2 == test3)
				{
					System.out.println("Instantiated values were matching , as Java has assigned same memory for both the variables");
				}
				else {
					System.out.println("Instantiated values were not matching,because java assigns different Memory space");
				}
		
	}

}
