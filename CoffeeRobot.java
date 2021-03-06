package ua.lviv.lgs.hw4_1;

public class CoffeeRobot extends Robot {

	private int id;
	private String modelName;

	CoffeeRobot(int id, String modelName) {
		super.nameOfRobot = "CoffeeRobot";
		super.work = "варю каву";
		this.id = id;
		this.modelName = modelName;
	}

}
