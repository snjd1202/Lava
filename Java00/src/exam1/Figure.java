package exam1;

public class Figure {
    float area;
    int width;
    int height;
    
    public float area(int width, int height) {
        return this.area;
    }
    public void toPrint() {
    	System.out.println("width : " + width + " height : " + height + " area : " + area);
    }
}