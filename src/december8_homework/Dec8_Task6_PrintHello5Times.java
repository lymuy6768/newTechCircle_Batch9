package december8_homework;

public class Dec8_Task6_PrintHello5Times {

	public static void main(String[] args) {
//			step1: print hello 5 times  (for loop)
//			step2: print your name
//			step3: print hello 5 times  (for loop)
//			step4: print your school name
//			step5: print hello 5 times   (for loop)

		Dec8_Task6_PrintHello5Times ph = new Dec8_Task6_PrintHello5Times();
		ph.printHello5Times();
		ph.displayAName("Ly Muy");
		ph.printHello5Times();
		ph.displayAName("TechCircle");
		ph.printHello5Times();

	}

	private static void displayAName(String name) {
		System.out.println(name);

	}

	private static void printHello5Times() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");

		}
	}
}
