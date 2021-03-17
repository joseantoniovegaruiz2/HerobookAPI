package com.galvanize.HerobookAPI;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//call /HeroApi/Heroes

@RestController
//@RequestMapping("/HeroApi")
public class HeroController {
    List<HeroDto> listOfHeroes;

    BookHeroService bookHeroService;

    public HeroController(BookHeroService bookHeroService) {
        this.bookHeroService = bookHeroService;
    }
//
//    public HeroController() {
//        this.listOfHeroes = new ArrayList<>();
//    }


    @PostMapping("heroes")
    @ResponseStatus(HttpStatus.CREATED)
    public void addHeroes(@RequestBody HeroDto hero){
        this.listOfHeroes.add(hero);
        bookHeroService.create(hero);


}
    @GetMapping("heroes")
    public List<HeroDto> getHeroes(){
        return listOfHeroes;
    }

}
