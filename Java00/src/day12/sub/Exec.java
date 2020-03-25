package day12.sub;

/*
	Figure 클래스를 정의하고
	상속받아서 삼각형, 사각형, 원의 클래스를 정의한 후
	
	1-3까지의 점수를 랜덤하게 10개 만들어서 
	1의 경우 삼각형
	2의 경우 사각형
	3의 경우 원
	을 배열에 넣고
	출력하세요.
*/
public class Exec {
	

	public Exec() {
		// Figure 배열 만들기
		Figure[] f = new Figure[10];
		
		
		// 램덤값 만들기
		for(int i = 0; i < 10; i++) {
			int no = (int)(Math.random()*(3-1+1)+1);	// 삼각,사각,원 랜덤으로 뽑을 함수
			
			/*
			int no1 = (int)(Math.random()*(10-5+1)+5);	// width 값 랜덤하게 뽑을 함수
			int no2 = (int)(Math.random()*(10-5+1)+5);	// height 값 랜덤하게 뽑을 함수
			
			if(no == 1) {		
				f[i] = new Tri(no1,no2);	// 위에서 정의한 Figure 배열에 삼각형값(width, height) 넣기
				
			} else if(no == 2) {
				f[i] = new Squa(no1,no2);	// 배열에 사각형값 넣기
				
			} else {
				f[i] = new Cir(no1);		// 배열에 반지름값 넣기
			}
			*/
			
			switch(no) {
			case 1:
				f[i] = new Tri(getArr());	// 위에서 정의한 Figure 배열에 삼각형값(width, height) 넣기
				break;
			case 2:
				f[i] = new Squa(getArr());	// 위에서 정의한 Figure 배열에 삼각형값(width, height) 넣기
				break;
			case 3:
				f[i] = new Cir(getArr());	// 위에서 정의한 Figure 배열에 삼각형값(width, height) 넣기
				break;
			}
			
		}
		
	}
		
	public int[] getArr(){
		int[] arr = new int[2];
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*20+1);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		new Exec();
	}

}
