package com.galvanize.HerobookAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBookHero {
    @Autowired
    private final BookHeroRepository bookHeroRepository;

    public ServiceBookHero(BookHeroRepository bookHeroRepository) {
        this.bookHeroRepository = bookHeroRepository;
    }



    public void create(Hero hero) {
        bookHeroRepository.save(new Hero(hero.getHeroName()));
    }
}
