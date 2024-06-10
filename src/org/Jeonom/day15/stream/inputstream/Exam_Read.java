package org.Jeonom.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null; // 추상클래스라 객체 생성(new 키워드) 불가
		int readByte;
		try {
			is = new FileInputStream("src/org/Jeonom/day15/stream/inputstream/reading.txt");
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
