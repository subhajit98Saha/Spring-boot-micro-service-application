package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list = List.of(
            new Contact(124L,"Contac1@email.com","Contac1",112L),
            new Contact(125L,"Contac2@email.com","Contac2",112L),
            new Contact(126L,"Contac3@email.com","Contac3",1128L),
            new Contact(127L,"Contac4@email.com","Contac4",1524L)
    );
    @Override
    public List<Contact> getContacOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
