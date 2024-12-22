package com.example.amineproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

public class BookDTO {
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class BookDTO {

        private String titre;

        private String publisher;

        private LocalDate datePublication;

        private Double price;

        private String resume;
    }
}
