package com.example._3_Autowired ;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
//@Primary
public class Laptop implements ShapeInterface{

    @Override
    public void compile(){
        System.out.println("Laptop Compile the code") ;
    }

}