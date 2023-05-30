package JavaMission;

public class _11Rectangle {

	double width;
	double height;
	
	public _11Rectangle() {
	}
	
	public double getArea() {
		return width * height;
	}

	public _11Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
	
	
	
}
