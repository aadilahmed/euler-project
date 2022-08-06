public class euler002 {
	public static void main(String[] args) {
		int evenSum = 0;
		int x1 = 1;
		int x2 = 1;
		int temp = 0;

		while(x2 < 4000000) {
			if(x2 % 2 == 0) {
				evenSum = evenSum + x2;
			}

			temp = x1 + x2;
			x1 = x2;
			x2 = temp;
		}

		System.out.println(evenSum);
	}

	private static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

	private static int fibd(int n) {
		int arr[] = new int[n];

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;

		for(int i = 3; i < n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}

		return arr[n-1];
	}
}
