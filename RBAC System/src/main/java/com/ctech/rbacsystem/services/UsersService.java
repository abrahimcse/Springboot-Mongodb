package com.ctech.rbacsystem.services;

import com.ctech.rbacsystem.dtos.UsersDTO;
import com.ctech.rbacsystem.entities.User;
import java.util.List;

public interface UsersService {

  User saveUser(UsersDTO usersDTO);

  List<User> getUsers();

  void deleteById(String uid);


}
