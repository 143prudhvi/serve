package com.simplify.serve.service;

import java.util.List;

import com.simplify.serve.entity.Contact;
import com.simplify.serve.repository.contactrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class contactservice {
    
    @Autowired
    private contactrepo repo;
    
    public Contact saveContact(Contact contact){
        return repo.save(contact);
    }
    public List<Contact> saveContacts(List<Contact> contact){
        return repo.saveAll(contact);
    }
    public List<Contact> getContacts(){
        return repo.findAll();
    }
    public Contact getContactById(long phone){
        return repo.findById(phone).orElse(null);
    }
    public int deleteContact(long phone){
        repo.deleteById(phone);
        return 0;
    }
    public Contact updateContact(Contact contact){
        Contact existingContact=repo.findById(contact.getPhone()).orElse(null);
        existingContact.setName(contact.getName());
        existingContact.setPhone(contact.getPhone());
        return repo.save(existingContact);
    }

}
