package com.company;

		import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Car redcar = new Car();
		Car.Window wind = redcar.new Window();
		wind.Down();
		wind.Up();
		Cube kubik = new Cube();
		kubik.moveLeft();
		kubik.moveRight();
		kubik.pickUp();
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		redcar.changeColor(a);
	}
}
