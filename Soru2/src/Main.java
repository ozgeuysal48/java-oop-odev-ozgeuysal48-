
public class Main {
	

		public static void main(String[] args) {
			Television tv = new Television(1024, 1920, 16);
			
			tv.tvState();
			tv.setPower(true);
			tv.tvState();
			
			tv.volumeUp(20);
			tv.volumeDown(60);
		}
		
	} 


