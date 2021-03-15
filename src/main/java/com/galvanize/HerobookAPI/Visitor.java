package com.galvanize.HerobookAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    String email;

    public Visitor(String email) {
        this.email=email;
    }
}
