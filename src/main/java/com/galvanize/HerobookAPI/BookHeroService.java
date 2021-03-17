package com.galvanize.HerobookAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookHeroService {

    private final BookHeroRepository bookHeroRepository;
    @Autowired
    public BookHeroService(BookHeroRepository bookHeroRepository) {
        this.bookHeroRepository = bookHeroRepository;
    }



    public void create(HeroDto heroDto) {

        bookHeroRepository.save(
                new Hero(heroDto.getHeroName())
        );
    }
}
