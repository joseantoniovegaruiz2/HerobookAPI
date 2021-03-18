package com.galvanize.HerobookAPI;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String heroName;
    String image;
    String realName;
    float height;
    float weight;
    String specialPower;
    int intelligence;
    int strength;
    int power;
    int speed;
    int agility;
    String description;
    String story;

    public Hero(String heroName) {
        this.heroName=heroName;
    }

    public Hero(String heroName, String image,
                   String realName, float height,
                   float weight, String specialPower,
                   int intelligence, int strength,
                   int power, int speed, int agility,
                   String description, String story) {
        this.heroName = heroName;
        this.image = image;
        this.realName = realName;
        this.height = height;
        this.weight = weight;
        this.specialPower = specialPower;
        this.intelligence = intelligence;
        this.strength = strength;
        this.power = power;
        this.speed = speed;
        this.agility = agility;
        this.description = description;
        this.story = story;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Float.compare(hero.height, height) == 0 && Float.compare(hero.weight, weight) == 0 && intelligence == hero.intelligence && strength == hero.strength && power == hero.power && speed == hero.speed && agility == hero.agility && heroName.equals(hero.heroName) && image.equals(hero.image) && realName.equals(hero.realName) && specialPower.equals(hero.specialPower) && description.equals(hero.description) && story.equals(hero.story);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heroName, image, realName, height, weight, specialPower, intelligence, strength, power, speed, agility, description, story);
    }
}
