import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int price = in.nextInt();
		System.out.println("100-" + price + "=" + (100 - price));
		in.close();
		
	}

}
