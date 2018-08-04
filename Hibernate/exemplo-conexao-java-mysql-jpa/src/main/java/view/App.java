package view;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.alunos;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	alunos alunos = new alunos();
    	alunos.setNome("Jefinho");
    	alunos.setEndereco("Av.Aguia de Haia");
    	
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();
    	session.save(alunos);
    	session.getTransaction().commit();
    }
}
