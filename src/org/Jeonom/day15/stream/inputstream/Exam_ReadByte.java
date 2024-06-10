package org.Jeonom.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;

		try {
			is = new FileInputStream("src/org/Jeonom/day15/stream/inputstream/reading.txt");
			byte [] readBytes = new byte[3];
			int readCount;
			String result = "";
//			do {
			while(true) {
				readCount = is.read(readBytes); // readCount에는 3, readBytes에는 3문자씩 들어감
				if(readCount == -1) break;
				result += new String(readBytes, 0, readCount); // String 생성자를 이용해서 문자열로 바꾸는 과정
			}
//			}while(readCout != -1);
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
