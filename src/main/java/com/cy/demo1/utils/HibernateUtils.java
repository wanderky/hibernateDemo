package com.cy.demo1.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by wander on 2019/3/12.
 */
public class HibernateUtils {
    public static EntityManager getEntityManager(){
        EntityManagerFactory factory =  Persistence.createEntityManagerFactory("DevPU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

}
