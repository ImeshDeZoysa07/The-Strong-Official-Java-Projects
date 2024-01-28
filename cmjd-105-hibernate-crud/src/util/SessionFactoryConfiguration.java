package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.StudentEntity;

public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration sessionFactoryConfiguration;

    private SessionFactory sessionFactory;
    
    private SessionFactoryConfiguration(){
        Configuration configuration = new Configuration().configure()
        .addAnnotatedClass(StudentEntity.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    private void addAnnotatedClass(Class<StudentEntity> class1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAnnotatedClass'");
    }

    public static SessionFactoryConfiguration getInstance(){
        if(sessionFactoryConfiguration == null){
            sessionFactoryConfiguration = new SessionFactoryConfiguration();
        }

        return sessionFactoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }

}
