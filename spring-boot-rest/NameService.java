package com.example.project_rest;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NameService {
    @Autowired
    private NameRepository repo;

    public List<Name> listAll() {
        return repo.findAll();
    }

    public void save(Name product) {
        repo.save(product);
    }

    public Name get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
