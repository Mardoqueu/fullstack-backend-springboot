package com.mardoqueu.fullstackbackend.repository;

import com.mardoqueu.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
