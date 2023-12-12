package com.ctech.rbacsystem.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsersDTO {

  private String name;
  private boolean approved;
  private boolean status;
  private String roleId;


}
