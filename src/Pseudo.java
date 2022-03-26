
public class Pseudo {
	

public static void main(String[] args) {
	Student account1= new Student("Jane Green", 93.5);
	Student account2= new Student("John Blue",72.75);

   System.out.println(account1.getName()+","+ "Grade "+account1.getLetterGrade());
   System.out.println(account2.getName()+","+ "Grade "+ account2.getLetterGrade());
   
   System.out.printf("%s's letter grade is: %s%n",
		   account1.getName(),account1.getLetterGrade());
}




}
