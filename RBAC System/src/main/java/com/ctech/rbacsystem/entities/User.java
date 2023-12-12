package com.ctech.rbacsystem.entities;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@Document(collection = "user")
public class User extends BaseModel {

  @Id
  private String uid;
  private String name;
  private boolean approved;
  private boolean status;
  @DBRef
  private Role roles;


}
