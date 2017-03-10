package com.fun.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Ira on 3/10/2017.
 */
public class JsonReader {

    private ObjectMapper mapper;
    private File file;

    public JsonReader(File file) {
        this.file = file;
        mapper = new ObjectMapper();
    }

    public <T> List<T> readToList(Class<T> contentClass) {
        List<T> values = null;
        try {
            values = mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(List.class, contentClass));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return values;
    }
}
