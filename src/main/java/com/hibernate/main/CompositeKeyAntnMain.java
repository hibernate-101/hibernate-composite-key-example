package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.BillingAdressAntn;
import com.hibernate.model.PurchaseOrderAntn;
import com.hibernate.util.HibernateAntnUtil;

public class CompositeKeyAntnMain {
	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		sessionFactory=HibernateAntnUtil.getSessionFactory();
		session=sessionFactory.getCurrentSession();
		tx=session.beginTransaction();
		BillingAdressAntn billingAdress=new BillingAdressAntn();
		billingAdress.setCity("Delhi");
        billingAdress.setStreet("Mukharjee Nagar");
		PurchaseOrderAntn order=new PurchaseOrderAntn();
		order.setItemName("Mobile");
		order.setBillingAddress(billingAdress);
		session.save(order);
		tx.commit();
		System.out.println("Data inserted into DB successfully");
		sessionFactory.close();
	}

}
