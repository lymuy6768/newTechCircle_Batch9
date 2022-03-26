package day19_forEachLoop;

public class LoopReview {

	public static void main(String[] args) {
		
		String cars[]= {"Honda","Opal","Mazda","Toyota"};
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
			
		}
		
		int a=0;
		do{
			System.out.println(cars[a]);
			a++;
		}while(a<cars.length);
		
		a=0;
		while(a<cars.length) {
			System.out.println(cars[a]);
			a++;
		}
		System.out.println("-----------");
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("--------");
		
		double nums[]= {1.2,3.3,3.0,4.9,0.2};
		
		System.out.println("------2");
		for(double i:nums) {
			System.out.println(i);
		}
	
		
		
		
}

	}


