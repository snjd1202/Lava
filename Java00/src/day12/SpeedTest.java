package day12;

public class SpeedTest {

	public SpeedTest() {
		Car car = new Car();
		car.speedUp();
		System.out.println("Car speed : " + car.speed);
		
		Mini mini = new Mini();
		mini.speedUp();
		System.out.println("Mini speed : " + mini.speed + "m/h");
		
		Lotze euns = new Lotze();
		euns.speedUp();
		euns.speedUp(20);
		System.out.println("euns speed : " + euns.speed);
		
		Car lotze = new Lotze();
		
//		System.out.println("lotze color : " + lotze.color);
//		System.out.println("lotze used : " + lotze.used);
		System.out.println("lotze speed : " + lotze.speed);
		
//		Mini m1 = (Mini) lotze;	// 되긴 하지만 이렇게 사용하지 않는 방향으로 코딩해야 한다.
		
//		Lotze car2 = new Car(); // 범위가 큰 데이터를 작은 데이터에 넣으려고 했기 때문에 안됨.
		Lotze car2 = (Lotze) new Car(); // 강제 형변환 하면 가능
		
		System.out.println(car2.speed);
		car2.speedUp();
		System.out.println(car2.speed);
		
	}
	
	public static void main(String[] args) {
		new SpeedTest();
	}

}
