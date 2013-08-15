package org.hibernate.tutorial.hbm.enumtest;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.tutorial.hbm.enumtest.EnumDomain.MONTHS;
import org.hibernate.tutorial.hbm.enumtest.EnumDomain.PRISMCOLORS;
import org.hibernate.tutorial.hbm.util.HibernateUtil;

public class HibernateEnumTest {
	public static void main(String[] args) {
		HibernateEnumTest enumTest = new HibernateEnumTest();
		enumTest.createAndStoreEnum(MONTHS.AUG, "August month");
		String hql = "from EnumDomain";
		System.out.println("Query Result @@@@@@ \n"+enumTest.listEnumDomain(hql));
	}
	private void createAndStoreEnum(MONTHS month, String description) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		PRISMCOLORS colors;
		EnumDomain enumDomain = new EnumDomain();
		enumDomain.setMonth(month);
		enumDomain.setDescription(description);
		switch (month.ordinal()) {
		case 0:
		case 1:
			colors = PRISMCOLORS.GREEN;
			break;
		case 2:
		case 3:
			colors = PRISMCOLORS.BLUE;
			break;
		case 4:
		case 5:
			colors = PRISMCOLORS.INDIGO;
			break;
		case 6:
		case 7:
			colors = PRISMCOLORS.ORANGE;
			break;
		case 8:
		case 9:
			colors = PRISMCOLORS.RED;
			break;
		case 10:
		case 11:
			colors = PRISMCOLORS.VOILET;
			break;
		default:
			colors = PRISMCOLORS.YELLOW;
			break;

		}
		
		enumDomain.setColor(colors);
		session.save(enumDomain);
		session.getTransaction().commit();
	}


	private List<EnumDomain> listEnumDomain(String hql){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Query query = session.createQuery(hql);
		List<EnumDomain> list = query.list();
		return list;
		
	}
	
}
