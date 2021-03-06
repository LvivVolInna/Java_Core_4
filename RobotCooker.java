package ua.lviv.lgs.hw4_1;

public class RobotCooker extends Robot {

	private int id;
	private String modelName;

	RobotCooker(int id, String modelName) {
		super.nameOfRobot = "RobotCooker";
		super.work = "просто готую";
		this.id = id;
		this.modelName = modelName;

	}

}
