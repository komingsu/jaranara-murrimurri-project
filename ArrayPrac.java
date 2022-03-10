
public class ArrayPrac {

	public static void main(String[] args) {
		
		String[] cars = {"Camaro","Corvette", "Tesla"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[2]);
		
		String[] car = new String[3];
		car[0] = "Camaro";
		car[1] = "corvette";
		car[2] = "Tesla";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(car[i]);
		}
		
		
	}
}
