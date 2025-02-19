package week1day2;

public class Browser 
{
	static void launchBrowser()
	{
		System.out.println("Browser launched successfully");
	}
	void loadurl()
	{
		System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
		Browser b = new Browser();
		b.launchBrowser();
		b.loadurl();
	}
}
