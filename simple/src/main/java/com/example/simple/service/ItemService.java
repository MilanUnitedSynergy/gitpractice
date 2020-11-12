package com.example.simple.service;

import com.example.simple.elastic.ItemElastic;
import com.example.simple.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemElastic itemElastic;

    public Item getOne(Long id){
        return  itemElastic.findById(id).get();
    }

    public Item addItem(Item newItem){
        return itemElastic.save(newItem);
    }
}

