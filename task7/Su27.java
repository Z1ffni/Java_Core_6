package ua.lviv.lgs.task7;

public class Su27 extends Plane implements TurboAcceleration, StealthTechnology, NuclearStrike {

	int maxSpeed;
	String color;

	public Su27(int length, int height, int weight, int maxSpeed, String color) {
		super(length, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void turboAccelerate() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
		System.out.println("Турбоускорение запущено. Скорость самолета " + accSpeed + " км/час");
	}

	@Override
	public void becomeStealth() {
		int unvisibleTime = (int) (Math.random() * 1000);
		System.out.println("Запущена технология Стелс. Самолет исчез с радаров на " + unvisibleTime + " cек");
	}

	@Override
	public void nuclearStrike() {
		int bombsAmount = (int) (Math.random() * (10 + 1));
		System.out.println("Активирована функция ядерного удара. На объект будет сброшено " + bombsAmount + " боеголовок");
	}

}
