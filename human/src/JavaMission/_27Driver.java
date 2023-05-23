package JavaMission;

public class _27Driver {

	public static void main(String[] args) {
		// 인터페이스타입 객체명 = new 구현클래스();
		_27RemoteControl RcDrone = new _27Drone();
		RcDrone.turnOn();
		RcDrone.setSpeed(5);
		RcDrone.setSpeed(100);
		RcDrone.setMute(true);				// 음소거
		RcDrone.turnOff();
		System.out.println();
		
		_27RemoteControl RcCar = new _27RcCar();
		RcCar.turnOn();
		RcCar.setSpeed(5);
		RcCar.setSpeed(-100);
		RcCar.setMute(false);		// 음소거
		RcCar.turnOff();
		System.out.println();
		
		_27RemoteControl.changeBattery();	// 리모콘 배터리 교체
		
		
	}
}
