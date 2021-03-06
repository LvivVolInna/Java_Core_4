package ua.lviv.lgs.hw4_1;

public class Robot {

	protected String nameOfRobot = "Robot";
	protected String work = "просто працюю";

	Robot() {
	}	


	public String getNameOfRobot() {
		return nameOfRobot;
	}

	public void setNameOfRobot(String nameOfRobot) {
		this.nameOfRobot = nameOfRobot;
	}


	public void setWork(String work) {
		this.work = work;
	}


	public String getWork() {
		return work;
	}
	

	public String work() {
		return "Я " + nameOfRobot + " - я " + work;
	}
}
