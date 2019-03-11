package com.cy.demo1.service;

import com.cy.demo1.dao.MessageDao;
import com.cy.demo1.entity.Message;
import com.cy.demo1.utils.HibernateUtils;

import javax.persistence.EntityManager;
import javax.transaction.*;
import java.util.List;

/**
 * Created by wander on 2019/3/12.
 */
public class MessageService implements MessageDao {
    @Override
    public int getMessageCount() {

        return 0;
    }

    public void addMessage(Message message){
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        em.persist(message);
        em.getTransaction().commit();

    }

    public List<Message> getAllMessages(){
        EntityManager em = HibernateUtils.getEntityManager();
        List<Message> messages =  em.createQuery("SELECT m FROM Message m").getResultList();
        return messages;
    }
}
