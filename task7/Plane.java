package ua.lviv.lgs.task7;

public abstract class Plane {

	private int length;
	private int height;
	private int weight;

	private PlaneControl planeControl = new PlaneControl();

	public Plane(int length, int height, int weight) {
		this.length = length;
		this.height = height;
		this.weight = weight;
	}

	public void startEngines() {
		int countdown = 20 + (int) (Math.random() * (68 + 1));
		System.out.println("Запускаю двигатели. Взлет возможен через " + countdown + " сек");
	}

	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("Произвожу взлет. Самолет с полными баками проедет " + distance + " м");
	}

	public void landingPlane() {
		System.out.println("Выполняю посадку. Начинаю снижение...");
	}

	public void moveUp() {
		planeControl.moveUp();
	}

	public void moveDown() {
		planeControl.moveDown();
	}

	public void moveLeft() {
		planeControl.moveLeft();
	}

	public void moveRight() {
		planeControl.moveRight();
	}

}
