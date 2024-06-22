package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
@Slf4j
public class ContactController {
   // private Logger log = Logger.getLogger(ContactController.class.getName());

    private final ContactService contactService;

    @Autowired
    ContactController(ContactService contactService){
        this.contactService = contactService;
    }
    @RequestMapping("/contact")
    public String disPlayContact(Model model){
        model.addAttribute("contact", new Contact());
        return "contact.html";
    }

    /*@RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
                                    @RequestParam String email, @RequestParam String subject,
                                    @RequestParam String message){
        log.info("Name: "+name);
        log.info("Mobile Number: : "+mobileNum);
        log.info("Email: "+email);
        log.info("Subject: "+subject);
        log.info("Message: "+message);
        return new ModelAndView("redirect:/contact");
    }*/

    @RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors){
        if(errors.hasErrors()){
            log.error("Contact form Validation failed due to : "+errors.toString());
            return "contact.html";
        }
        contactService.saveMessage(contact);
        contactService.setCounter(contactService.getCounter()+1);
        log.info("Number of time the Contact from is submitted: "+ contactService.getCounter());
        return "redirect:/contact";
    }
}
