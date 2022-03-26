package day34_abstraction.remote_driver_test;

public class FireFoxDriver extends RemoteDriver {

	public void takeScreenShot(String imageName) {
		
		System.out.println("Taking screenshot on FireFox,  on "+ imageName + "page");

	} @Override
	    public void get(String url) {
	        System.out.println("Navigating to "+ url+" on firefox");
	        
	    }

	    @Override
	    public void close() {
	     System.out.println("Closing firefox browser");
	    }

	    @Override
	    public void quit() {
	        System.out.println("quiting firefox browser");
	        
	    }

	

}
