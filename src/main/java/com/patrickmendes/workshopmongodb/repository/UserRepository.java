package com.patrickmendes.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.patrickmendes.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}