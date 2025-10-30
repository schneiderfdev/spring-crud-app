package com.crudlogin.userlogin.repositories;

import com.crudlogin.userlogin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
