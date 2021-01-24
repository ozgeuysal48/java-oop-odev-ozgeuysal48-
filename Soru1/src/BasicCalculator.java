
public class BasicCalculator implements Calculator {

	@Override
	public void summation(int a, int b) {
		System.out.println(a + " + " + b + " iþleminin sonucu: " + (a + b));

	}

	@Override
	public void cikarma(int a, int b) {
		System.out.println(a + " - " + b + " iþleminin sonucu: " + (a - b));
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a + " * " + b + " iþleminin sonucu: " + (a * b));
	}

	@Override
	public void division(double a, double b) {
		System.out.println(a + " / " + b + " iþleminin sonucu: " + (a / b));

	}

}
