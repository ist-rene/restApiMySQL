package com.example.demoRESTDB.database;

import com.example.demoRESTDB.entity.Student;
import com.example.demoRESTDB.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
/*
     private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(StudentRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Student("Max Mustermann", "m.mustermann@domain.com", "Mathematik")));
            log.info("Preloading " + repository.save(new Student("Ida Musterfrau", "i.musterfrau@domain.com", "Informationslogistik")));
        };
    }*/
}