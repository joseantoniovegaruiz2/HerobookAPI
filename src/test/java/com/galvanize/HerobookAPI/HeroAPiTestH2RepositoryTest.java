package com.galvanize.HerobookAPI;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
public class HeroAPiTestH2RepositoryTest {
    @Mock
    BookHeroRepository mockBookHeroRepository;
    @InjectMocks
    BookHeroService subject;

    @Test
    void create() {
        HeroDto heroDto = new HeroDto("Hero Monkey King");
        subject.create(heroDto);
        verify(mockBookHeroRepository).save(
                new Hero("Hero Monkey King")
        );
    }

    @Test
    void fetchHero()
    {

    }

}
