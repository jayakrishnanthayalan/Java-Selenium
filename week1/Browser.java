package week1;

public class Browser
{
	//to load the URL
	public void launchBrowser() {
		System.out.println("Browser launched Successfully");
	}
	
	//to load the browser
	public void loadUrl()
	{
		System.out.println("Application url loaded sucessfully");
	}
	
	public static void main(String[] args)
	{
		Browser b=new Browser();
		b.launchBrowser();
		b.loadUrl();
		
			
	} 

}
