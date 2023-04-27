package Day08.Ex06_MultipleInterface;

public class SmartTelevisionEx {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(20);
		int channel = tv.channalSearch("SBS");
		tv.setChannel (channel);
		
		String[] idolContents = tv.contentSearch("아이돌");
		System.out.println("========== 검색된 컨텐츠 ==========");
		for (int i = 0; i < idolContents.length; i++) {
			System.out.print( idolContents[i] );
			if(i < idolContents.length-1)
				System.out.print(", ");
		}
		System.out.println();
		
		tv.receiveVoice("오늘 날씨 어때?");
		
		tv.turnOff();
	}
}
