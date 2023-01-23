package com.example.part2.repositories;

import com.example.part2.models.CryptoUser;
import com.example.part2.models.Token;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TokenRepository extends CrudRepository<Token,Integer> {

    @Query("FROM Token WHERE price > 5000")
    Token findByEmail();
}
