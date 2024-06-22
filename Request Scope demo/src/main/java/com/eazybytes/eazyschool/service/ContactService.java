package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.logging.Logger;

@Slf4j
@Service
//@RequestScope
//@SessionScope
//@ApplicationScope
public class ContactService {
    //private Logger logger = Logger.getLogger(ContactService.class.getName());
    private int counter  = 0;

    ContactService(){
        System.out.println("Contact Service bean initialized");
    }
    public boolean saveMessage(Contact contact){
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
