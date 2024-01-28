package entity.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.StudentEntity;
import util.SessionFactoryConfiguration;

public class StudentRepository {

    private Session session = SessionFactoryConfiguration.getInstance().getSession();

    public Integer saveStudent(StudentEntity studentEntity){
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(studentEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }
    }

    public StudentEntity getStudent(Integer id){
        StudentEntity studentEntity = session.get(StudentEntity.class, id);
        return studentEntity;
    }
    
    public void updateStudent(StudentEntity studentEntity) throws RuntimeException{
        Transaction transaction = session.beginTransaction();
        try {
            session.update(studentEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at update " + studentEntity.getId());
        }
    }

    public void deleteStudent(StudentEntity studentEntity) throws RuntimeException{
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(studentEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException("Error at delete " + studentEntity.getId());
        }
    }
}
