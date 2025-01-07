package practice.Practice32;

import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentDAO studentDAO = new StudentDAO();
		List<StudentDTO> studentList = studentDAO.findStudentList();
		
		for(StudentDTO s : studentList) {
			System.out.println(s);
		}

		
		System.out.println("GRADE = 1");
		List<StudentDTO> studentList2 = studentDAO.findStudentListByGrade(1);
		for(StudentDTO s : studentList2) {
			System.out.println(s.toString());
		}
		
	}

}
