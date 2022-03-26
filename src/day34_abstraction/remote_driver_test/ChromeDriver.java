package day34_abstraction.remote_driver_test;

public class ChromeDriver extends RemoteDriver {
	
	private String url;
	
	public String geturl() {
		return this.url;
	}
	public void seturl(String url) {
		this.url=url;
		
	}

	@Override
	public void takeScreenShot(String imageName) {
		System.out.println("Taking screenshot on Chrome,  on "+ imageName + "page");
		
	}@Override
    public void get(String url) {
      //  this.url=url;
		seturl(url);
        System.out.println("Navigating to <"+url+" on chrome browser");
        
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting Chrome browser");
    }

}
