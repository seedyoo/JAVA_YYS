package Day08.Ex04_NestedClass;

public class InnerInterfaceEx {

	public static void main(String[] args) {
		// 중첩 인터페이스의 아우터 클래스인 객체 I 생성
		I i = new I();
		
		// 구형 객체를 메소드를 통해 지정
		i.setInterface( new ImplClass() );
		i.method();
		
	}
}
