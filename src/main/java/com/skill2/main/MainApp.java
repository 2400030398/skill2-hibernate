package com.skill2.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.skill2.entity.Product;
import com.skill2.util.HibernateUtil;


public class MainApp {

    public static void main(String[] args) {

        // INSERT
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p1 = new Product("Laptop", "HP Laptop", 55000, 5);
        Product p2 = new Product("Mobile", "Samsung", 25000, 10);

        session.save(p1);
        session.save(p2);

        tx.commit();
        session.close();

        // READ
        session = HibernateUtil.getSessionFactory().openSession();
        Product product = session.get(Product.class, 1);
        System.out.println("Product Name: " + product.getName());
        session.close();

        // UPDATE
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        product.setPrice(60000);
        session.update(product);
        tx.commit();
        session.close();

        // DELETE
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        Product deleteProduct = session.get(Product.class, 2);
        session.delete(deleteProduct);
        tx.commit();
        session.close();

        System.out.println("CRUD Operations Completed");
    }
}
