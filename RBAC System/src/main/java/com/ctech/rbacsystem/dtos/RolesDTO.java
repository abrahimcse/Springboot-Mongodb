package com.ctech.rbacsystem.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RolesDTO {

  private String rName;
  private String[] privileges;
}
