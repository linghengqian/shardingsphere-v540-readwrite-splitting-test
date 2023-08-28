package com.lingh.shardingspherev540readwritesplittingtest;

import com.lingh.shardingspherev540readwritesplittingtest.mapper.TOrderMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MapperLayerTests {
    @Autowired
    TOrderMapper tOrderMapper;

    @AfterEach
    void after() {
        tOrderMapper.deleteAll();
    }

    @Test
    void whenRequestToFindAll() {
        assertEquals(tOrderMapper.findAll().size(), 0);
    }

    @Test
    void whenRequestToAddByNameAndUserId() {
        int firstNumberOfAffectedRows = tOrderMapper.addAll("Bright", 114514L);
        int secondNumberOfAffectedRows = tOrderMapper.addAll("Jordan", 114515L);
        assertEquals(firstNumberOfAffectedRows + secondNumberOfAffectedRows, 2);
        assertEquals(tOrderMapper.findAll().size(), 2);
    }

    @Test
    void whenRequestToDeleteById() {
        tOrderMapper.addAll("Bright", 114514L);
        tOrderMapper.addAll("Jordan", 114515L);
        tOrderMapper.addAll("Lemon", 114516L);
        tOrderMapper.addAll("Jack", 114517L);
        tOrderMapper.addAll("Michael", 114518L);
        tOrderMapper.addAll("Tony", 114519L);
        int numberOfAffectedRows = tOrderMapper.deleteById(114514L);
        assertEquals(numberOfAffectedRows, 1);
        assertEquals(tOrderMapper.findAll().size(), 5);
    }

    @Test
    void whenRequestToDeleteAll() {
        tOrderMapper.addAll("Bright", 114514L);
        tOrderMapper.addAll("Jordan", 114515L);
        tOrderMapper.addAll("Lemon", 114516L);
        tOrderMapper.addAll("Jack", 114517L);
        tOrderMapper.addAll("Michael", 114518L);
        tOrderMapper.addAll("Tony", 114519L);
        int numberOfAffectedRows = tOrderMapper.deleteAll();
        assertEquals(numberOfAffectedRows, 6);
        assertEquals(tOrderMapper.findAll().size(), 0);
    }

}
