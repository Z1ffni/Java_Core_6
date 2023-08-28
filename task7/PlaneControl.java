package ua.lviv.lgs.task7;

public class PlaneControl {

	public void moveUp() {
		System.out.println("Самолет пролетел вверх " + Move.move() + " км");
	}

	public void moveDown() {
		System.out.println("Самолет пролетел вниз " + Move.move() + " км");
	}

	public void moveLeft() {
		System.out.println("Самолет пролетел влево " + Move.move() + " км");
	}

	public void moveRight() {
		System.out.println("Самолет пролетел вправо " + Move.move() + " км");
	}
}
