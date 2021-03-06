package ua.lviv.lgs.hw4_1;

public class Animal {

	private String nameOfAnimal;
	private String speedOfAnimal;
	private int ageOfAnimal;

	public Animal(String nameOfAnimal, String speedOfAnimal, int ageOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
		this.speedOfAnimal = speedOfAnimal;
		this.ageOfAnimal = ageOfAnimal;
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public String getSpeedOfAnimal() {
		return speedOfAnimal;
	}

	public void setSpeedOfAnimal(String speedOfAnimal) {
		this.speedOfAnimal = speedOfAnimal;
	}

	public int getAgeOfAnimal() {
		return ageOfAnimal;
	}

	public void setAgeOfAnimal(int ageOfAnimal) {
		this.ageOfAnimal = ageOfAnimal;
	}

	
	
	
		
	
	@Override
	public String toString() {
		return "Назва тварини =" + nameOfAnimal + ", Швидкість тварини =" + speedOfAnimal + ", Вік тварини ="
				+ ageOfAnimal;
	}

}
