package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
static int speed=500;
	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	goStraight(2000);
	turnLeft(1300);
	goStraight(1200);
	turnRight(1300);
	goStraight(1000);
	turnLeft(1500);
	goStraight(800);
	turnRight(1400);
	goStraight(1200);
	}
private void goStraight(int howLong){
	driveDirect(speed,speed);
	sleep(howLong);
}
private void turnLeft(int howLong){
	driveDirect(310,speed);
	sleep(howLong);

}
private void turnRight(int howLong){
	driveDirect(speed,310);
	sleep(howLong);}

	public void loop() {
	
	}
}
