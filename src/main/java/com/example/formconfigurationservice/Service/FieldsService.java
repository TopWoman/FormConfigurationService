package com.example.formconfigurationservice.Service;

import com.example.formconfigurationservice.Models.Fields;
import com.example.formconfigurationservice.Repository.FieldsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FieldsService {
    @Autowired
    private final FieldsRepository fieldsRepository;

    public Fields addFields(Fields fields){
        fieldsRepository.insert(fields);
        return fields;
    }
}
