package com.hackathon3.repository;

import com.hackathon3.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsersRepo extends JpaRepository<Users,Long> {
    Optional <Users> findByName(String name);

    Users findByNameIgnoreCase(String name);
}
