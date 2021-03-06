package com.example.simple.controller;

import com.example.simple.elastic.ItemElastic;
import com.example.simple.model.Item;
import com.example.simple.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {


    @Autowired
    ItemService itemService;


    @GetMapping(value="api/item/{id}")
    public ResponseEntity<Item> getOne(@PathVariable Long id){
        Item i=itemService.getOne(id);

        return new ResponseEntity<>(i, HttpStatus.FOUND);

    }


    @PostMapping(value="api/item")
    public ResponseEntity<Item> addItem(@RequestBody Item item){
        Item newItem=new Item();
        Item savedItem= itemService.addItem(newItem);

        return new ResponseEntity<>(savedItem, HttpStatus.OK);
    }

}
