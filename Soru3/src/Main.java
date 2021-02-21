
public class Main {
	public static void main(String[] args) {
		
		Pair<String , Integer> pair = new Pair<String , Integer>("ozge" , 24);
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
		
		Pair<Boolean , Double> pair2 = new Pair<Boolean , Double>(true , 29.24);
		System.out.println(pair2.getFirst());
		System.out.println(pair2.getSecond());
	}

}
