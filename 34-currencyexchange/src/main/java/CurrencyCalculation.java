import java.util.Scanner;

public class CurrencyCalculation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many euros are you exchanging?");
		float euros=scan.nextFloat();
		System.out.println("What is the exchange rate?");
		float exchangeRate=scan.nextFloat();
		System.out.format("%.2f euros at an exchange rate of %.2f is %.2f U.S. dollars.", euros, exchangeRate, euros*exchangeRate/100);
	}

}
