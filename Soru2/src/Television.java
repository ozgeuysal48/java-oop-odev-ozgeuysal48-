
public class Television {
	
	private int width;
	private int height;
	private int screenSize;
	private final int maxVolume = 100;
	private int volume = 50;
	private boolean power = false;
	
	public Television(int width, int height, int screenSize) {
		this.width = width; 
		this.height = height;
		this.screenSize = screenSize;
	}

	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void tvState() {
		if(power) {
			System.out.println("Televizyon acik.");
		}
		else {
			System.out.println("Televizyon kapali.");
		}
	}
	
	public void volumeDown(int sound) {
		if(power == false) {
			System.out.println("Televizyon kapalýyken sesini azaltamazsýnýz.");
		}
		else {
			volume -= sound; 
			if(volume >= 0) {
				System.out.println("Televizyonun sesi " + sound + " kadar kesildi. Televizyonun yeni sesi : " + volume);
			}
			else {
				System.out.println("Televizyonun sesi 0 dan düþük olamaz.");
			}
		}
	}
	public void volumeUp(int sound) {
		if(power == false) {
			System.out.println("Televizyon kapalýyken sesini arttýramazsýnýz.");
		}
		else {
			volume += sound;
			if(volume <= 100) {
				System.out.println("Televizyonun sesi " + sound + " kadar arttýrýldý. Televizyonun yeni sesi : " + volume);
			}
			else {
				System.out.println("Televizyonun sesi " + maxVolume + " den yüksek olamaz.");
			}	
		}
	}
}















