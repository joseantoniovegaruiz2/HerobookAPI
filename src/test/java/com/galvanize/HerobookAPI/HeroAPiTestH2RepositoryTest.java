package com.galvanize.HerobookAPI;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HeroAPiTestH2RepositoryTest {
    @Mock
    BookHeroRepository mockBookHeroRepository;
    @InjectMocks
    BookHeroService subject;

    @Test
    void create() {
        Hero heroDto = new Hero("Hero Monkey King");
        subject.create(heroDto);
        verify(mockBookHeroRepository).save(
                new Hero("Hero Monkey King")
        );
    }

    @Test
    void fetchHero()
    {
        Hero hero = new Hero("Hero Monkey King");
        when(mockBookHeroRepository.findAll()).thenReturn(
                Arrays.asList(
                        hero,
                        new Hero("Hero Lion King")
                )
        );
        // E Exercise
        Optional<Hero> actual = subject.fetchOne(1L);
        // A Assert
        assertThat(actual).isEqualTo(
                hero
        );
    }

}


