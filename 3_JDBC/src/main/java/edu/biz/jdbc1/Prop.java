package edu.biz.jdbc1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Prop {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/scott.properties"));
		
		System.out.println(properties);
		
		properties.put("jdbc.username.student", "student");
		properties.put("jdbc.password.student", "1234");
		properties.store(new FileWriter("src/main/resources/student.properties"), "학생 접속 정보 추가");
		// Properties타입의 목적
		// properties는 map이기때문에 정렬 당연히 안한다.
	}
}
