package exam1;

public class Semo extends Figure {
	public int width;
	public int height;
	
	public Semo() {}
	
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		this.area = width * height;
	}
	
	public float area() {
		System.out.println("width : " + width + " height : " + height + " area : " + area);
		
		return this.area;
	}
}

