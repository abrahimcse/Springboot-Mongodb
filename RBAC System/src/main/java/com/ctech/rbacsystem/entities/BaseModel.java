package com.ctech.rbacsystem.entities;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public abstract class BaseModel {

  private Date createdAt;
  private Date updatedAt;


}
