package zohoQuestions;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zoho(6);
		
		
	}
	public static boolean zoho(int n) {
		if(n==1) {
			return true;
		}
		else {
			return !zoho(n-1);
		}
	}

}
