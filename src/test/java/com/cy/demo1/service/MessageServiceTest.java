package com.cy.demo1.service;

import com.cy.demo1.entity.Message;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wander on 2019/3/12.
 */
public class MessageServiceTest {
    @Test
    public void getAllMessages() throws Exception {
        MessageService messageService = new MessageService();
        messageService.getAllMessages();
    }

    @Test
    public void addMessage(){
        Message message = new Message();
        message.setText("wander test message");
        MessageService service = new MessageService();
        service.addMessage(message);
    }

}