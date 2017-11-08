package com.storiyo.server.service.JPA;

import com.storiyo.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
