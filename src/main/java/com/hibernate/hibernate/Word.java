package com.hibernate.hibernate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String value;
}
