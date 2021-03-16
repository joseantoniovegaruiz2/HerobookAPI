package com.galvanize.HerobookAPI;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//call /HeroApi/Heroes

@RestController
@RequestMapping("/HeroApi")
public class HeroController {
    List<Hero> listOfHeroes;

    public HeroController() {
        this.listOfHeroes = new ArrayList<>();
    }

    @PostMapping("/Heroes")
    @ResponseStatus(HttpStatus.CREATED)
    public void addHeroes(@RequestBody Hero hero) {
        
        this.listOfHeroes.add(hero);
    }

    @GetMapping("/Heroes")
    public List<Hero> getHeroes() {
        return listOfHeroes;
    }

}
