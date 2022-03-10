
public class StringMethodPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "bro";
		String name2 = "Bro";
		String name3 = "   Bro    ";
		
		boolean result1 = name1.equals("bro");
		boolean result2 = name1.equals("Bro");
		boolean result3 = name2.equals("Bro");
		char result4 = name2.charAt(0);
		int result5 = name2.indexOf("o");
		boolean result6 = name2.isEmpty();
		String result7 = name1.toUpperCase();
		String result8 = name2.toLowerCase();
		String result9 = name3.trim();
		String result10 = name2.replace("o","a");
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		System.out.println("result4: "+result4);
		System.out.println("result5: "+result5);
		System.out.println("result6: "+result6);
		System.out.println("result7: "+result7);
		System.out.println("result8: "+result8);
		System.out.println("result9: "+result9);
		System.out.println("result10: "+result10);
		
		
		
	}

}
