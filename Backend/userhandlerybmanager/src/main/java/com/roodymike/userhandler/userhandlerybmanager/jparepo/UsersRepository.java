package com.roodymike.userhandler.userhandlerybmanager.jparepo;

import com.roodymike.userhandler.userhandlerybmanager.jpamodels.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
    Optional<Users> findByUsername(String username);

    Optional<Users> findByAccountId(String accountId);

    Optional<Users> findByEmail(String email);
}