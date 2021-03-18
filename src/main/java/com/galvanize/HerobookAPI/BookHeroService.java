package com.galvanize.HerobookAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookHeroService {

    private final BookHeroRepository bookHeroRepository;
    @Autowired
    public BookHeroService(BookHeroRepository bookHeroRepository) {
        this.bookHeroRepository = bookHeroRepository;
    }



    public void create(Hero heroDto) {

        bookHeroRepository.save(
                new Hero(heroDto.getHeroName())
        );
    }

    public List<Hero> fetchOne(Hero hero) {
        return null;
    }
}
