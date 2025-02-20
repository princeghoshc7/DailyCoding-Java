package String;

public class StringInitialization {
	
	static String fieldString;
	
	static void printDeclearedOnlyString() {
		
		String localString;
		try {
			try {
				System.out.println(fieldString);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		String literalOne = "Baeldung";
		String literalTwo = "Baeldung";
		
		printDeclearedOnlyString();
		
	}

}
