package com.galvanize.HerobookAPI;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//call /HeroApi/Heroes

@RestController
//@RequestMapping("/HeroApi")
public class HeroController {
    List<Hero> listOfHeroes;

    ServiceBookHero serviceBookHero;

    public HeroController(ServiceBookHero serviceBookHero) {
        this.serviceBookHero = serviceBookHero;
    }
//
//    public HeroController() {
//        this.listOfHeroes = new ArrayList<>();
//    }


    @PostMapping("heroes")
    @ResponseStatus(HttpStatus.CREATED)
    public void addHeroes(@RequestBody Hero hero){
   //     this.listOfHeroes.add(hero);
        serviceBookHero.create(hero);


}
    @GetMapping("heroes")
    public List<Hero> getHeroes(){
        return listOfHeroes;
    }

}
