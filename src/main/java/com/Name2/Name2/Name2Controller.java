package com.Name2.Name2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

@Controller

public class Name2Controller {

    @PostMapping("add")
    public ResponseEntity<Name2Result> add (@RequestBody Name2Result parameter){
     Name2Result name = new Name2Result();
     name.Result=parameter.value1+parameter.value2;
     name.value1=parameter.value1;
     name.value2= parameter.value2;
     name.opreation="addition";



        return new ResponseEntity<>(name, HttpStatus.OK);
    }
    @PostMapping("concate")
    public ResponseEntity<Name3Result> Summit(@RequestBody Name3Result parameter){
        Name3Result name=new Name3Result();
        name.Result=parameter.fname+parameter.lname;
        name.fname=parameter.fname;
        name.lname=parameter.lname;
        name.opreation="Concatetion";
        return new ResponseEntity<>(name,HttpStatus.OK);

    }
    @PostMapping("ArrayList")
    public ResponseEntity<List<Name4Result>> Sumit(@RequestBody List<Name4Result> parameter){

        List<Name4Result>name4=new ArrayList<>();
        for( Name4Result op:parameter){
            Name4Result name=new Name4Result();
            name.fname=op.fname;
            name.lname=op.lname;
            name.PhoneNumber=op.PhoneNumber;
            name.opration="Variousname";
            name4.add(name);


        }
        return new ResponseEntity<>( name4,HttpStatus.OK);
    }








}
