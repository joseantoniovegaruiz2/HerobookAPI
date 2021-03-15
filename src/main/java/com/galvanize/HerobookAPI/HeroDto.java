package com.galvanize.HerobookAPI;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/HeroApi")
public class HeroDto {
    List<HeroDto> listOfHeroes=new ArrayList<>();


    @PostMapping("/Heroes")
    public void addHeroes(@RequestBody HeroDto heroDto){
        this.listOfHeroes.add(heroDto);



}

}
