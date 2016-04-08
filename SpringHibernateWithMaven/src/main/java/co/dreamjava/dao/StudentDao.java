package co.dreamjava.dao;

import java.util.List;

import co.dreamjava.entity.StudentEntity;

public interface StudentDao {
	
	public void addStudent(StudentEntity student);
    public List<StudentEntity> getAllEmployees();
    public void deleteStudent(int studid);

}
