package com.example.demo.bo;

import com.example.dto.Man;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ManBoTest {
@Autowired
private ManBo manBo;
    @Test
    public void query() {
        List<Man> man=manBo.query();
        man.stream().forEach(System.out::println);
    }
}