package tutorials.demo.inherits;

public class GalaxyS1 extends Samsung {

	String phoneBrand = "Samsung";
	String phoneModel = "Galaxy S1";
	String colors = "White,Black,Grey";
	String madeIn = "Korea";
	String OS = "Android";
	double cameraPixels = 5.0;
	int storage = 16;
	double weight = 4.16;
	double talkTime = 6.55;
	double standbyTime = 24;
	boolean smartPhone = true;
	boolean touchScreen = true;
	boolean frontCamera = false;
	boolean backCamera = true;
	boolean wifi = true;

	void s1Info() {
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

	public void s1Colors() {

		System.out.println("What are the available colors?");
		System.out.println(colors);
	}

	public void s1Smart() {
		if (smartPhone == true) {
			System.out.println("Galaxy S1 is a Smart Phone");
		} else {
			System.out.println("Galaxy S1 is NOT a Smart Phone");
		}
	}

	public void s1Touch() {
		if (touchScreen == true) {
			System.out.println("Galaxy S1 Has Touch Screen Capability");
		} else {
			System.out.println("Galaxy S1 Has NO Touch Screen Capability");
		}
	}

	public void s1Camera() {
		if (frontCamera == true) {
			System.out.println("Galaxy S1 has Front Camera");
		} else if (frontCamera == false) {
			System.out.println("Galaxy S1 has NO Front Camera");
		} else if (backCamera == true) {
			System.out.println("Galaxy S1 has a Rear Camera");
		} else if (backCamera == false) {
			System.out.println("Glaxy S1 has NO Rear Camera");
		}
		System.out.println("Camera MP : " + cameraPixels);
	}

	public void s1Wifi() {
		if (wifi == true) {
			System.out.println("Galaxy S1 Has WiFi Capability");
		} else {
			System.out.println("Galaxy S1 Has NO WiFi Capability");
		}
	}
}
