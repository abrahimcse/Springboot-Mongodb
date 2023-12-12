package com.ctech.rbacsystem.services.impl;

import com.ctech.rbacsystem.dtos.RolesDTO;
import com.ctech.rbacsystem.entities.Role;
import com.ctech.rbacsystem.repositories.RolesRepository;
import com.ctech.rbacsystem.services.RolesService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RolesServiceImpl implements RolesService {

  private final RolesRepository rolesRepository;

  @Override
  public Role saveRole(RolesDTO rolesDTO) {
    Role roles = new Role();
    BeanUtils.copyProperties(rolesDTO, roles);
    return rolesRepository.save(roles);
  }

  @Override
  public List<Role> getRoles() {
    return rolesRepository.findAll();
  }

  @Override
  public void deleteRoleById(String rid) {
    rolesRepository.deleteById(rid);

  }

}
