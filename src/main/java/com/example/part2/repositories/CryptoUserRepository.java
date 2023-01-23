package com.example.part2.repositories;

import com.example.part2.models.CryptoUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CryptoUserRepository extends CrudRepository<CryptoUser,Long> {
    @Query("FROM CryptoUser WHERE email = ?1")
    CryptoUser findByEmail(String email);
}
