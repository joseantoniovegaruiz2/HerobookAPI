package com.galvanize.HerobookAPI;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String heroName;

    public Hero(String heroName) {
        this.heroName=heroName;
    }
}
