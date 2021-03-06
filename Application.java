package ua.lviv.lgs.hw4_1;

import ua.lviv.lgs.methods.Student;

public class Application {
	public static void main(String[] args) {
		Robot r = new Robot();
		Robot r1 = new CoffeeRobot(1, "Latte");
		Robot r2 = new RobotDancer(2, "Tango");
		Robot r3 = new RobotCooker(3, "Borshch");	
		
		Robot[] robots = {r, r1, r2, r3};
		
		for(Robot rob: robots) {
			System.out.println(rob.work());
		}

		for(int i = 0; i < robots.length; i++) {
			System.out.println(robots[i].work());
		}
		
		
		
		
		
		Animal a = new Animal("Леопард", "20 км/год", 7);
		System.out.println("Назва тварини = " + a.getNameOfAnimal() + ", Швидкість тварини = " + a.getSpeedOfAnimal() + ", Вік тварини = "
				+ a.getAgeOfAnimal());
		
		
		a.setNameOfAnimal("Бик");
		a.setSpeedOfAnimal("2 км/год");
		a.setAgeOfAnimal(14);
		
		System.out.println("Назва тварини = " + a.getNameOfAnimal() + ", Швидкість тварини = " + a.getSpeedOfAnimal() + ", Вік тварини = "
				+ a.getAgeOfAnimal());
		
		
	}
}
