package day12;

public class Lotze extends Car {
	
	int speed = 60;
	String color = "Silver";
	int used = 15;
	
	public void speedUp() {	// �������̵�
		speed += 40;
	}
	public void speedUp(int s) { // �����ε�
		speed += s;
	}
}
