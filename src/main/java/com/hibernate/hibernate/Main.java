package com.hibernate.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Word.class)
                .getMetadataBuilder()
                .build();

        try (
                SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
                Session session = sessionFactory.openSession();
                ) {
            Transaction transaction = session.beginTransaction();
            Word word1 = new Word();
            Word word2 = new Word();
            Word word3 = new Word();
            Word word4 = new Word();

            word1.setValue("qqqq");
            word2.setValue("wwww");
            word3.setValue("eeee");
            word4.setValue("rrrr");

            session.save(word1);
            session.save(word2);
            session.save(word3);
            session.save(word4);

            transaction.commit();

        }
    }
}
