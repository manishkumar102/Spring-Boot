package net.guides.springboot2.crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import net.guides.springboot2.crud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}