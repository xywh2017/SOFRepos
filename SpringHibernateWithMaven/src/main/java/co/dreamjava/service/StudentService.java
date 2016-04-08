package co.dreamjava.service;

import java.util.List;

import co.dreamjava.entity.StudentEntity;

public interface StudentService {
		public void addStudent(StudentEntity student);
	    public List<StudentEntity> getAllEmployees();
	    public void deleteStudent(int studid);
}
