package com.galvanize.HerobookAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookHeroService {

    private final BookHeroRepository bookHeroRepository;
    @Autowired
    public BookHeroService(BookHeroRepository bookHeroRepository) {
        this.bookHeroRepository = bookHeroRepository;
    }



    public void create(Hero hero) {

        bookHeroRepository.save(
                new Hero(hero.heroName, hero.image, hero.realName, hero.height,
                        hero.weight, hero.specialPower, hero.intelligence,
                        hero.strength, hero.power, hero.speed, hero.agility,
                        hero.description, hero.story)
        );
    }

    public Optional<Hero> fetchOne(Long id) {

        return bookHeroRepository.findById(id);
    }
}
