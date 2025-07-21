package week3.day1;
//           Child               Parent
public class LaunchEdge extends LaunchChrome {
	
	public void launchBrowser() {
		//super.launchBrowser();
		System.out.println("Edge launched successfully");

	}
  public static void main(String[] args) {
	LaunchEdge browse=new LaunchEdge();
	browse.launchBrowser();
}
}
