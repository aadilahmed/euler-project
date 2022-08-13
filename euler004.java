public class euler004 {
	public static void main(String[] args) {
		final int max = 999;

		int max_palindrome = 0;

		for(int i = 1; i <= max; i++) {
			for(int j = 1; j <= max; j++) {
				int product = i*j;

				if(check_Palindrome(product) && 
						max_palindrome < product){
					max_palindrome = product; 
				}
			}
		}

		System.out.println(max_palindrome);
	}

	private static boolean check_Palindrome(int n) {
		String number = Integer.toString(n);

		StringBuilder numberReversed = new StringBuilder();
		numberReversed.append(number);
		numberReversed.reverse();

		if(numberReversed.toString().equals(number) ){
			return true;
		}

		return false; 
	}
}
