package com.xworkz.coreapp;

import com.xworkz.coreapp.components.blanket.Blanket;
import com.xworkz.coreapp.components.blender.Blender;
import com.xworkz.coreapp.components.bottle.Bottle;
import com.xworkz.coreapp.components.brush.Brush;
import com.xworkz.coreapp.components.chair.Chair;
import com.xworkz.coreapp.components.comb.Comb;
import com.xworkz.coreapp.components.company.Company;
import com.xworkz.coreapp.components.couch.Couch;
import com.xworkz.coreapp.components.cup.Cup;
import com.xworkz.coreapp.components.earring.Earring;
import com.xworkz.coreapp.components.fan.Fan;
import com.xworkz.coreapp.components.fridge.Fridge;
import com.xworkz.coreapp.components.guitar.Guitar;
import com.xworkz.coreapp.components.hat.Hat;
import com.xworkz.coreapp.components.hospital.Hospital;
import com.xworkz.coreapp.components.hotel.Hotel;
import com.xworkz.coreapp.components.institute.Institute;
import com.xworkz.coreapp.components.laptop.Laptop;
import com.xworkz.coreapp.components.microwave.Microwave;
import com.xworkz.coreapp.components.mirror.Mirror;
import com.xworkz.coreapp.components.necklace.Necklace;
import com.xworkz.coreapp.components.shampoo.Shampoo;
import com.xworkz.coreapp.components.shirt.Shirt;
import com.xworkz.coreapp.components.shoes.Shoes;
import com.xworkz.coreapp.components.smartphone.SmartPhone;
import com.xworkz.coreapp.components.sofa.Sofa;
import com.xworkz.coreapp.components.television.Television;
import com.xworkz.coreapp.components.trainee.Trainee;
import com.xworkz.coreapp.components.umbrella.Umbrella;
import com.xworkz.coreapp.config.CoreConfiguration;
import com.xworkz.coreapp.components.internet.Internet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class CoreRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguration.class);

//        Internet internet = applicationContext.getBean(Internet.class);
//        internet.setInternetId(1);
//        internet.setName("jio");

        String brand = applicationContext.getBean(String.class);
        System.out.println("Brand " + brand);

        Integer age = applicationContext.getBean("getAge", Integer.class);
        Integer pincode = applicationContext.getBean("getPincode", Integer.class);

        List<String> list = applicationContext.getBean("places", List.class);
        System.out.println(list);

//        Internet internet1 = applicationContext.getBean("i", Internet.class);
//        System.out.println(internet1);

        // List<UserDto> user = ac.getBean();

        System.out.println(age);
        System.out.println(pincode);

//        System.out.println(internet);


        Blanket blanket = applicationContext.getBean(Blanket.class);
        System.out.println(blanket);

        Blender blender = applicationContext.getBean(Blender.class);
        System.out.println(blender);

        Bottle bottle = applicationContext.getBean(Bottle.class);
        System.out.println(bottle);

        Brush brush = applicationContext.getBean(Brush.class);
        System.out.println(brush);

        Chair chair = applicationContext.getBean(Chair.class);
        System.out.println(chair);

        Comb comb = applicationContext.getBean(Comb.class);
        System.out.println(comb);

        Company company = applicationContext.getBean(Company.class);
        System.out.println(company);

        Couch couch = applicationContext.getBean(Couch.class);
        System.out.println(couch);

        Cup cup = applicationContext.getBean(Cup.class);
        System.out.println(cup);

        Earring earring = applicationContext.getBean(Earring.class);
        System.out.println(earring);

        Fan fan = applicationContext.getBean(Fan.class);
        System.out.println(fan);

        Fridge fridge = applicationContext.getBean(Fridge.class);
        System.out.println(fridge);

        Guitar guitar = applicationContext.getBean(Guitar.class);
        System.out.println(guitar);

        Hat hat = applicationContext.getBean(Hat.class);
        System.out.println(hat);

        Hospital hospital = applicationContext.getBean(Hospital.class);
        System.out.println(hospital);

        Hotel hotel = applicationContext.getBean(Hotel.class);
        System.out.println(hotel);

        Institute institute = applicationContext.getBean(Institute.class);
        System.out.println(institute);

        Laptop laptop = applicationContext.getBean(Laptop.class);
        System.out.println(laptop);

        Microwave microwave = applicationContext.getBean(Microwave.class);
        System.out.println(microwave);

        Mirror mirror = applicationContext.getBean(Mirror.class);
        System.out.println(mirror);

        Necklace necklace = applicationContext.getBean(Necklace.class);
        System.out.println(necklace);

        Shampoo shampoo = applicationContext.getBean(Shampoo.class);
        System.out.println(shampoo);

        Shirt shirt = applicationContext.getBean(Shirt.class);
        System.out.println(shirt);

        Shoes shoes = applicationContext.getBean(Shoes.class);
        System.out.println(shoes);

        SmartPhone smartPhone = applicationContext.getBean(SmartPhone.class);
        System.out.println(smartPhone);

        Sofa sofa = applicationContext.getBean(Sofa.class);
        System.out.println(sofa);

        Television television = applicationContext.getBean(Television.class);
        System.out.println(television);

        Trainee trainee = applicationContext.getBean(Trainee.class);
        System.out.println(trainee);

        Umbrella umbrella = applicationContext.getBean(Umbrella.class);
        System.out.println(umbrella);

        System.out.println("main ended");
    }

}
