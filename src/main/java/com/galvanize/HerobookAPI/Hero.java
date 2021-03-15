package com.galvanize.HerobookAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String heroName;

    public Hero(String heroName) {
        this.heroName=heroName;
    }
}
