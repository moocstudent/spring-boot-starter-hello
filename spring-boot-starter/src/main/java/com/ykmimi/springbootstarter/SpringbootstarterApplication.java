package com.ykmimi.springbootstarter;

import com.wisdom.stat.HelloServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@RestController
public class SpringbootstarterApplication {

    @Resource
    private HelloServiceConfiguration helloService;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstarterApplication.class, args);
    }

    @RequestMapping("")
    public String getIndex(){
        return "this is index";
    }

    @RequestMapping("/name")
    public String getName(){
        return helloService.getName();
    }

    @RequestMapping("/hobby")
    public String getHobby(){
        return helloService.getHobby();
    }

}
