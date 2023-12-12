package com.ctech.rbacsystem.repositories;

import com.ctech.rbacsystem.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends MongoRepository<Role, String> {

}
