package com.galvanize.HerobookAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookHeroRepository extends JpaRepository<Hero,Long>{


}