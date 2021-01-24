public class Main {
	public static void main(String[] args) {

		AdvanceCalculator advanceCalc = new AdvanceCalculator();
		BasicCalculator basicCalc = new BasicCalculator();
		advanceCalc.find_square(12);
		advanceCalc.find_cube(8);
		basicCalc.multiplication(6, 4);
		basicCalc.division(90, 5);

	}
}