/**
 * 
 */
package hibernate.associations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author Progvaltion_11
 *
 */
public class TestOneToOneUniDirectional {

	//insert into studentTbl (studage, studname, studid) values (?, ?, ?)
	//insert into addressTbl (ad_city, ad_line1, ad_line2, ad_pin, ad_state, addressID) values (?, ?, ?, ?, ?, ?)

	
	public static void main(String[] args) {
		
		oneToOneUnidirectional();
	}

	private static void oneToOneUnidirectional() {
		
		Address ad1 = new Address("Line11","line21","Pune1","MH1",123123);
		Address ad2 = new Address("Line12","line22","Pune2","MH2",123121);
		Address ad3 = new Address("Line13","line23","Pune3","MH3",123124);
		
		Student st1 = new Student("Stud1", 24);
		Student st2 = new Student("Stud2", 25);
		Student st3 = new Student("Stud3", 26);
		
		st1.setAddress(ad1);
		st2.setAddress(ad2);
		st3.setAddress(ad3);
		
		SessionFactory sFactory = HibernateUtilityMethods.getSessionFactory();
		Session session = sFactory.openSession();
		Transaction trac = session.beginTransaction();
		session.save(st1);
		HibernateUtilityMethods.resourceCleaup(session,trac);
		
	}
	
	
}
