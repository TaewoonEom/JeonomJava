package org.Jeonom.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_CodeRead {

	public static void main(String[] args) {
		// Exam_ImageCopy.java 파일을 읽어서 콘솔로 출력해보세요!
		Reader reader = null;
		try {
			reader = new FileReader("src/org/Jeonom/day15/stream/exercise/Exam_ImageCopy.java");
			int readCount;
			char [] cBuf = new char[1024];
			String result = "";
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				result += new String(cBuf, 0, readCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
