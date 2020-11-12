package com.example.simple.elastic;

import com.example.simple.model.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemElastic extends ElasticsearchRepository<Item, Long> {
}
