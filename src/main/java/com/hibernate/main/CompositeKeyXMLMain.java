package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.BillingAddress;
import com.hibernate.model.PurchaseOrder;
import com.hibernate.util.HibernateUtil;

public class CompositeKeyXMLMain {
	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		sessionFactory=HibernateUtil.getSessionFactory();
		session=sessionFactory.getCurrentSession();
		tx=session.beginTransaction();
		BillingAddress billingAdress=new BillingAddress();
		billingAdress.setCity("Delhi");
        billingAdress.setStreet("G.T. Karnal Road");
		PurchaseOrder order=new PurchaseOrder();
		order.setItemName("Laptop");
		order.setBillingAddress(billingAdress);
		session.save(order);
		tx.commit();
		System.out.println("Data inserted into DB successfully");
		sessionFactory.close();
	}

}
