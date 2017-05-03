package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
static int speed= 500;
	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		
		driveDirect(speed,speed);
		sleep(3000);
		driveDirect(310,500);
		sleep(1700);
		driveDirect(speed,speed);
		sleep(4000);
		driveDirect(500,310);
		sleep(2000);
		driveDirect(speed,speed);
		

	}

	public void loop() {
	
	}
}
