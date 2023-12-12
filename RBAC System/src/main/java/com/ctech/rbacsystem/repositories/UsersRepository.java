package com.ctech.rbacsystem.repositories;

import com.ctech.rbacsystem.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<User, String> {

}
