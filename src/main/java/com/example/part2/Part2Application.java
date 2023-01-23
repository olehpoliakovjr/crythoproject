package com.example.part2;

import com.example.part2.models.CryptoUser;
import com.example.part2.models.Token;
import com.example.part2.repositories.CryptoUserRepository;
import com.example.part2.repositories.TokenRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Part2Application {

    public static void main(String[] args) {
        SpringApplication.run(Part2Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CryptoUserRepository users, TokenRepository tokenRepository){
        return args -> {
            users.save(new CryptoUser("hamster","hamster@gmail.com","hamster","ROLE_USER"));
            users.save(new CryptoUser("user","user@gmail.com","user","ROLE_USER"));
            tokenRepository.save(new Token("Luna","100000",51000));
            tokenRepository.save(new Token("FTT","100000",55000));

        };
    }
}
