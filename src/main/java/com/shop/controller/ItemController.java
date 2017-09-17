package com.shop.controller;

import com.shop.entity.Item;
import com.shop.repository.DatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Равиль on 17.09.2017.
 */
@RestController
@RequestMapping(path = "/item")
public class ItemController {

    @Autowired
    private DatabaseRepository repository;

    @RequestMapping(path = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<Item> getItem(@PathVariable(value = "id") int id) {
        Item item = repository.getItem(id);
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity<String> createItem(RequestEntity<Item> requestEntity) {
        Item item = requestEntity.getBody();
        repository.addItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteItem(@PathVariable(value = "id") int id) {
        repository.deleteItem(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
