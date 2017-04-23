/**
 * 
 */
package hibernate.associations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author Progvaltion_11
 *
 */
public class HibernateUtilityMethods {
	
	static SessionFactory sFactory=null;
	
	public static SessionFactory getSessionFactory(){
		
		if(null==sFactory)
			sFactory = new AnnotationConfiguration().configure("/hibernate.hsqldb.cfg.xml").buildSessionFactory();
		return sFactory;
	}
	
	public static void resourceCleaup(Session session, Transaction trac){
		
		if(null!=trac)
			trac.commit();
		
		if(null!=session){
			session.flush();
			session.close();
		}
			
		
	}

}
