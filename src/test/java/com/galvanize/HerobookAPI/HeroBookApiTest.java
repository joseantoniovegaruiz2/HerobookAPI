package com.galvanize.HerobookAPI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class HeroBookApiTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;
//
//    When I view all the heros
//    Then I can see names of all heros
    @Test
    public void HeroBookAddHeroTest() throws Exception {

        Visitor visitor = new Visitor("email");

        Hero hero =new Hero("Hero Monkey King");
        mockMvc.perform(post("/HeroApi/Heroes").contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(hero))
                ).andExpect(status().isCreated());



    }


}
