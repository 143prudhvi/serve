package com.simplify.serve.controller;

import java.util.List;

import com.simplify.serve.entity.Contact;
import com.simplify.serve.service.contactservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class contactcontroller {
    
    @Autowired
    private contactservice service;

    @PostMapping("/addcontact")
    public Contact addContact(@RequestBody Contact contact){
        return service.saveContact(contact);
    }

    @PostMapping("/addcontacts")
    public List<Contact> addContacts(@RequestBody List<Contact> contacts){
        return service.saveContacts(contacts);
    }

    @GetMapping("/contacts")
    public List<Contact> findAllContacts(){
        return service.getContacts();
    }

    @GetMapping("/contact/{phone}")
    public Contact findContactById(@PathVariable long phone){
        return service.getContactById(phone);
    }

    @PutMapping("/updatecontact")
    public Contact updateContact(@RequestBody Contact contact){
        return service.updateContact(contact);
    }

    @DeleteMapping("/deletecontact/{phone}")
    public int deleteContact(@PathVariable long phone){
        return service.deleteContact(phone);
    }
}
