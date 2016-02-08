package tutorials.demo.inherits;

public class Iphone5s extends Apple {

	String phoneBrand = "Apple";
	String phoneModel = "Iphone 5s";
	String colors = "White,Black,Gold,Silver";
	String madeIn = "U.S.A";
	String OS = "iOs";
	double talkTime = 7.87;
	int storage = 32;
	double standbyTime = 26;
	double weight = 5.12;
	double cameraPixels = 8.0;
	boolean smartPhone = true;
	boolean touchScreen = true;
	boolean frontCamera = true;
	boolean backCamera = true;
	boolean wifi = true;

	void iPhoneInfo() {
		System.out.println("Phone Company : " + phoneBrand);
		System.out.println("Phone Model : " + phoneModel);
		System.out.println("Customer Rating: " + custRating);
		System.out.println("Made in : " + madeIn);
		System.out.println("Colors Available :" + colors);
		System.out.println("Is it a SmartPhone? " + smartPhone);
		System.out.println("Is it a Touch Screen? " + touchScreen);
		System.out.println("WiFi Connection? " + wifi);
		System.out.println("Camera Availability? " + frontCamera);
		System.out.println("Camera Availability? " + backCamera);
		System.out.println("Camera MegaPixels : " + cameraPixels);
		System.out.println("Phone Storage Capacity : " + storage);
		System.out.println("Phone Weight : " + weight);
		System.out.println("Phone Operating System : " + OS);
		System.out.println("_________________________________________");
	}

	public void iPhoneColors() {

		System.out.println("What are the available colors?");
		System.out.println(colors);
	}

	public void iPhoneSmart() {
		System.out.println("Is it a Smart Phone? ");
		System.out.println(smartPhone);
	}

	public void iPhoneTouch() {
		System.out.println("Is it a Touch Screen?");
		System.out.println(touchScreen);
	}

	public void iPhoneFrontCam() {
		System.out.println("Does it have a Front Camera?");
		System.out.println(frontCamera);
	}

	public void iPhoneBackCam() {
		System.out.println("Does it have a Back Camera?");
		System.out.println(backCamera);
	}

	public void iPhoneWifi() {
		System.out.println("Does it have WiFi capability?");
		System.out.println(wifi);
	}
}
