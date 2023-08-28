package ua.lviv.lgs.task7;

public class Main {

	public static void main(String[] args) {

		Su27 t10c = new Su27(21935, 5932, 16300, 1350, "серый");

		t10c.startEngines();
		t10c.takeoffPlane();
		t10c.moveUp();
		t10c.moveLeft();
		t10c.moveDown();
		t10c.moveRight();
		t10c.becomeStealth();
		t10c.nuclearStrike();
		t10c.turboAccelerate();
		t10c.landingPlane();
	}

}
