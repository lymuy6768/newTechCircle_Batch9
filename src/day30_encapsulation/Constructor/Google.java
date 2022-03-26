package day30_encapsulation.Constructor;

public class Google {

	public static void main(String[] args) {
		
		Employee Linda=new Employee("Linda","Manager",10010,100000);
		Linda.showInfo();
		
		Employee Jackie=new Employee("Jackie","Secretary",10011,50000);
		Jackie.showInfo();
		
		Employee Emily=new Employee("Emily","CEO",10012,300000);
		Emily.showInfo();
	}
	
	

}
