package Day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex08_FileCopy {

	// 1. byte 단위로 파일 복사
	// 2. KB 단위로 파일 복사
	
	
	/**
	 * 바이트 단위로 파일 복사
	 * @param originFile
	 * @param copyFile
	 */
	public static void fileByteCopy(File originFile, File copyFile) {
		// originFile	: 원본 파일
		// copyFile		: 사본 파일
		try {
			FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			
			
			int data;
			
			while( (data = fis.read() ) != -1 ) {
				fos.write(data);
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사를 완료...");
			System.out.println(originFile.getName() + " -> " + copyFile.getName());
			
		} catch (IOException e) {
			System.err.println("파일 복사 중, 예외가 발생하였습니다...");
			e.printStackTrace();
		}
	}
	
	/**
	 * KB 단위로 파일 복사
	 * @param originFile
	 * @param copyFile
	 */
	public static void fileCopy(File originFile, File copyFile) {
		// originFile	: 원본 파일
		// copyFile		: 사본 파일
		try {
			FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			
			// 버퍼
			byte[] buffer = new byte[1024];	// 1024bytes = 1KB 단위
			int data;
			
			while( (data = fis.read(buffer) ) != -1 ) {	// 1KB 씩 파일입력
				fos.write(buffer, 0, data);				// 1KB 씩 파일출력
				// write( 데이터, 시작 index, 버퍼의 크기 );
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사를 완료...");
			System.out.println(originFile.getName() + " -> " + copyFile.getName());
			
		} catch (IOException e) {
			System.err.println("파일 복사 중, 예외가 발생하였습니다...");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원본 파일 경로 : ");
		String origin = sc.nextLine();
		
		System.out.print("사본 파일 경로 : ");
		String copy = sc.nextLine();
		
		File originFile = new File(origin);
		File copyFile = new File(copy);
		
		long stdTime = System.nanoTime();
		
		// fileByteCopy(originFile, copyFile);
		fileCopy(originFile, copyFile);
		
		long endTime = System.nanoTime();
		
		System.out.println("시간 : " + (endTime-stdTime) /1000/1000/1000 );
		
		// 바이트 : 2756000나노초
		// KB	: 961500나노초
		
		sc.close();
	}
}
