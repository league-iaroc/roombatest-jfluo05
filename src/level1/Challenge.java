package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(500,500);
		sleep(2000);
		driveDirect(310,500);
		sleep(2000);
		driveDirect(500,500);
		sleep(6000);
		driveDirect(320,500);
		sleep(2000);
		driveDirect(500,500);
		sleep(3000);
		
	}

	public void loop() {
	
	}
}
