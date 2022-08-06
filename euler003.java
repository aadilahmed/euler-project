public class euler003 {
	public static void main(String[] args) {
		long num = 600851475143L;
		long largestFact = 0;

		int counter = 2;

		while(counter * counter <= num) {
			if(num % counter == 0) {
				num = num / counter;
				largestFact = counter;
			}
			else {
				counter++;
			}
		}

		if(num > largestFact) {
			largestFact = num;
		}

		System.out.println(largestFact); 
	}
}
