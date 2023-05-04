package JavaMission;

public class _22Triangle extends _22Shape {

	double width, height;

	public _22Triangle() {
		this(0, 0);
	}
	
	public _22Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// (가로) x (세로) / 2
		return width * height / 2;
	}

	@Override
	double round() {
		// (정삼각형) : (한 변의 길이) * 3
		return width * 3;
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
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
}