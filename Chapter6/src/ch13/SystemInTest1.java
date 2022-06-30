package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in); // 한글도 지원 문자 단위로 입출력 가능
			while((i = irs.read()) != '\n') {
				System.out.println((char)i);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
