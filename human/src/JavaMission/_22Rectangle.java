package JavaMission;

public class _22Rectangle extends _22Shape {

	double width, height;
	
	

	public _22Rectangle() {
		this(0, 0);
	}
	

	public _22Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	@Override
	double area() {
		// (가로) x (세로)
		return width * height;
	}

	@Override
	double round() {
		// (가로 + 세로) * 2
		return (width + height) * 2;
	}

	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
}
