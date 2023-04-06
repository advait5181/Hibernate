package Com.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate04.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		// creating Question
		Question q1 = new Question();
		q1.setQuestionid(1);
		q1.setQuestion("What is Java?");
		
		Answer answer = new Answer();
		answer.setAnswerid(12);
		answer.setAnswer("Java is high-level programming langauge");
		q1.setAnswer(answer);
		
		Question q2 = new Question();
		q2.setQuestionid(2);
		q2.setQuestion("What is Collection Framework ?");
		
		Answer answer1 = new Answer();
		answer1.setAnswerid(13);
		answer1.setAnswer("API to work with object in a java");
		q2.setAnswer(answer1);
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//Save
		session.save(q1);
		session.save(q2);
		session.save(answer);
		session.save(answer1);
		
		tx.commit();
		
		session.close();
		
		factory.close();
	}
}
