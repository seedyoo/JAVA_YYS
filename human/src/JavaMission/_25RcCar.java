package JavaMission;

public class _25RcCar implements _24RemoteControl{
	// 변수
		private int speed;			// 음량
		
		@Override
		public void turnOn() {
			System.out.println("전원을 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("전원을 끕니다.");
		}

		@Override
		public void setSpeed(int speed) {
			// 유효성 검사
			// 볼륨 최댓값을 넘지 못하게 지정
			if( speed > _24RemoteControl.MAX_SPEED ) {
				this.speed = _24RemoteControl.MAX_SPEED;
			}
			// 볼륨 최솟값을 넘지 못하게 지정
			else if(speed < _24RemoteControl.MIN_SPEED ) {
				this.speed = _24RemoteControl.MIN_SPEED;
			}
			else {
				this.speed = speed;
			}
			System.out.println("현재 스피드 : " + this.speed);
		}
}
