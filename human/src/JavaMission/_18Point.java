package JavaMission;

public class _18Point {

	int x, y;

	// 기본 생성자
	public _18Point() {
		this(0, 0);
	}

	// alt + shift + S -> Generate Contstuctor Using Field
	// 매개변수가 있는 생성자
	public _18Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// alt + shift + S -> Generate toString()
	// ToString()
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
