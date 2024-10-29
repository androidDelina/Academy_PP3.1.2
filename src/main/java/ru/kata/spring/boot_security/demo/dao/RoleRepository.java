package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kata.spring.boot_security.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query("SELECT role FROM Role role LEFT JOIN FETCH role.users WHERE role.role = :roleName")
    Role findByName(String roleName);

}
