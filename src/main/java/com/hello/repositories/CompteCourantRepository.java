package com.hello.repositories;

import com.hello.models.CompteCourant;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called CompteCourantRepository
// CRUD refers Create, Read, Update, Delete

public interface CompteCourantRepository extends CrudRepository<CompteCourant, Integer> {

}
