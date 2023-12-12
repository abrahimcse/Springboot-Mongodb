package com.ctech.rbacsystem.services.impl;

import com.ctech.rbacsystem.dtos.UsersDTO;
import com.ctech.rbacsystem.entities.Role;
import com.ctech.rbacsystem.entities.User;
import com.ctech.rbacsystem.exceptions.EntityNotFoundException;
import com.ctech.rbacsystem.repositories.RolesRepository;
import com.ctech.rbacsystem.repositories.UsersRepository;
import com.ctech.rbacsystem.services.UsersService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

  private final UsersRepository usersRepository;
  private final RolesRepository rolesRepository;

  @Override
  public User saveUser(UsersDTO usersDTO) {
    Optional<Role> roles = rolesRepository.findById(usersDTO.getRoleId());
    if (!roles.isPresent()) {
      throw new EntityNotFoundException("Role Not Found");
    }
    User userToCreate = new User();
    BeanUtils.copyProperties(usersDTO, userToCreate);
    userToCreate.setRoles(roles.get());
    return usersRepository.save(userToCreate);
  }

  @Override
  public List<User> getUsers() {
    return usersRepository.findAll();
  }

  @Override
  public void deleteById(String uid) {
    usersRepository.deleteById(uid);
  }

}
