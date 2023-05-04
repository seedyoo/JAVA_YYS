package JavaMission;

public class _11Trapezoid {

	double top;
	double bottom;
	double height;
	
	public _11Trapezoid() {
	}


	public _11Trapezoid(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}


	public double getArea() {
		return (top + bottom) * height / 2;
	}


	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + "]";
	}
	
	
}
