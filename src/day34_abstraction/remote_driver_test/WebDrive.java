package day34_abstraction.remote_driver_test;

public interface WebDrive {

	void get(String url);
	void close();
	void quit();
	String getCurrentUrl();
	String getTitle();
}
