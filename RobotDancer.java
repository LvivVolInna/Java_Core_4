package ua.lviv.lgs.hw4_1;

public class RobotDancer extends Robot {

	private int id;
	private String modelName;

	RobotDancer(int id, String modelName) {
		super.nameOfRobot = "RobotDancer";
		super.work = "просто танцюю";
		this.id = id;
		this.modelName = modelName;
	}

}
