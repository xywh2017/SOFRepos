package co.dreamjava.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.dreamjava.entity.StudentEntity;


@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	
	private SessionFactory sessionFactory;
	
	@Override
	public void addStudent(StudentEntity student) {
		this.sessionFactory.getCurrentSession().save(student);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentEntity> getAllEmployees() {
		return this.sessionFactory.getCurrentSession().createQuery("from StudentEntity").list();
	}

	@Override
	public void deleteStudent(int studid) {
		StudentEntity student=(StudentEntity)sessionFactory.getCurrentSession().load(StudentEntity.class,studid);
		if(null!= student){
			this.sessionFactory.getCurrentSession().delete(student);
		}
		
	}

	

}
