package week2.day1;

public class GooglePixel {

	public int sendMessage() {
		int number = 6;
		return number;
	}

	public String takePhoto() {
		return "photoname";
	}

	public static void main(String[] args) {
		GooglePixel pixelOptions = new GooglePixel();
		int variableName = pixelOptions.sendMessage();
		System.out.println(variableName);

		String takePhoto = pixelOptions.takePhoto();
		System.out.println(takePhoto);

	}
}
