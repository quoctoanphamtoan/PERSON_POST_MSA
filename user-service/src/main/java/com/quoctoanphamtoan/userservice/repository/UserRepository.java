package com.quoctoanphamtoan.userservice.repository;

import com.quoctoanphamtoan.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
