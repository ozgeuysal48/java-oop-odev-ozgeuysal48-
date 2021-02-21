

public class AdvanceCalculator extends BasicCalculator implements Scientific {

	@Override
	public void find_square(int number) {
		System.out.println(number + " sayisinin karesi: " + Math.pow(number, 2));
	}

	@Override
	public void find_cube(int number) {
		System.out.println(number + " sayisinin kübü: " + Math.pow(number, 3));
	}

}
