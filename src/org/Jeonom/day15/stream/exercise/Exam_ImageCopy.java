package org.Jeonom.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		// C:\Windows\Web\Wallpaper\Windows\img0.jpg를
		// C:\Temp\copyimg.jpg
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
			byte [] byteImages = new byte[1024];
			int readCount;
			while(true) {
				readCount = is.read(byteImages);
				if(readCount == -1) break; // 읽을 데이터가 없으면 -1 -> 반복문 탈출
				os.write(byteImages, 0, readCount);
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
