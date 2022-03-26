package day34_abstraction.remote_driver_test;

public class TestCase102 {
/*TC102 validate login page title.*/
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDrive();
		String url= "www.techcircleschool.com";
		driver.get(url);
		
		String pageUrl= driver.getCurrentUrl();
		
	}
}
