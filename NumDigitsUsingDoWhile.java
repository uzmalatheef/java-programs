
public class NumDigitsUsingDoWhile {

	public static void main(String[] args) {
		int n = 456, count = 0;
		do {
			n = n / 10;
			count++;
		} while (n > 0);
		System.out.println("num of digits :" + count);
	}

}
