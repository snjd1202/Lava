package exam1;

public class Nemo extends Figure{

	public int width;
	public int height;
	
	public Nemo() {}
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		this.area = width * height / 2f;
	}
	
	public float area() {
		System.out.println("width : " + width + " height : " + height + " area : " + area);
		
		return this.area;
	}
}
