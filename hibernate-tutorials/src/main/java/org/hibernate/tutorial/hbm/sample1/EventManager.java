/**
 * 
 */
package org.hibernate.tutorial.hbm.sample1;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.tutorial.hbm.sample1.domain.Event;
import org.hibernate.tutorial.hbm.sample1.domain.Person;
import org.hibernate.tutorial.hbm.util.HibernateUtil;

/**
 * @author somnath
 * 
 */
public class EventManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventManager mgr = new EventManager();

		if (args[0].equals("store_event")) {
			mgr.createAndStoreEvent("My Event", new Date());
		}
		else if(args[0].equals("list_event")){
			List events = mgr.listEvents();
			for(int i=0; i<events.size(); i++){
				Event theEvent = (Event)events.get(i);
				System.out.println("Event: "+theEvent.getTitle()+" Time: "+ theEvent.getDate());
			}
		}
		else if(args[0].equals("store_person")){
			mgr.addPerson("Somnath", "Upadhyay", 29);
		}
		else if(args[0].equals("list_person")){
			List persons = mgr.listPerson();
			for(int i=0; i<persons.size();i++){
				Person thePerson = (Person)persons.get(i);
				System.out.println("Person: "+thePerson.getFirstname() +" "+thePerson.getLastname()+" your id is: "+thePerson.getId());
			}
		}
		else if(args[0].equals("map")){
			mgr.addPersonToEvent(1l,1l);
		}else if(args[0].equals("my_events")){
			Person thePerson =mgr.showEvents(1l);
			System.out.println("Person: "+thePerson.getFirstname() +" "+thePerson.getLastname()+" your id is: "+thePerson.getId());
			System.out.println("Events for: "+thePerson.getFirstname()+" are: \n" +thePerson.getEvents());
		}
		HibernateUtil.getSessionFactory().close();
	}

	private Person showEvents(long personId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Person person = (Person) session.get(Person.class, personId);
				
		return person;
	}

	private void addPerson(String firstname, String lastname, int age) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Person thePerson = new Person();
		thePerson.setFirstname(firstname);
		thePerson.setLastname(lastname);
		thePerson.setAge(age);
		session.save(thePerson);
		session.getTransaction().commit();
		
	}

	private List listPerson() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List result = session.createQuery("from Person").list();
		session.getTransaction().commit();
		return result;
	}

	private void addPersonToEvent(long personId, long eventId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Person person = (Person) session.load(Person.class, personId);
		Event event = (Event) session.load(Event.class, eventId);
		
		person.getEvents().add(event);
		
		session.getTransaction().commit();
		
		
	}

	private void createAndStoreEvent(String title, Date theDate) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Event theEvent = new Event();
		theEvent.setTitle(title);
		theEvent.setDate(theDate);
		session.save(theEvent);
		session.getTransaction().commit();
	}
	
	private List listEvents(){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List result = session.createQuery("from Event").list();
		session.getTransaction().commit();
		return result;
		
	}

}
