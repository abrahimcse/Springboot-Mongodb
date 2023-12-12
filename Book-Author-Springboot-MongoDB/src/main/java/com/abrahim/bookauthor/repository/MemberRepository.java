package com.abrahim.bookauthor.repository;

import com.abrahim.bookauthor.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member,String> {

}
