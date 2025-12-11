package com.xworkz;


import com.xworkz.custombeanapp.config.CustomBeanConfiguration;
import com.xworkz.custombeanapp.dto.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CustomBeanRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomBeanConfiguration.class);

       List<HospitalDto> list = applicationContext.getBean("hospital", List.class);
       list.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<BarDto> list2 = applicationContext.getBean("bar", List.class);
        list2.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<BeautyParlourDto> list3 = applicationContext.getBean("parlor", List.class);
        list3.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<BlanketDto> list4= applicationContext.getBean("blanket", List.class);
        list4.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<BlenderDto> list5 = applicationContext.getBean("blender", List.class);
        list5.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<BottleDto> list6 = applicationContext.getBean("bottle", List.class);
        list6.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<BrushDto> list7 = applicationContext.getBean("brush", List.class);
        list7.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<ChairDto> list8 = applicationContext.getBean("chair", List.class);
        list8.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<ChocolateDto> list9 = applicationContext.getBean("choco", List.class);
        list9.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<CigaretteDto> list10 = applicationContext.getBean("cigarette", List.class);
        list10.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<CityDto> list11 = applicationContext.getBean("city", List.class);
        list11.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<CompanyDto> list12 = applicationContext.getBean("company", List.class);
        list12.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<CouchDto> list13 = applicationContext.getBean("couch", List.class);
        list13.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<CupDto> list14 = applicationContext.getBean("cup", List.class);
        list14.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<FanDto> list15 = applicationContext.getBean("fan", List.class);
        list15.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<FridgeDto> list16 = applicationContext.getBean("fridge", List.class);
        list16.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<GuitarDto> list17 = applicationContext.getBean("guitar", List.class);
        list17.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<GymDto> list18 = applicationContext.getBean("gym", List.class);
        list18.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<HatDto> list19 = applicationContext.getBean("hat", List.class);
        list19.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<HotelDto> list20 = applicationContext.getBean("hotel", List.class);
        list20.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<InstituteDto> list21 = applicationContext.getBean("institute", List.class);
        list21.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<JuiceShopDto> list22 = applicationContext.getBean("juice", List.class);
        list22.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<LaptopDto> list23 = applicationContext.getBean("laptop", List.class);
        list23.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<MicrowaveDto> list24 = applicationContext.getBean("microwave", List.class);
        list24.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<ParkDto> list25 = applicationContext.getBean("park", List.class);
        list25.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<PetrolBunkDto> list26 = applicationContext.getBean("petrol", List.class);
        list26.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<PhotoStudioDto> list27 = applicationContext.getBean("studio", List.class);
        list27.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<PipeDto> list28 = applicationContext.getBean("pipe", List.class);
        list28.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<ShampooDto> list29 = applicationContext.getBean("shampoo", List.class);
        list29.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<ShoeDto> list30 = applicationContext.getBean("shoe", List.class);
        list30.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<SmartPhoneDto> list31 = applicationContext.getBean("smartPhone", List.class);
        list31.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<TelevisionDto> list32 = applicationContext.getBean("television", List.class);
        list32.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<TraineeDto> list33 = applicationContext.getBean("trainee", List.class);
        list33.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<WatchDto> list34 = applicationContext.getBean("watch", List.class);
        list34.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();

        List<WeaponDto> list35 = applicationContext.getBean("weapon", List.class);
        list35.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println();


        System.out.println("main ended");
    }
}

