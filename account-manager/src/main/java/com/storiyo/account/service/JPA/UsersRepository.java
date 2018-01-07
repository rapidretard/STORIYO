package com.storiyo.account.service.JPA;

import com.storiyo.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
