package com.example._3_Autowired ;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class Working{

    @Autowired
    @Qualifier("desktop")
    private ShapeInterface laptop ;

    public void display(){

        System.out.println("Code is Going to be Compiled.") ;
        laptop.compile() ;

    }
}