package com.example.demo.services;

import com.example.demo.dto.BookAuthorResult;
import com.example.demo.interfaces.IReadWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadWriteService implements IReadWriteService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<BookAuthorResult> getALlBooks() {
        LookupOperation lookupOperation = LookupOperation.newLookup()
                .from("author")
                .localField("author")
                .foreignField("name")
                .as("authorDetails");

        Aggregation aggregation = Aggregation.newAggregation(lookupOperation);
        List<BookAuthorResult> results = mongoTemplate.aggregate(aggregation, "books",BookAuthorResult.class).getMappedResults();

        return results;
    }
}
