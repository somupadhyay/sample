package org.hibernate.tutorial.hbm.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.tutorial.hbm.util.HibernateUtil;

public class HibernateMapTest {
	
	public static void main(String[] args) {
		HibernateMapTest mapTest = new HibernateMapTest();
		mapTest.createAndStoreMaps("Somnath", "Software Engineer");
		mapTest.createAndStoreMaps("Jankai", "Lecturer");
		
		List<MapDomain> maps = mapTest.listMaps("from MapDomain");
		for(MapDomain map:maps){
			System.out.println("your name is "+map.getName());
			System.out.println("your map values are "+map.getMapValue().toString());
		}
	}
	
	public void createAndStoreMaps(String name, String value){
		MapDomain domain = new MapDomain();
		domain.setName(name);
		domain.setValue(value);
		Map<String, String> mymap = new HashMap<String, String>();
		mymap.put("What is your name", name);
		mymap.put("what is your value", value);
		domain.setMapValue(mymap);
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(domain);
		session.getTransaction().commit();
	}

	public List<MapDomain> listMaps(String hql){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Query query = session.createQuery(hql);
		List<MapDomain> list = query.list();
		return list;
	}
}
