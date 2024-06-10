package org.Jeonom.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {

	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/org/Jeonom/day15/stream/writer/writing2.txt");
			char [] data = "Html/Css/Java".toCharArray();
			writer.write(data);
			writer.flush();		// 버퍼 비우기
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
