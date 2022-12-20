
package com.example.demo;

import java.io.File;
import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.pojo.Scores;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.StudentsList;

@SpringBootApplication
public class JavaObjApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaObjApplication.class, args);

		try {
			String result = null;

			File file = new File("src\\main\\resources\\StudentsList.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(StudentsList.class);

			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StudentsList student = (StudentsList) unmarshaller.unmarshal(file);

//			System.out.println(student);

			VelocityEngine velocity = new VelocityEngine();
			velocity.init();

			/*
			 * Template t = velocity.getTemplate("src\\main\\resources\\Template.vm");
			 * List<Student> studentd = student.getStudentsList(); VelocityContext context =
			 * new VelocityContext(); context.put("students", student.getStudentsList());
			 * for (Student stu : studentd) {
			 */
//				System.out.println(stu.getId());
//				for (int i = 1; i <= stu.getId(); i++) {
//					
//					if (i <= stu.getId()) {
//						System.out.println(stu.getId());
//						break;
//					}
			// context.put("StudentList", i);
			/*
			 * context.put("studentid", stu.getId()); context.put("firstname",
			 * stu.getFirstName()); context.put("lastname", stu.getLastName());
			 * context.put("course", stu.getCourse());
			 * 
			 * for (Scores student2 : stu.getScores()) {
			 * 
			 * context.put("scores", student2); context.put("subject1",
			 * student2.getSubject1()); context.put("subject2", student2.getSubject2());
			 * context.put("subject3", student2.getSubject3()); context.put("subject4",
			 * student2.getSubject4()); }
			 * 
			 * for (deatils student2 : stu.getStudentDeatils()) { context.put("deatils",
			 * student2); context.put("state", student2.getState()); context.put("location",
			 * student2.getLocation()); context.put("address", student2.getAddress());
			 * context.put("floor", student2.getFloor()); context.put("roomno",
			 * student2.getRoomno());
			 * 
			 * } for (educationdeatils student2 : stu.getEducationDeatils()) {
			 * context.put("deatils", student2); context.put("university",
			 * student2.getUniversity()); context.put("college", student2.getCollege());
			 * context.put("department", student2.getDepartment());
			 * 
			 * }
			 * 
			 * // }
			 * 
			 * StringWriter writer = new StringWriter(); t.merge(context, writer); result =
			 * writer.toString(); System.out.println(result); }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
