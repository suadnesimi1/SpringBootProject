package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig extends IllegalArgumentException{

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Ege = new Student(
                    "Ege",
                    "ege123@gmail.com",
                    LocalDate.of(1996, 11, 9)
                    );

            Student Merjem = new Student (
                    "Merjem",
                    "merjem@gmail.com",
                    LocalDate.of(2000, 10, 19)
                    );

            Student Abdi = new Student(
                    "Abdi",
                    "abdi432@gmail.com",
                    LocalDate.of(1999, 5, 10)
            );

            repository.saveAll(List.of(Ege, Merjem,Abdi));
        };
    }
}
