package org.Jeonom.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String[] args) {
		// C드라이브에 있는 파일을 D드라이브로 복사해보자~!
		// C:\Temp\Image20240610143428.png -> D:\Copy\copied.png 
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Temp\\Image20240610143428.png");
			os = new FileOutputStream("D:\\Copy\\copied.png ");
			byte [] bytes = new byte[1024];
			int readCount;
			while((readCount = is.read(bytes)) != -1) {
				os.write(bytes, 0, readCount);
				os.flush();
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
