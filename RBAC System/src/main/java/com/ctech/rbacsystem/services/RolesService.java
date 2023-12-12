package com.ctech.rbacsystem.services;

import com.ctech.rbacsystem.dtos.RolesDTO;
import com.ctech.rbacsystem.entities.Role;
import java.util.List;

public interface RolesService {

  List<Role> getRoles();

  void deleteRoleById(String rid);

  Role saveRole(RolesDTO rolesDTO);
}
