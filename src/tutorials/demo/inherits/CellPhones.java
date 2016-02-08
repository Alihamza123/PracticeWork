package tutorials.demo.inherits;

public class CellPhones {

	protected String phoneBrand, madeIn, colors, phoneModel;
	protected int custRating;
	protected boolean moreProducts, smartPhone, touchScreen, wifi, 
	frontCamera,backCamera;
	
	
	public static void main (String[] args){
		GalaxyS1 s = new GalaxyS1();
		Iphone5s i = new Iphone5s();
		
		// SAMSUNG GALAXY S1 ALL INFO :
		s.s1Info();
		
		// PHONES STAND BY TIMES GREATER THAN 25 HOURS ??
		if (s.standbyTime>25){
			System.out.println("Galaxy S1's standby time is more than 25 Hours");
		}else if (i.standbyTime>25){
			System.out.println("Iphone 5S's standby time is more than 25 Hours");
		}
		
		// WHICH PHONES HAVE THE MOST CAMERA PIXELS AND HOW MUCH ?
		if(s.cameraPixels>i.cameraPixels){
			System.out.println("Galaxy S1 has the MOST Camera Pixels "+s.cameraPixels);
		}else{
			System.out.println("Iphone 5s has the MOST Camera Pixels "+i.cameraPixels);
		}
	}
		
}
