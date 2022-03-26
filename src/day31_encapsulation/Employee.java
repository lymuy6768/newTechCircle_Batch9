package day31_encapsulation;

public class Employee {
	//instance variables
	private String name;
	private int age;
	private String ssn;
	private char gender;
	private String job_title;
	private double salary;
	private boolean isHourlyEmployee;
	private double rate;
	
	public Employee() {}
	
	
	
	
	
	public Employee(String name, int age, String ssn, char gender, String job_title, double salary,
			boolean isHourlyEmployee, double rate) {
		
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.gender = gender;
		this.job_title = job_title;
		this.salary = salary;
		this.isHourlyEmployee = isHourlyEmployee;
		this.rate = rate;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;//this name is instance variable above,=name is parameter
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getSSN() {
		return ssn;
	}
	public void setSSN(String ssn) {
		this.ssn=ssn;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title=job_title;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double calculationSalary() {
		double paycheck=0;
		if(isHourlyEmployee) {
			paycheck=rate*2080;
		}else {
			paycheck=salary;
		}return paycheck;
	}
	
	
	
	public String toString() {
        
        return "{ Employee \n\tname:"+name+""
                + "\n\tage:"+age+""
                        + "\n\tssn:"+ssn+""
                        + "\n\tgender:"+gender+""
                        + "\n\tjob title:"+job_title+""
                        + "\n\tSalary:$"+salary+""
                                + "}";
        
	}
}
