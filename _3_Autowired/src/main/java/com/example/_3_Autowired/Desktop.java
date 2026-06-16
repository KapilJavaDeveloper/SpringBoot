package com.example._3_Autowired ;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
public class Desktop implements ShapeInterface{
    @Override
    public void compile(){
        System.out.println("Desktop compile the code.") ;
    }


}