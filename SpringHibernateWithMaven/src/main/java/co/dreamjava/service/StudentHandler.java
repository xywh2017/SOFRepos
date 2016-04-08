package co.dreamjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.dreamjava.dao.StudentDao;
import co.dreamjava.entity.StudentEntity;


@Service
public class StudentHandler implements StudentService {

	@Autowired 
	private StudentDao studentDao;
	
	@Override
	@Transactional
	public void addStudent(StudentEntity student) {
		studentDao.addStudent(student);
		
	}

	@Override
	@Transactional
	public List<StudentEntity> getAllEmployees() {
		
		return studentDao.getAllEmployees();
	}

	@Override
	@Transactional
	public void deleteStudent(int studid) {
		studentDao.deleteStudent(studid);
		
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
