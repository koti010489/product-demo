package com.example.demo;

import com.example.demo.util.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calctest {
    @Test
    public void addTest(){
        Calc cal= new Calc();
        int result= cal.add(3,5);
        Assertions.assertEquals(8,result);
    }
}
