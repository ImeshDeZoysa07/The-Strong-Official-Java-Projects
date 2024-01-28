package entity.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.StudentEntity;
import util.SessionFactoryConfiguration;

public class StudentRepository {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public Integer saveStudent(StudentEntity entity) {
        Transaction transaction = session.beginTransaction();

        try {
            Integer id = (Integer) session.save(entity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }
    }

    public StudentEntity getStudent(Integer id) {
        StudentEntity studentEntity = session.get(StudentEntity.class, id);
        return studentEntity;
    }

    public void updateStudent(StudentEntity entity) {
        Transaction transaction = session.beginTransaction();

        try {
            session.update(entity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }

    public void deleteStudent(StudentEntity entity) {
        Transaction transaction = session.beginTransaction();

        try {
            session.delete(entity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }
}
