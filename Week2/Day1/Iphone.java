package week2.day1;

public class Iphone {

	public void takeHqPhoto(int photoSize, String format) {

		System.out.println(photoSize + " " + format);

	}

	public static void main(String[] args) {
		Iphone iphoneOptions = new Iphone();
		iphoneOptions.takeHqPhoto(7, "Png");
		iphoneOptions.takeHqPhoto(10, "Jpeg");

	}

}
