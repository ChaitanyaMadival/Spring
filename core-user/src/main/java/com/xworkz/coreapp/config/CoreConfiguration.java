package com.xworkz.coreapp.config;


import com.xworkz.coreapp.components.internet.Internet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.coreapp")
public class CoreConfiguration {

    public CoreConfiguration(){
        System.out.println("Configuration is invoked..");
    }

    @Bean
    public  String getBrand(){
        return  "Puma";
    }

    @Bean
    public  Integer getAge(){
        return  77;
    }

    @Bean
    public  Integer getPincode(){
        return 5674837;
    }

    @Bean("places")
    public List<String> getPlaces(){
        List<String> list = new ArrayList<String>();
        list.add("Sirsi");
        list.add("Goa");

        return  list;
    }

    @Bean("i")
    public Internet getAnotherInternet(){
        return new Internet();
    }

    }



