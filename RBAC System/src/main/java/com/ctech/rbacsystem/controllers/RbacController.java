package com.ctech.rbacsystem.controllers;

import com.ctech.rbacsystem.dtos.RolesDTO;
import com.ctech.rbacsystem.dtos.UsersDTO;
import com.ctech.rbacsystem.entities.Role;
import com.ctech.rbacsystem.entities.User;
import com.ctech.rbacsystem.services.RolesService;
import com.ctech.rbacsystem.services.UsersService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rbac")
public class RbacController {

  private final UsersService usersService;
  private final RolesService rolesService;

  @PostMapping("/user")
  public ResponseEntity<User> addUser(@RequestBody UsersDTO usersDTO) {
    return ResponseEntity.ok(usersService.saveUser(usersDTO));
  }

  @GetMapping("/user")
  public ResponseEntity<List<User>> showEmployee() {
    return ResponseEntity.ok(usersService.getUsers());
  }

  @DeleteMapping("/user/delete/{id}")
  public String deleteUser(@PathVariable(value = "id") String uid) {
    usersService.deleteById(uid);
    return "User Delete successfully";
  }

  @PostMapping("/role")
  public ResponseEntity<Role> addRole(@RequestBody RolesDTO rolesDTO) {
    return ResponseEntity.ok(rolesService.saveRole(rolesDTO));
  }

  @GetMapping("/role")
  public ResponseEntity<List<Role>> showRoles() {
    return ResponseEntity.ok(rolesService.getRoles());

  }

  @DeleteMapping("/role/delete/{id}")
  public String deleteRole(@PathVariable(value = "id") String rid) {
    rolesService.deleteRoleById(rid);
    return "Role Delete Successfully";
  }


}
