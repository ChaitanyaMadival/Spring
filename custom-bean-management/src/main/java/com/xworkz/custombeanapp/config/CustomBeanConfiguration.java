package com.xworkz.custombeanapp.config;

import com.xworkz.custombeanapp.dto.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
@ComponentScan("com.xworkz.custombeanapp")
public class CustomBeanConfiguration {

    public CustomBeanConfiguration(){
        System.out.println("Custom bean configuration constructor is invoked..");
    }

    @Bean("hospital")
    public List<HospitalDto> getHospitalInfo(){
        List<HospitalDto> hospitalDtos = new ArrayList<>();
        hospitalDtos.add(new HospitalDto(1, "City Hospital", 200, "Downtown", "Private", 30, "123-456-7890", true));
        hospitalDtos.add(new HospitalDto(2, "Sunnydale Hospital", 150, "Sunnydale", "Government", 20, "987-654-3210", false));
        hospitalDtos.add(new HospitalDto(3, "Green Valley Medical Center", 120, "Green Valley", "Private", 25, "876-543-2109", true));
        hospitalDtos.add(new HospitalDto(4, "Riverfront Medical", 300, "Riverside", "Private", 50, "765-432-1098", true));
        hospitalDtos.add(new HospitalDto(5, "Mountain View Hospital", 250, "Mountain Range", "Government", 40, "654-321-0987", false));
        hospitalDtos.add(new HospitalDto(6, "Parkside Hospital", 180, "City Park", "Private", 15, "543-210-9876", true));
        hospitalDtos.add(new HospitalDto(7, "Lakeshore Medical Center", 400, "Lakeside", "Private", 60, "432-109-8765", true));
        hospitalDtos.add(new HospitalDto(8, "Oakwood General Hospital", 220, "Oakwood", "Government", 35, "321-098-7654", false));
        hospitalDtos.add(new HospitalDto(9, "Golden Bay Hospital", 160, "Bay Area", "Private", 28, "210-987-6543", true));
        hospitalDtos.add(new HospitalDto(10, "City Central Hospital", 500, "City Center", "Government", 100, "109-876-5432", true));
        hospitalDtos.add(new HospitalDto(11, "Forest Grove Hospital", 140, "Forest Grove", "Private", 18, "098-765-4321", false));
        hospitalDtos.add(new HospitalDto(12, "Springfield Medical Center", 300, "Springfield", "Government", 45, "987-321-6540", true));
        hospitalDtos.add(new HospitalDto(13, "Seaside Hospital", 350, "Seaside", "Private", 75, "876-432-1097", true));
        hospitalDtos.add(new HospitalDto(14, "Westfield Health Center", 280, "Westfield", "Government", 55, "765-543-2108", false));
        hospitalDtos.add(new HospitalDto(15, "Eastwood Medical Hospital", 220, "Eastwood", "Private", 30, "654-432-1096", true));

        return  hospitalDtos;
    }

    @Bean("bar")
    public List<BarDto> getBarInfo() {
        List<BarDto> bars = new ArrayList<>();
        bars.add(new BarDto("The Velvet Lounge", "Downtown", "Lounge", 4.5, true, 120, "John Doe", "123-456-7890"));
        bars.add(new BarDto("Brew Masters", "City Center", "Brewery", 4.2, false, 150, "Jane Smith", "234-567-8901"));
        bars.add(new BarDto("The Whiskey Barrel", "Old Town", "Pub", 4.8, true, 100, "Tom Harris", "345-678-9012"));
        bars.add(new BarDto("Skyline Bar", "Riverside", "Rooftop", 4.6, true, 80, "Emily Johnson", "456-789-0123"));
        bars.add(new BarDto("The Golden Tap", "Midtown", "Pub", 3.9, false, 200, "Alex Green", "567-890-1234"));
        bars.add(new BarDto("The Jazz Cellar", "West End", "Jazz Bar", 4.7, true, 90, "Sophie Martin", "678-901-2345"));
        bars.add(new BarDto("Craft & Barrel", "Uptown", "Craft Beer Bar", 4.4, false, 110, "Michael Brown", "789-012-3456"));
        bars.add(new BarDto("The Starlight Pub", "Beachfront", "Pub", 4.1, true, 150, "Sarah Lee", "890-123-4567"));
        bars.add(new BarDto("Moonlit Bar", "South Side", "Lounge", 4.3, true, 120, "David Clark", "901-234-5678"));
        bars.add(new BarDto("Bourbon Street", "Old Town", "Pub", 4.9, false, 180, "Olivia White", "123-234-3456"));
        bars.add(new BarDto("The Wine Cellar", "Downtown", "Wine Bar", 4.6, false, 75, "Liam Scott", "234-345-4567"));
        bars.add(new BarDto("Bar Horizon", "Seaside", "Rooftop", 4.2, true, 100, "Grace Wilson", "345-456-5678"));
        bars.add(new BarDto("The Pub House", "Central Square", "Pub", 3.8, false, 200, "Ethan Turner", "456-567-6789"));
        bars.add(new BarDto("The Speakeasy", "Downtown", "Speakeasy", 5.0, true, 50, "Charlotte Moore", "567-678-7890"));
        bars.add(new BarDto("The Local Tap", "East End", "Bar", 4.3, true, 130, "James King", "678-789-8901"));

        return bars;
    }

    @Bean("parlor")
    public List<BeautyParlourDto> getBeautyParlourInfo() {
        List<BeautyParlourDto> beautyParlours = new ArrayList<>();
        beautyParlours.add(new BeautyParlourDto("Glow & Glam", "Downtown", "Facial, Haircut, Manicure, Pedicure", 4.5, true, 12, "Sarah Miller", "123-456-7890"));
        beautyParlours.add(new BeautyParlourDto("The Beauty Spot", "City Center", "Haircut, Massage, Waxing", 4.2, false, 8, "Emma Smith", "234-567-8901"));
        beautyParlours.add(new BeautyParlourDto("Radiant Shine", "Uptown", "Facial, Hair Styling, Pedicure", 4.8, true, 15, "Olivia Green", "345-678-9012"));
        beautyParlours.add(new BeautyParlourDto("Bliss & Beauty", "West End", "Massage, Manicure, Pedicure, Skin Treatments", 4.7, true, 10, "Mia Johnson", "456-789-0123"));
        beautyParlours.add(new BeautyParlourDto("Serenity Spa", "East Side", "Facial, Massage, Spa Treatments", 4.9, true, 20, "Ava Brown", "567-890-1234"));
        beautyParlours.add(new BeautyParlourDto("Pure Elegance", "South Square", "Hair Styling, Makeup, Manicure", 4.3, false, 7, "Isabella Davis", "678-901-2345"));
        beautyParlours.add(new BeautyParlourDto("The Glam Room", "Old Town", "Makeup, Haircut, Pedicure, Waxing", 4.6, true, 12, "Sophia Taylor", "789-012-3456"));
        beautyParlours.add(new BeautyParlourDto("Lavender Glow", "Riverside", "Facial, Haircut, Massages", 4.4, true, 9, "Charlotte White", "890-123-4567"));
        beautyParlours.add(new BeautyParlourDto("Elegant Touch", "North Bridge", "Haircut, Manicure, Pedicure, Waxing", 4.1, false, 6, "Ella King", "901-234-5678"));
        beautyParlours.add(new BeautyParlourDto("Timeless Beauty", "Central Park", "Makeup, Hair Styling, Skin Treatments", 4.8, true, 14, "Grace Adams", "123-234-3456"));
        beautyParlours.add(new BeautyParlourDto("The Glow Bar", "Lakeside", "Facial, Massage, Waxing", 4.2, false, 11, "Lily Clark", "234-345-4567"));
        beautyParlours.add(new BeautyParlourDto("Spa & Style", "South Bay", "Haircut, Skin Care, Manicure, Pedicure", 4.5, true, 13, "Amelia Lewis", "345-456-5678"));
        beautyParlours.add(new BeautyParlourDto("The Chic Parlour", "East Gate", "Facial, Haircut, Waxing", 4.7, true, 10, "Zoe Moore", "456-567-6789"));
        beautyParlours.add(new BeautyParlourDto("Bloom & Bliss", "West Park", "Hair Styling, Massage, Skin Treatments", 4.3, true, 15, "Harper White", "567-678-7890"));
        beautyParlours.add(new BeautyParlourDto("Allure Beauty", "Central City", "Makeup, Facials, Waxing", 4.6, false, 8, "Luna Harris", "678-789-8901"));
        beautyParlours.add(new BeautyParlourDto("Divine Touch", "Greenwich", "Haircut, Pedicure, Manicure, Massage", 4.4, true, 16, "Evelyn Scott", "789-890-9012"));

        return beautyParlours;
    }

    @Bean("blanket")
    public List<BlanketDto> getBlanketInfo() {
        List<BlanketDto> blankets = new ArrayList<>();
        blankets.add(new BlanketDto("Red", "Cotton", 1.5, 2.0, 1.5, "Luxury Home", true, 24));
        blankets.add(new BlanketDto("Blue", "Wool", 2.0, 2.2, 1.8, "SoftTouch", false, 36));
        blankets.add(new BlanketDto("Green", "Polyester", 1.2, 2.0, 1.6, "CozyRest", true, 18));
        blankets.add(new BlanketDto("Gray", "Fleece", 1.8, 2.1, 1.7, "SnuggleSoft", true, 12));
        blankets.add(new BlanketDto("Pink", "Cotton", 1.4, 2.0, 1.5, "DreamCuddle", true, 24));
        blankets.add(new BlanketDto("Purple", "Silk", 1.0, 2.0, 1.5, "RoyalSleep", false, 36));
        blankets.add(new BlanketDto("Brown", "Wool", 2.2, 2.5, 2.0, "WoolenComfort", true, 24));
        blankets.add(new BlanketDto("White", "Cashmere", 1.0, 2.1, 1.6, "WarmHaven", false, 24));
        blankets.add(new BlanketDto("Black", "Polyester", 1.7, 2.3, 1.7, "NightCuddle", true, 12));
        blankets.add(new BlanketDto("Yellow", "Cotton", 1.3, 2.0, 1.4, "CottonCloud", true, 18));
        blankets.add(new BlanketDto("Beige", "Fleece", 1.6, 2.2, 1.8, "ComfyNest", true, 36));
        blankets.add(new BlanketDto("Orange", "Polyester", 1.1, 2.0, 1.5, "ComfyCozy", true, 24));
        blankets.add(new BlanketDto("Red", "Cashmere", 1.8, 2.0, 1.7, "EliteComfort", false, 36));
        blankets.add(new BlanketDto("Teal", "Wool", 2.1, 2.4, 1.9, "HeavenlyRest", true, 24));
        blankets.add(new BlanketDto("Navy", "Cotton", 1.4, 2.0, 1.6, "SnugComfort", true, 12));

        return blankets;
    }

    @Bean("blender")
    public List<BlenderDto> getBlenderInfo() {
        List<BlenderDto> blenders = new ArrayList<>();
        blenders.add(new BlenderDto("Philips", "HR3652", 1400, 2, "Black", false, 5, "Stainless Steel"));
        blenders.add(new BlenderDto("Ninja", "BL660", 1100, 1.5, "Silver", true, 3, "Plastic"));
        blenders.add(new BlenderDto("Breville", "BBL620", 1000, 1.8, "White", false, 7, "Glass"));
        blenders.add(new BlenderDto("Vitamix", "5200", 1500, 2.0, "Black", false, 10, "Stainless Steel"));
        blenders.add(new BlenderDto("Oster", "BLSTMB-CBF", 1200, 1.5, "Red", true, 8, "Plastic"));
        blenders.add(new BlenderDto("KitchenAid", "KSB1575", 550, 1.25, "Empire Red", false, 5, "Plastic"));
        blenders.add(new BlenderDto("Hamilton Beach", "58148", 700, 1.0, "Black", false, 3, "Plastic"));
        blenders.add(new BlenderDto("Cuisinart", "CBT-2000", 1500, 2.0, "Silver", false, 6, "Metal"));
        blenders.add(new BlenderDto("Smeg", "BLF01", 800, 1.5, "Cream", true, 4, "Stainless Steel"));
        blenders.add(new BlenderDto("NutriBullet", "NB9-1301", 900, 0.9, "Gray", true, 1, "Plastic"));
        blenders.add(new BlenderDto("Bosch", "MUM58M51", 1000, 2.0, "Silver", false, 5, "Plastic"));
        blenders.add(new BlenderDto("Black+Decker", "BL2010BG", 550, 1.5, "Blue", false, 3, "Plastic"));
        blenders.add(new BlenderDto("Magic Bullet", "MBR-1101", 250, 0.5, "Black", true, 1, "Plastic"));
        blenders.add(new BlenderDto("Kenwood", "BLX750", 800, 1.6, "Silver", false, 6, "Stainless Steel"));
        blenders.add(new BlenderDto("DeLonghi", "BLF01", 1000, 1.8, "Black", false, 5, "Plastic"));

        return blenders;
    }

    @Bean("bottle")
    public List<BottleDto> getBottleInfo() {
        List<BottleDto> bottles = new ArrayList<>();
        bottles.add(new BottleDto("Philips", "HR3652", 1400, 2, "Black", false, 5, "Stainless Steel"));
        bottles.add(new BottleDto("Ninja", "BL660", 1100, 1.5, "Silver", true, 3, "Plastic"));
        bottles.add(new BottleDto("Breville", "BBL620", 1000, 1.8, "White", false, 7, "Glass"));
        bottles.add(new BottleDto("Vitamix", "5200", 1500, 2.0, "Black", false, 10, "Stainless Steel"));
        bottles.add(new BottleDto("Oster", "BLSTMB-CBF", 1200, 1.5, "Red", true, 8, "Plastic"));
        bottles.add(new BottleDto("KitchenAid", "KSB1575", 550, 1.25, "Empire Red", false, 5, "Plastic"));
        bottles.add(new BottleDto("Hamilton Beach", "58148", 700, 1.0, "Black", false, 3, "Plastic"));
        bottles.add(new BottleDto("Cuisinart", "CBT-2000", 1500, 2.0, "Silver", false, 6, "Metal"));
        bottles.add(new BottleDto("Smeg", "BLF01", 800, 1.5, "Cream", true, 4, "Stainless Steel"));
        bottles.add(new BottleDto("NutriBullet", "NB9-1301", 900, 0.9, "Gray", true, 1, "Plastic"));
        bottles.add(new BottleDto("Bosch", "MUM58M51", 1000, 2.0, "Silver", false, 5, "Plastic"));
        bottles.add(new BottleDto("Black+Decker", "BL2010BG", 550, 1.5, "Blue", false, 3, "Plastic"));
        bottles.add(new BottleDto("Magic Bullet", "MBR-1101", 250, 0.5, "Black", true, 1, "Plastic"));
        bottles.add(new BottleDto("Kenwood", "BLX750", 800, 1.6, "Silver", false, 6, "Stainless Steel"));
        bottles.add(new BottleDto("DeLonghi", "BLF01", 1000, 1.8, "Black", false, 5, "Plastic"));


        return bottles;
    }

    @Bean("brush")
    public List<BrushDto> getBrushInfo() {
        List<BrushDto> brushes = new ArrayList<>();
        brushes.add(new BrushDto("Oral-B", "Toothbrush", 12, "Nylon", "Plastic", "Blue", true, "Ergonomic handle"));
        brushes.add(new BrushDto("Colgate", "Toothbrush", 11, "Nylon", "Plastic", "Green", true, "Soft bristles"));
        brushes.add(new BrushDto("Camel", "Paintbrush", 30, "Natural", "Wood", "Brown", false, "Round tip, fine bristles"));
        brushes.add(new BrushDto("The Body Shop", "Hairbrush", 25, "Natural", "Wood", "Black", true, "Wide-toothed"));
        brushes.add(new BrushDto("ArtPro", "Paintbrush", 40, "Natural", "Wood", "Red", false, "Flat tip, premium finish"));
        brushes.add(new BrushDto("Conair", "Hairbrush", 18, "Nylon", "Plastic", "Pink", true, "Vent design for fast drying"));
        brushes.add(new BrushDto("Philips", "Toothbrush", 12, "Nylon", "Plastic", "White", true, "Battery-operated"));
        brushes.add(new BrushDto("Winsor & Newton", "Paintbrush", 35, "Natural", "Wood", "Yellow", false, "Long handle, soft bristles"));
        brushes.add(new BrushDto("Tangle Teezer", "Hairbrush", 22, "Nylon", "Plastic", "Purple", true, "Compact and lightweight"));
        brushes.add(new BrushDto("Burt's Bees", "Toothbrush", 10, "Natural", "Bamboo", "Beige", true, "Eco-friendly design"));
        brushes.add(new BrushDto("Artify", "Paintbrush", 45, "Natural", "Wood", "Brown", false, "Detailing brush with fine bristles"));
        brushes.add(new BrushDto("Revlon", "Hairbrush", 20, "Nylon", "Plastic", "Black", true, "Ball-tipped bristles for comfort"));
        brushes.add(new BrushDto("EcoTools", "Hairbrush", 25, "Natural", "Bamboo", "Green", true, "Ergonomic handle, soft bristles"));
        brushes.add(new BrushDto("Kiss", "Toothbrush", 12, "Nylon", "Plastic", "Pink", true, "Travel-size toothbrush"));
        brushes.add(new BrushDto("Winsor & Newton", "Paintbrush", 50, "Natural", "Wood", "Blue", false, "Flat, long handle"));

        return brushes;
    }

    @Bean("chair")
    public List<ChairDto> getChairInfo() {
        List<ChairDto> chairs = new ArrayList<>();
        chairs.add(new ChairDto("IKEA", "Office Chair", "Mesh", true, "Black", 120, true, 110.0));
        chairs.add(new ChairDto("Herman Miller", "Office Chair", "Leather", true, "Gray", 150, true, 115.0));
        chairs.add(new ChairDto("WoodWorks", "Dining Chair", "Wood", false, "Brown", 200, false, 85.0));
        chairs.add(new ChairDto("Steelcase", "Office Chair", "Fabric", true, "Blue", 160, true, 120.0));
        chairs.add(new ChairDto("Wayfair", "Lounge Chair", "Velvet", false, "Green", 100, false, 95.0));
        chairs.add(new ChairDto("La-Z-Boy", "Lounge Chair", "Leather", false, "Tan", 250, true, 90.0));
        chairs.add(new ChairDto("OfficeMax", "Office Chair", "Mesh", true, "Black", 120, true, 105.0));
        chairs.add(new ChairDto("Pottery Barn", "Dining Chair", "Wood", false, "White", 180, false, 90.0));
        chairs.add(new ChairDto("AmazonBasics", "Office Chair", "Faux Leather", true, "Gray", 130, true, 115.0));
        chairs.add(new ChairDto("Flexsteel", "Lounge Chair", "Fabric", false, "Purple", 220, true, 95.0));
        chairs.add(new ChairDto("Target", "Dining Chair", "Wood", false, "Oak", 150, false, 85.0));
        chairs.add(new ChairDto("Serta", "Office Chair", "Mesh", true, "Black", 140, true, 110.0));
        chairs.add(new ChairDto("West Elm", "Lounge Chair", "Leather", false, "Brown", 180, false, 100.0));
        chairs.add(new ChairDto("Haworth", "Office Chair", "Fabric", true, "Red", 150, true, 105.0));
        chairs.add(new ChairDto("Crate & Barrel", "Dining Chair", "Wood", false, "Natural", 200, true, 95.0));

        return chairs;
    }

    @Bean("choco")
    public List<ChocolateDto> getChocolateInfo() {
        List<ChocolateDto> chocolates = new ArrayList<>();
        chocolates.add(new ChocolateDto("Lindt", "Dark", 100.0, "Hazelnut", false, false, "Wrapper", 70));
        chocolates.add(new ChocolateDto("Cadbury", "Milk", 150.0, "Almond", false, false, "Wrapper", 40));
        chocolates.add(new ChocolateDto("Green & Black's", "Dark", 90.0, "Mint", false, false, "Box", 85));
        chocolates.add(new ChocolateDto("Ghirardelli", "Dark", 120.0, "Sea Salt", false, false, "Wrapper", 72));
        chocolates.add(new ChocolateDto("Alter Eco", "Dark", 100.0, "Coconut", true, true, "Box", 75));
        chocolates.add(new ChocolateDto("Nestlé", "Milk", 200.0, "Caramel", false, false, "Wrapper", 30));
        chocolates.add(new ChocolateDto("Endangered Species", "Dark", 80.0, "Raspberry", false, true, "Box", 88));
        chocolates.add(new ChocolateDto("Taza", "Dark", 85.0, "Almond", true, true, "Wrapper", 65));
        chocolates.add(new ChocolateDto("Thorntons", "Milk", 250.0, "Strawberry", false, false, "Box", 35));
        chocolates.add(new ChocolateDto("Lindt", "White", 100.0, "Vanilla", false, false, "Wrapper", 30));
        chocolates.add(new ChocolateDto("Dove", "Milk", 150.0, "Hazelnut", false, false, "Wrapper", 45));
        chocolates.add(new ChocolateDto("Ghirardelli", "Dark", 85.0, "Cherry", false, false, "Box", 60));
        chocolates.add(new ChocolateDto("Moo Free", "Milk", 100.0, "Orange", true, true, "Wrapper", 0));
        chocolates.add(new ChocolateDto("Theo", "Dark", 95.0, "Mint", true, true, "Box", 70));
        chocolates.add(new ChocolateDto("Vivani", "Dark", 80.0, "Cranberry", true, true, "Box", 85));

        return chocolates;
    }

    @Bean("cigarette")
    public List<CigaretteDto> getCigaretteInfo() {
        List<CigaretteDto> cigarettes = new ArrayList<>();
        cigarettes.add(new CigaretteDto("Marlboro", "Regular", 12.0, 20, "Classic", "Box", false, 10));
        cigarettes.add(new CigaretteDto("Camel", "Menthol", 10.5, 20, "Mint", "Soft Pack", true, 8));
        cigarettes.add(new CigaretteDto("Lucky Strike", "Regular", 13.0, 10, "Original", "Box", false, 12));
        cigarettes.add(new CigaretteDto("Newport", "Menthol", 15.0, 20, "Menthol", "Box", true, 14));
        cigarettes.add(new CigaretteDto("Pall Mall", "Regular", 11.0, 20, "Smooth", "Soft Pack", false, 9));
        cigarettes.add(new CigaretteDto("Winston", "Regular", 13.5, 25, "Full Flavor", "Box", false, 15));
        cigarettes.add(new CigaretteDto("American Spirit", "Menthol", 8.0, 20, "Menthol", "Box", true, 7));
        cigarettes.add(new CigaretteDto("Pall Mall", "Menthol", 10.0, 20, "Mint", "Soft Pack", true, 9));
        cigarettes.add(new CigaretteDto("Parliament", "Regular", 14.0, 20, "Rich", "Box", false, 13));
        cigarettes.add(new CigaretteDto("Pall Mall", "Regular", 12.5, 10, "Classic", "Box", false, 10));
        cigarettes.add(new CigaretteDto("Marlboro", "Menthol", 12.0, 20, "Mint", "Soft Pack", true, 11));
        cigarettes.add(new CigaretteDto("Virginia Slims", "Regular", 11.5, 20, "Smooth", "Box", false, 8));
        cigarettes.add(new CigaretteDto("Rothmans", "Menthol", 9.0, 20, "Fresh Mint", "Soft Pack", true, 6));
        cigarettes.add(new CigaretteDto("L&M", "Regular", 13.0, 20, "Bold", "Box", false, 10));
        cigarettes.add(new CigaretteDto("Blue Master", "Menthol", 10.0, 10, "Mint", "Box", true, 7));

        return cigarettes;
    }

    @Bean("city")
    public List<CityDto> getCityInfo() {
        List<CityDto> cities = new ArrayList<>();
        cities.add(new CityDto("New York", "USA", 8419600, 789.4, "EST", false, "Statue of Liberty", "Eric Adams"));
        cities.add(new CityDto("Los Angeles", "USA", 3980400, 1302.0, "PST", false, "Hollywood Sign", "Karen Bass"));
        cities.add(new CityDto("Paris", "France", 2148327, 105.4, "CET", true, "Eiffel Tower", "Anne Hidalgo"));
        cities.add(new CityDto("Tokyo", "Japan", 13929286, 2191.1, "JST", true, "Tokyo Tower", "Yuriko Koike"));
        cities.add(new CityDto("London", "United Kingdom", 8982000, 1572.0, "GMT", true, "Big Ben", "Sadiq Khan"));
        cities.add(new CityDto("Sydney", "Australia", 5312163, 1687.0, "AEST", false, "Sydney Opera House", "Clover Moore"));
        cities.add(new CityDto("Rome", "Italy", 2873000, 1285.0, "CET", true, "Colosseum", "Roberto Gualtieri"));
        cities.add(new CityDto("Berlin", "Germany", 3769000, 891.8, "CET", true, "Brandenburg Gate", "Franziska Giffey"));
        cities.add(new CityDto("Moscow", "Russia", 11920000, 2511.0, "MSK", true, "Red Square", "Sergei Sobyanin"));
        cities.add(new CityDto("Beijing", "China", 21540000, 16410.5, "CST", true, "Forbidden City", "Chen Jining"));
        cities.add(new CityDto("Cairo", "Egypt", 9125000, 606.0, "EET", false, "Pyramids of Giza", "Ahmed Shafik"));
        cities.add(new CityDto("Rio de Janeiro", "Brazil", 6748000, 1182.0, "BRT", false, "Christ the Redeemer", "Eduardo Paes"));
        cities.add(new CityDto("Dubai", "United Arab Emirates", 3330000, 411.0, "GST", false, "Burj Khalifa", "Hamdan bin Mohammed"));
        cities.add(new CityDto("Cape Town", "South Africa", 433688, 400.0, "SAST", false, "Table Mountain", "Geordin Hill-Lewis"));
        cities.add(new CityDto("Mexico City", "Mexico", 8918653, 1485.0, "CST", true, "Chapultepec Castle", "Claudia Sheinbaum"));

        return cities;
    }

    @Bean("company")
    public List<CompanyDto> getCompanyInfo() {
        List<CompanyDto> companies = new ArrayList<>();
        companies.add(new CompanyDto("Apple", "Technology", "Cupertino, USA", 147000, "Tim Cook", 365000000000.0, "+1-800-MY-APPLE", 1976));
        companies.add(new CompanyDto("Tesla", "Automotive", "Palo Alto, USA", 70000, "Elon Musk", 53000000000.0, "+1-877-798-3752", 2003));
        companies.add(new CompanyDto("Microsoft", "Technology", "Redmond, USA", 181000, "Satya Nadella", 168000000000.0, "+1-800-642-7676", 1975));
        companies.add(new CompanyDto("Amazon", "E-commerce", "Seattle, USA", 798000, "Andy Jassy", 469800000000.0, "+1-888-280-4331", 1994));
        companies.add(new CompanyDto("Samsung", "Electronics", "Seoul, South Korea", 320000, "Lee Jae-yong", 211000000000.0, "+82-2-2255-0114", 1938));
        companies.add(new CompanyDto("Toyota", "Automotive", "Toyota City, Japan", 360000, "Akio Toyoda", 275000000000.0, "+81-565-28-2121", 1937));
        companies.add(new CompanyDto("Google", "Technology", "Mountain View, USA", 156000, "Sundar Pichai", 257000000000.0, "+1-650-253-0000", 1998));
        companies.add(new CompanyDto("Facebook", "Social Media", "Menlo Park, USA", 58604, "Mark Zuckerberg", 117930000000.0, "+1-650-308-7300", 2004));
        companies.add(new CompanyDto("Alibaba", "E-commerce", "Hangzhou, China", 250000, "Daniel Zhang", 109000000000.0, "+86-571-8502-2088", 1999));
        companies.add(new CompanyDto("Boeing", "Aerospace", "Chicago, USA", 141000, "David L. Calhoun", 76600000000.0, "+1-312-544-2000", 1916));
        companies.add(new CompanyDto("Sony", "Electronics", "Tokyo, Japan", 114400, "Kenichiro Yoshida", 81700000000.0, "+81-3-6748-2111", 1946));
        companies.add(new CompanyDto("IBM", "Technology", "Armonk, USA", 352600, "Arvind Krishna", 73000000000.0, "+1-914-499-1900", 1911));
        companies.add(new CompanyDto("General Motors", "Automotive", "Detroit, USA", 164000, "Mary Barra", 122500000000.0, "+1-800-222-1020", 1908));
        companies.add(new CompanyDto("Nike", "Retail", "Beaverton, USA", 76200, "John Donahoe", 43700000000.0, "+1-800-806-6453", 1964));
        companies.add(new CompanyDto("Coca-Cola", "Beverages", "Atlanta, USA", 70000, "James Quincey", 46300000000.0, "+1-800-438-2653", 1892));

        return companies;
    }

    @Bean("couch")
    public List<CouchDto> getCouchInfo() {
        List<CouchDto> couches = new ArrayList<>();

        couches.add(new CouchDto("Ikea", "Fabric", "Gray", 3, true, "Modern", 200, 90));
        couches.add(new CouchDto("Ashley Furniture", "Leather", "Black", 2, false, "Contemporary", 180, 85));
        couches.add(new CouchDto("La-Z-Boy", "Fabric", "Beige", 3, true, "Traditional", 220, 95));
        couches.add(new CouchDto("West Elm", "Leather", "Brown", 2, false, "Mid-century Modern", 210, 85));
        couches.add(new CouchDto("Crate & Barrel", "Fabric", "Navy Blue", 4, false, "Modern", 230, 100));
        couches.add(new CouchDto("Room & Board", "Leather", "Taupe", 3, true, "Minimalist", 215, 90));
        couches.add(new CouchDto("CB2", "Fabric", "Charcoal", 2, false, "Industrial", 200, 80));
        couches.add(new CouchDto("Pottery Barn", "Leather", "White", 4, true, "Classic", 240, 95));
        couches.add(new CouchDto("Serta", "Fabric", "Light Gray", 3, false, "Transitional", 215, 90));
        couches.add(new CouchDto("Wayfair", "Fabric", "Olive Green", 2, true, "Bohemian", 190, 85));
        couches.add(new CouchDto("Jonathan Adler", "Leather", "Emerald Green", 3, true, "Retro", 210, 100));
        couches.add(new CouchDto("Bob's Discount Furniture", "Fabric", "Red", 2, false, "Contemporary", 180, 85));
        couches.add(new CouchDto("Article", "Leather", "Dark Gray", 3, false, "Scandinavian", 205, 90));
        couches.add(new CouchDto("Havertys", "Fabric", "Light Blue", 4, true, "Coastal", 250, 100));
        couches.add(new CouchDto("Pottery Barn", "Fabric", "Dusty Rose", 2, false, "Farmhouse", 200, 85));

        return couches;
    }

    @Bean("cup")
    public List<CupDto> getCupInfo() {
        List<CupDto> cups = new ArrayList<>();
        cups.add(new CupDto("Ceramic", "IKEA", "White", 300.0, "Modern", false, true, true));
        cups.add(new CupDto("Ceramic", "Starbucks", "Green", 350.0, "Logo Print", false, true, true));
        cups.add(new CupDto("Metal", "Contigo", "Black", 400.0, "Sleek", true, false, true));
        cups.add(new CupDto("Plastic", "Tupperware", "Blue", 500.0, "Simple", false, true, false));
        cups.add(new CupDto("Ceramic", "Le Creuset", "Red", 350.0, "Vintage", false, true, true));
        cups.add(new CupDto("Ceramic", "Villeroy & Boch", "Blue", 250.0, "Minimalist", false, true, true));
        cups.add(new CupDto("Metal", "Hydro Flask", "White", 500.0, "Sporty", true, true, false));
        cups.add(new CupDto("Ceramic", "Ninja", "Black", 450.0, "Textured", false, true, true));
        cups.add(new CupDto("Plastic", "Bodum", "Red", 300.0, "Modern", false, true, true));
        cups.add(new CupDto("Ceramic", "Anthropologie", "Pink", 350.0, "Floral", false, true, true));
        cups.add(new CupDto("Metal", "Contigo", "Copper", 400.0, "Travel", true, true, true));
        cups.add(new CupDto("Ceramic", "Kate Spade", "Yellow", 250.0, "Elegant", false, true, true));
        cups.add(new CupDto("Ceramic", "POTTERY BARN", "Turquoise", 300.0, "Rustic", false, true, true));
        cups.add(new CupDto("Plastic", "Tupperware", "Purple", 450.0, "Compact", false, true, false));
        cups.add(new CupDto("Metal", "S'well", "Black", 500.0, "Sleek", true, true, false));

        return cups;
    }

    @Bean("fan")
    public List<FanDto> getFanlInfo() {
        List<FanDto> fans = new ArrayList<>();
        fans.add(new FanDto("Crompton", "Ceiling Fan", 3, 75.0, "White", true, true, 48));
        fans.add(new FanDto("Havells", "Stand Fan", 3, 60.0, "Black", true, true, 16));
        fans.add(new FanDto("Usha", "Table Fan", 3, 45.0, "Blue", false, false, 12));
        fans.add(new FanDto("Bajaj", "Ceiling Fan", 4, 70.0, "Silver", false, true, 56));
        fans.add(new FanDto("Orient", "Stand Fan", 3, 65.0, "Red", false, false, 18));
        fans.add(new FanDto("Philips", "Ceiling Fan", 5, 80.0, "Gray", true, true, 52));
        fans.add(new FanDto("Crompton", "Stand Fan", 3, 55.0, "White", true, false, 20));
        fans.add(new FanDto("V-Guard", "Table Fan", 3, 40.0, "Black", false, false, 10));
        fans.add(new FanDto("Havells", "Ceiling Fan", 3, 60.0, "Gold", true, true, 48));
        fans.add(new FanDto("Bajaj", "Stand Fan", 3, 50.0, "White", false, false, 14));
        fans.add(new FanDto("Orient", "Ceiling Fan", 4, 65.0, "Brown", false, true, 56));
        fans.add(new FanDto("Crompton", "Table Fan", 3, 35.0, "Orange", true, false, 12));
        fans.add(new FanDto("V-Guard", "Stand Fan", 3, 50.0, "Gray", true, true, 18));
        fans.add(new FanDto("Bajaj", "Ceiling Fan", 5, 75.0, "Silver", true, false, 52));
        fans.add(new FanDto("Havells", "Stand Fan", 4, 60.0, "Green", false, true, 16));

        return fans;
    }

    @Bean("fridge")
    public List<FridgeDto> getFridgeInfo() {
        List<FridgeDto> fridges = new ArrayList<>();
        fridges.add(new FridgeDto("Samsung", 350.0, "Double Door", "Silver", true, true, 4.5, "Stainless Steel"));
        fridges.add(new FridgeDto("LG", 600.0, "Side by Side", "Black", true, true, 4.0, "Stainless Steel"));
        fridges.add(new FridgeDto("Whirlpool", 250.0, "Single Door", "White", false, false, 3.5, "Plastic"));
        fridges.add(new FridgeDto("Godrej", 320.0, "Double Door", "Gray", true, true, 4.0, "Stainless Steel"));
        fridges.add(new FridgeDto("Haier", 500.0, "Side by Side", "Silver", true, true, 5.0, "Stainless Steel"));
        fridges.add(new FridgeDto("Bosch", 350.0, "Double Door", "Black", true, true, 4.5, "Glass"));
        fridges.add(new FridgeDto("Electrolux", 450.0, "Single Door", "White", false, true, 4.0, "Plastic"));
        fridges.add(new FridgeDto("Siemens", 700.0, "Side by Side", "Stainless Steel", true, true, 5.0, "Stainless Steel"));
        fridges.add(new FridgeDto("BPL", 300.0, "Double Door", "Silver", true, true, 3.5, "Metal"));
        fridges.add(new FridgeDto("Midea", 500.0, "Double Door", "Black", true, true, 4.0, "Plastic"));
        fridges.add(new FridgeDto("Sharp", 400.0, "Single Door", "Gray", false, false, 3.0, "Metal"));
        fridges.add(new FridgeDto("Panasonic", 600.0, "Side by Side", "White", true, true, 4.5, "Glass"));
        fridges.add(new FridgeDto("Samsung", 250.0, "Single Door", "Red", false, false, 4.0, "Plastic"));
        fridges.add(new FridgeDto("LG", 450.0, "Double Door", "Silver", true, true, 4.5, "Stainless Steel"));
        fridges.add(new FridgeDto("Whirlpool", 550.0, "Side by Side", "Black", true, true, 4.0, "Glass"));

        return fridges;
    }

    @Bean("guitar")
    public List<GuitarDto> getGuitarInfo() {
        List<GuitarDto> guitars = new ArrayList<>();
        guitars.add(new GuitarDto("Fender", "Electric", "Wood", "Sunburst", 6, "Stratocaster", true, 799.99));
        guitars.add(new GuitarDto("Gibson", "Electric", "Wood", "Cherry Red", 6, "Les Paul", true, 1599.99));
        guitars.add(new GuitarDto("Yamaha", "Acoustic", "Wood", "Natural", 6, "Dreadnought", false, 199.99));
        guitars.add(new GuitarDto("Ibanez", "Electric", "Metal", "Black", 7, "RG", true, 749.99));
        guitars.add(new GuitarDto("Martin", "Acoustic", "Wood", "Mahogany", 6, "OM", false, 1299.99));
        guitars.add(new GuitarDto("PRS", "Electric", "Wood", "Tobacco Sunburst", 6, "Custom 24", true, 2299.99));
        guitars.add(new GuitarDto("Epiphone", "Electric", "Wood", "Wine Red", 6, "SG", true, 499.99));
        guitars.add(new GuitarDto("Fender", "Acoustic", "Wood", "Natural", 6, "CD-60S", false, 229.99));
        guitars.add(new GuitarDto("Schecter", "Electric", "Wood", "Purple", 6, "C-1", true, 799.99));
        guitars.add(new GuitarDto("Taylor", "Acoustic", "Wood", "Natural", 6, "314ce", false, 1299.99));
        guitars.add(new GuitarDto("Gibson", "Acoustic", "Wood", "Sunburst", 6, "Hummingbird", false, 2499.99));
        guitars.add(new GuitarDto("Jackson", "Electric", "Metal", "Red", 6, "Soloist", true, 899.99));
        guitars.add(new GuitarDto("ESP", "Electric", "Wood", "Black", 6, "LTD EC-1000", true, 999.99));
        guitars.add(new GuitarDto("Gretsch", "Electric", "Wood", "Orange", 6, "G2622 Streamliner", true, 699.99));
        guitars.add(new GuitarDto("Rickenbacker", "Electric", "Metal", "Jetglo", 6, "360", true, 1599.99));

        return guitars;
    }

    @Bean("gym")
    public List<GymDto> getGymInfo() {
        List<GymDto> gyms = new ArrayList<>();
        gyms.add(new GymDto("Gold's Gym", "Downtown, NY", 50, 200, "Monthly, Yearly", "John Doe", true, true));
        gyms.add(new GymDto("Planet Fitness", "5th Avenue, NY", 40, 150, "Monthly", "Jane Smith", false, false));
        gyms.add(new GymDto("Anytime Fitness", "Uptown, NY", 35, 100, "Weekly, Monthly", "Sarah Johnson", true, true));
        gyms.add(new GymDto("24 Hour Fitness", "Midtown, NY", 60, 300, "Monthly, Yearly", "David Clark", false, true));
        gyms.add(new GymDto("LA Fitness", "Brooklyn, NY", 45, 250, "Monthly, Yearly", "Emily White", true, true));
        gyms.add(new GymDto("Crunch Fitness", "Queens, NY", 30, 120, "Monthly", "Michael Brown", false, true));
        gyms.add(new GymDto("Snap Fitness", "Manhattan, NY", 25, 80, "Monthly, Yearly", "Linda Green", true, false));
        gyms.add(new GymDto("Equinox", "Soho, NY", 70, 400, "Yearly", "Andrew Harris", true, true));
        gyms.add(new GymDto("YMCA", "Harlem, NY", 60, 350, "Monthly, Yearly", "Rachel Lee", false, false));
        gyms.add(new GymDto("F45 Training", "Lower East Side, NY", 40, 150, "Monthly", "Chris Miller", true, true));
        gyms.add(new GymDto("Gold's Gym", "Los Angeles, CA", 55, 180, "Monthly, Yearly", "Robert King", true, false));
        gyms.add(new GymDto("Anytime Fitness", "Chicago, IL", 30, 120, "Weekly, Monthly", "Laura Nelson", false, true));
        gyms.add(new GymDto("Fitness First", "San Francisco, CA", 50, 200, "Monthly", "Daniel Adams", true, true));
        gyms.add(new GymDto("In-Shape", "Fresno, CA", 40, 150, "Monthly, Yearly", "Jessica Lewis", false, true));
        gyms.add(new GymDto("Snap Fitness", "Miami, FL", 30, 100, "Monthly", "Matthew Hall", true, false));

        return gyms;
    }

    @Bean("hat")
    public List<HatDto> getHatInfo() {
        List<HatDto> hats = new ArrayList<>();

        hats.add(new HatDto("Nike", "Baseball Cap", "Cotton", "Red", 58.5, true, true, "Plain design"));
        hats.add(new HatDto("Adidas", "Baseball Cap", "Polyester", "Blue", 60.0, true, false, "Logo design"));
        hats.add(new HatDto("Gucci", "Fedora", "Wool", "Black", 58.0, false, true, "Luxury design"));
        hats.add(new HatDto("Levi's", "Beanie", "Acrylic", "Gray", 55.0, false, true, "Plain design"));
        hats.add(new HatDto("New Era", "Baseball Cap", "Cotton", "White", 59.0, true, false, "Team logo design"));
        hats.add(new HatDto("Puma", "Fedora", "Felt", "Brown", 57.5, false, true, "Classic design"));
        hats.add(new HatDto("Stetson", "Fedora", "Leather", "Tan", 60.5, false, false, "Western design"));
        hats.add(new HatDto("Columbia", "Beanie", "Wool", "Navy Blue", 57.0, false, true, "Outdoor design"));
        hats.add(new HatDto("Under Armour", "Baseball Cap", "Polyester", "Black", 58.0, true, false, "Sporty design"));
        hats.add(new HatDto("Ralph Lauren", "Fedora", "Straw", "Beige", 59.0, false, true, "Beach design"));
        hats.add(new HatDto("Carhartt", "Beanie", "Acrylic", "Orange", 55.0, false, true, "Workwear design"));
        hats.add(new HatDto("Nike", "Baseball Cap", "Nylon", "Green", 60.0, true, true, "Nike Swoosh design"));
        hats.add(new HatDto("Tommy Hilfiger", "Fedora", "Cotton", "Navy", 58.0, false, true, "Preppy design"));
        hats.add(new HatDto("Vans", "Beanie", "Polyester", "Red", 56.0, false, true, "Skate design"));
        hats.add(new HatDto("Champion", "Baseball Cap", "Polyester", "Yellow", 59.5, true, false, "Champion logo design"));

        return hats;
    }

    @Bean("hotel")
    public List<HotelDto> getHotelInfo() {
        List<HotelDto> hotels = new ArrayList<>();

        hotels.add(new HotelDto("The Grand Palace", "Paris, France", 200, 4.5, "Wi-Fi, Pool, Spa", "Jean Dupont", "+33 1 45 67 89 10", true));
        hotels.add(new HotelDto("Ocean Breeze Resort", "Miami, USA", 150, 4.2, "Wi-Fi, Pool, Beach Access", "Maria Gonzalez", "+1 305-555-0101", false));
        hotels.add(new HotelDto("Mountain View Lodge", "Aspen, USA", 50, 4.8, "Wi-Fi, Spa, Ski Resort", "Ethan Carter", "+1 970-555-1234", true));
        hotels.add(new HotelDto("Sunset Villa", "Malibu, USA", 100, 4.6, "Wi-Fi, Pool, Spa, Ocean View", "Lisa Smith", "+1 310-555-5555", false));
        hotels.add(new HotelDto("Royal Palm Hotel", "Dubai, UAE", 300, 4.9, "Wi-Fi, Pool, Spa, Gym", "Ahmed Al-Farsi", "+971 4 123 4567", true));
        hotels.add(new HotelDto("The Shimmering Sands", "Cairo, Egypt", 120, 4.3, "Wi-Fi, Pool, Restaurant", "Fatima Abdelrahman", "+20 2 252 4005", true));
        hotels.add(new HotelDto("Blue Horizon Hotel", "Sydney, Australia", 180, 4.7, "Wi-Fi, Pool, Spa, Ocean View", "John Smith", "+61 2 9123 4567", false));
        hotels.add(new HotelDto("Luxury Heights", "Tokyo, Japan", 250, 4.6, "Wi-Fi, Pool, Gym, Restaurant", "Taro Yamada", "+81 3 1234 5678", false));
        hotels.add(new HotelDto("Green Meadows Inn", "London, UK", 75, 4.1, "Wi-Fi, Garden, Breakfast", "Sarah Williams", "+44 20 7946 0958", true));
        hotels.add(new HotelDto("The Vintage Manor", "Rome, Italy", 90, 4.4, "Wi-Fi, Pool, Restaurant", "Giovanni Rossi", "+39 06 555 1234", false));
        hotels.add(new HotelDto("Starlight Suites", "New York, USA", 210, 4.7, "Wi-Fi, Pool, Restaurant, Spa", "Emily Davis", "+1 212-555-7890", false));
        hotels.add(new HotelDto("Golden Oasis Resort", "Sharm El Sheikh, Egypt", 150, 4.5, "Wi-Fi, Pool, Beach Access, Spa", "Ahmed Mohamed", "+20 69 360 1000", true));
        hotels.add(new HotelDto("The Crystal Palace", "London, UK", 300, 5.0, "Wi-Fi, Pool, Spa, Gym", "Richard Brown", "+44 20 7583 2100", true));
        hotels.add(new HotelDto("Desert Mirage Hotel", "Dubai, UAE", 120, 4.3, "Wi-Fi, Pool, Desert Safari", "Mona Al-Khalifa", "+971 4 345 6789", false));
        hotels.add(new HotelDto("Oceanview Hotel", "Barbados", 80, 4.8, "Wi-Fi, Pool, Beach Access", "Khaled Al-Mansoori", "+1 246-555-1234", true));

        return hotels;
    }

    @Bean("institute")
    public List<InstituteDto> getInstituteInfo() {
        List<InstituteDto> institutes = new ArrayList<>();

        institutes.add(new InstituteDto("Harvard University", "Cambridge, USA", "University", 22000, "Dr. Lawrence Bacow", 1636, "+1 617-495-1000", "Computer Science, Business, Law"));
        institutes.add(new InstituteDto("Stanford University", "Stanford, USA", "University", 15000, "Dr. Marc Tessier-Lavigne", 1885, "+1 650-723-2300", "Engineering, Business, Law, Medicine"));
        institutes.add(new InstituteDto("MIT", "Cambridge, USA", "University", 11500, "Dr. Rafael Reif", 1861, "+1 617-253-1000", "Physics, Computer Science, Engineering"));
        institutes.add(new InstituteDto("Oxford University", "Oxford, UK", "University", 24000, "Professor Louise Richardson", 1096, "+44 1865 270000", "Law, Medicine, Philosophy"));
        institutes.add(new InstituteDto("University of Toronto", "Toronto, Canada", "University", 90000, "Meric Gertler", 1827, "+1 416-978-2011", "Engineering, Computer Science, Arts"));
        institutes.add(new InstituteDto("Indian Institute of Technology (IIT) Bombay", "Mumbai, India", "University", 11000, "Dr. Subhasis Chaudhuri", 1958, "+91 22 2572 2545", "Engineering, Technology"));
        institutes.add(new InstituteDto("University of Melbourne", "Melbourne, Australia", "University", 50000, "Professor Duncan Maskell", 1853, "+61 3 9035 5511", "Arts, Business, Engineering"));
        institutes.add(new InstituteDto("Alison", "Online", "Training Institute", 2000000, "Dr. Mike Feerick", 2007, "+353 91 705 500", "Business, IT, Health"));
        institutes.add(new InstituteDto("Coursera", "Online", "Training Institute", 10000000, "Jeff Maggioncalda", 2012, "+1 650-963-9884", "Data Science, Programming, Marketing"));
        institutes.add(new InstituteDto("The Art Institutes", "USA (Multiple Locations)", "Training Institute", 15000, "Lisa M. B. Bowers", 1960, "+1 888-430-2067", "Art, Graphic Design, Fashion Design"));
        institutes.add(new InstituteDto("National Institute of Design", "Ahmedabad, India", "Training Institute", 1200, "Professor Pradyumna Vyas", 1961, "+91 79 2662 3222", "Design, Architecture"));
        institutes.add(new InstituteDto("University of Cape Town", "Cape Town, South Africa", "University", 28000, "Professor Mamokgethi Phakeng", 1829, "+27 21 650 9111", "Law, Engineering, Social Sciences"));
        institutes.add(new InstituteDto("University of Tokyo", "Tokyo, Japan", "University", 28000, "Dr. Makoto Gonokami", 1877, "+81 3 3812 2111", "Science, Engineering, Humanities"));
        institutes.add(new InstituteDto("Imperial College London", "London, UK", "University", 18000, "Professor Alice Gast", 1907, "+44 20 7589 5111", "Engineering, Medicine, Science"));
        institutes.add(new InstituteDto("New York Film Academy", "New York, USA", "Training Institute", 5000, "Jean Sherlock", 1992, "+1 212-674-4300", "Film, Acting, Digital Media"));

        return institutes;
    }

    @Bean("juice")
    public List<JuiceShopDto> getJuiceShopInfo() {
        List<JuiceShopDto> juiceShops = new ArrayList<>();

        juiceShops.add(new JuiceShopDto("Juicy Bliss", "New York, USA", "Fruit Juices, Smoothies", 5.50, "Anna Williams", "+1 212-555-1234", true, true));
        juiceShops.add(new JuiceShopDto("The Smoothie Corner", "Los Angeles, USA", "Smoothies, Shakes", 6.00, "John Davis", "+1 323-555-5678", true, false));
        juiceShops.add(new JuiceShopDto("Green Fresh Juices", "London, UK", "Fruit Juices, Detox Smoothies", 4.80, "Rebecca Green", "+44 20 7946 0958", false, true));
        juiceShops.add(new JuiceShopDto("Vitamin Boost", "Miami, USA", "Smoothies, Protein Shakes", 7.00, "Carlos Martinez", "+1 305-555-9876", true, true));
        juiceShops.add(new JuiceShopDto("The Juice Factory", "Sydney, Australia", "Fruit Juices, Shakes", 5.25, "Sarah Brown", "+61 2 9123 4567", true, false));
        juiceShops.add(new JuiceShopDto("Fruit Fusion", "Paris, France", "Fruit Juices, Smoothies, Shakes", 6.50, "Pierre Dubois", "+33 1 45 67 89 10", false, true));
        juiceShops.add(new JuiceShopDto("Natural Sip", "Berlin, Germany", "Fresh Juices, Detox Smoothies", 5.75, "Klara Schmidt", "+49 30 123 4567", true, true));
        juiceShops.add(new JuiceShopDto("Tropical Blend", "Cape Town, South Africa", "Fruit Juices, Smoothies", 4.50, "David Nkosi", "+27 21 555 7890", true, false));
        juiceShops.add(new JuiceShopDto("Sunshine Juices", "Los Angeles, USA", "Fruit Juices, Protein Shakes", 5.00, "Jessica Lee", "+1 213-555-3456", false, true));
        juiceShops.add(new JuiceShopDto("Freshly Squeezed", "Toronto, Canada", "Fruit Juices, Smoothies", 4.80, "Michael Carter", "+1 416-555-9876", true, true));
        juiceShops.add(new JuiceShopDto("Vital Juices", "Madrid, Spain", "Fruit Juices, Detox Smoothies", 6.20, "Lucia Garcia", "+34 91 123 4567", false, false));
        juiceShops.add(new JuiceShopDto("Squeeze & Sip", "Singapore", "Fruit Juices, Shakes", 5.50, "Daniel Tan", "+65 6333 1234", true, true));
        juiceShops.add(new JuiceShopDto("Healthy Sip", "Dubai, UAE", "Fruit Juices, Smoothies", 7.50, "Hassan Al-Farsi", "+971 4 123 4567", true, true));
        juiceShops.add(new JuiceShopDto("Pure Juices", "Bangkok, Thailand", "Fresh Juices, Smoothies", 4.90, "Somchai Wong", "+66 2 233 7890", false, true));
        juiceShops.add(new JuiceShopDto("Juicylicious", "Hong Kong, China", "Fruit Juices, Smoothies, Shakes", 5.10, "Mei Li", "+852 2555 1234", true, false));

        return juiceShops;
    }

    @Bean("laptop")
    public List<LaptopDto> getLaptopInfo() {
        List<LaptopDto> laptops = new ArrayList<>();

        laptops.add(new LaptopDto("Dell", "XPS 13", "Intel i7", 16, 512, 13.3, "Windows", 1399.99));
        laptops.add(new LaptopDto("Apple", "MacBook Pro 13", "Apple M1", 8, 256, 13.3, "macOS", 1299.00));
        laptops.add(new LaptopDto("HP", "Spectre x360", "Intel i5", 8, 512, 13.3, "Windows", 1099.99));
        laptops.add(new LaptopDto("Lenovo", "ThinkPad X1 Carbon", "Intel i7", 16, 512, 14.0, "Windows", 1699.99));
        laptops.add(new LaptopDto("Asus", "ZenBook 14", "AMD Ryzen 5", 8, 512, 14.0, "Windows", 899.99));
        laptops.add(new LaptopDto("Microsoft", "Surface Laptop 4", "Intel i7", 16, 512, 13.5, "Windows", 1799.00));
        laptops.add(new LaptopDto("Acer", "Aspire 5", "Intel i5", 8, 256, 15.6, "Windows", 549.99));
        laptops.add(new LaptopDto("Razer", "Blade 15", "Intel i7", 16, 1000, 15.6, "Windows", 2199.00));
        laptops.add(new LaptopDto("Samsung", "Galaxy Book Pro", "Intel i7", 16, 512, 13.3, "Windows", 1499.99));
        laptops.add(new LaptopDto("LG", "Gram 17", "Intel i7", 16, 512, 17.0, "Windows", 1499.00));
        laptops.add(new LaptopDto("HP", "Pavilion 15", "Intel i5", 8, 512, 15.6, "Windows", 749.99));
        laptops.add(new LaptopDto("Apple", "MacBook Air", "Apple M1", 8, 256, 13.3, "macOS", 999.00));
        laptops.add(new LaptopDto("Alienware", "m15 R6", "Intel i9", 32, 1024, 15.6, "Windows", 2599.00));
        laptops.add(new LaptopDto("MSI", "GE66 Raider", "Intel i7", 16, 512, 15.6, "Windows", 1799.00));
        laptops.add(new LaptopDto("Huawei", "MateBook X Pro", "Intel i7", 16, 512, 13.9, "Windows", 1499.99));

        return laptops;
    }

    @Bean("microwave")
    public List<MicrowaveDto> getMicrowaveInfo() {
        List<MicrowaveDto> microwaves = new ArrayList<>();
        microwaves.add(new MicrowaveDto("Samsung", 23, "Solo", 800, "Black", true, false, 150));
        microwaves.add(new MicrowaveDto("LG", 28, "Convection", 1000, "Silver", true, true, 250));
        microwaves.add(new MicrowaveDto("Whirlpool", 25, "Grill", 900, "White", false, false, 180));
        microwaves.add(new MicrowaveDto("Panasonic", 20, "Solo", 700, "Black", false, false, 120));
        microwaves.add(new MicrowaveDto("Sharp", 30, "Convection", 1100, "Red", true, true, 300));
        microwaves.add(new MicrowaveDto("GE", 22, "Grill", 850, "Stainless Steel", false, true, 200));
        microwaves.add(new MicrowaveDto("Croma", 24, "Convection", 1000, "Grey", true, false, 220));
        microwaves.add(new MicrowaveDto("Samsung", 27, "Grill", 950, "White", true, true, 240));
        microwaves.add(new MicrowaveDto("Godrej", 26, "Solo", 800, "Silver", false, false, 130));
        microwaves.add(new MicrowaveDto("Haier", 28, "Convection", 1200, "Black", true, true, 320));
        microwaves.add(new MicrowaveDto("IFB", 23, "Solo", 700, "White", false, false, 140));
        microwaves.add(new MicrowaveDto("Bajaj", 25, "Grill", 900, "Grey", true, false, 160));
        microwaves.add(new MicrowaveDto("Whirlpool", 22, "Convection", 1100, "Red", false, true, 280));
        microwaves.add(new MicrowaveDto("LG", 29, "Solo", 850, "Silver", true, true, 260));
        microwaves.add(new MicrowaveDto("Kenstar", 21, "Grill", 800, "Black", false, true, 150));


        return microwaves;
    }

    @Bean("park")
    public List<ParkDto> getParkInfo() {
        List<ParkDto> parks = new ArrayList<>();
        parks.add(new ParkDto("Central Park", "New York", 340, "6 AM - 10 PM", true, true, 5000, "Playground, Jogging Track"));
        parks.add(new ParkDto("Hyde Park", "London", 250, "5 AM - 9 PM", true, true, 3000, "Lake, Picnic Area"));
        parks.add(new ParkDto("Golden Gate Park", "San Francisco", 410, "6 AM - 8 PM", true, true, 6000, "Museum, Playground"));
        parks.add(new ParkDto("Lalbagh", "Bangalore", 240, "5 AM - 9 PM", false, true, 3500, "Flower Garden"));
        parks.add(new ParkDto("Ueno Park", "Tokyo", 250, "6 AM - 9 PM", true, false, 4000, "Zoo, Museum"));
        parks.add(new ParkDto("Vondelpark", "Amsterdam", 450, "6 AM - 10 PM", true, true, 7000, "Playground, Concerts"));
        parks.add(new ParkDto("Jardin des Tuileries", "Paris", 280, "7 AM - 8 PM", false, true, 2000, "Art Gallery"));
        parks.add(new ParkDto("Victoria Park", "Hong Kong", 200, "6 AM - 8 PM", true, false, 1500, "Sports Fields"));
        parks.add(new ParkDto("Chester Zoo", "Chester", 510, "9 AM - 6 PM", false, true, 5000, "Zoo, Playground"));
        parks.add(new ParkDto("Balboa Park", "San Diego", 480, "7 AM - 9 PM", true, true, 8000, "Museums, Botanical Garden"));
        parks.add(new ParkDto("Parks Canada", "Ottawa", 600, "8 AM - 10 PM", true, false, 4000, "Hiking Trails"));
        parks.add(new ParkDto("Ibirapuera Park", "Sao Paulo", 400, "5 AM - 10 PM", true, true, 6000, "Art Exhibits, Lake"));
        parks.add(new ParkDto("Millennium Park", "Chicago", 250, "6 AM - 11 PM", true, true, 7000, "Concerts, Outdoor Art"));
        parks.add(new ParkDto("Shinjuku Gyoen", "Tokyo", 150, "6 AM - 7 PM", false, true, 3000, "Traditional Gardens"));
        parks.add(new ParkDto("Phoenix Park", "Dublin", 700, "7 AM - 9 PM", true, true, 8000, "Wildlife, Cycling Trails"));


        return parks;
    }

    @Bean("petrol")
    public List<PetrolBunkDto> getPetrolInfo() {
        List<PetrolBunkDto> petrolBunks = new ArrayList<>();
        petrolBunks.add(new PetrolBunkDto("Shell", "New York", "Petrol, Diesel", 3.5, true, true, "24/7", "123-456-7890"));
        petrolBunks.add(new PetrolBunkDto("BP", "London", "Petrol, Diesel, CNG", 4.0, false, true, "24/7", "098-765-4321"));
        petrolBunks.add(new PetrolBunkDto("Exxon", "San Francisco", "Petrol, Diesel", 3.8, true, false, "6 AM - 10 PM", "123-123-1234"));
        petrolBunks.add(new PetrolBunkDto("Chevron", "Los Angeles", "Petrol, Diesel", 3.9, true, true, "24/7", "456-456-4567"));
        petrolBunks.add(new PetrolBunkDto("Indian Oil", "Bangalore", "Petrol, Diesel", 3.7, false, false, "8 AM - 10 PM", "987-654-3210"));
        petrolBunks.add(new PetrolBunkDto("HP", "Delhi", "Petrol, Diesel", 4.1, true, true, "24/7", "555-555-5555"));
        petrolBunks.add(new PetrolBunkDto("Shell", "Paris", "Petrol, Diesel", 4.0, false, false, "6 AM - 8 PM", "212-345-6789"));
        petrolBunks.add(new PetrolBunkDto("Reliance", "Mumbai", "Petrol, Diesel, CNG", 3.6, true, true, "7 AM - 11 PM", "456-789-1230"));
        petrolBunks.add(new PetrolBunkDto("Total", "Berlin", "Petrol, Diesel", 3.8, true, false, "24/7", "789-789-7890"));
        petrolBunks.add(new PetrolBunkDto("BP", "Madrid", "Petrol, Diesel", 3.5, true, true, "9 AM - 8 PM", "321-321-3210"));
        petrolBunks.add(new PetrolBunkDto("Exxon", "Rome", "Petrol, Diesel", 3.7, true, true, "24/7", "213-214-2254"));
        petrolBunks.add(new PetrolBunkDto("Chevron", "Sydney", "Petrol, Diesel", 3.6, false, true, "7 AM - 10 PM", "134-234-2356"));
        petrolBunks.add(new PetrolBunkDto("Indian Oil", "Chennai", "Petrol, Diesel, CNG", 3.8, true, false, "8 AM - 11 PM", "432-432-4321"));
        petrolBunks.add(new PetrolBunkDto("HP", "Mumbai", "Petrol, Diesel", 3.9, false, true, "9 AM - 9 PM", "321-654-9870"));
        petrolBunks.add(new PetrolBunkDto("Reliance", "Kolkata", "Petrol, Diesel", 4.0, true, false, "24/7", "876-543-2100"));

        return petrolBunks;
    }

    @Bean("studio")
    public List<PhotoStudioDto> getPhotoStudioInfo() {
        List<PhotoStudioDto> photoStudios = new ArrayList<>();
        photoStudios.add(new PhotoStudioDto("Shutterbug Studio", "New York", "Photography, Editing, Printing", 50, true, "123-456-7890", "Alice Johnson", true));
        photoStudios.add(new PhotoStudioDto("Pixel Perfect", "London", "Photography, Editing", 60, true, "098-765-4321", "David Smith", false));
        photoStudios.add(new PhotoStudioDto("Flash Photography", "San Francisco", "Photography, Studio Setup", 70, false, "234-567-8901", "Mark Lee", true));
        photoStudios.add(new PhotoStudioDto("Focus Studios", "Los Angeles", "Photography, Editing, Printing", 55, true, "345-678-9012", "Eve Davis", true));
        photoStudios.add(new PhotoStudioDto("Snapshot Studios", "Paris", "Photography, Retouching", 80, true, "456-789-0123", "Tom Harris", false));
        photoStudios.add(new PhotoStudioDto("Digital Vision", "Tokyo", "Photography, Studio Rentals", 90, true, "567-890-1234", "Julia Carter", true));
        photoStudios.add(new PhotoStudioDto("Picture This", "Berlin", "Photography, Videography", 100, false, "678-901-2345", "Liam Turner", false));
        photoStudios.add(new PhotoStudioDto("The Lens", "Rome", "Photography, Editing", 50, true, "789-012-3456", "Zoe Green", true));
        photoStudios.add(new PhotoStudioDto("Shutter Studio", "Dubai", "Photography, Prints, Studio Setup", 40, true, "890-123-4567", "Samara Brown", true));
        photoStudios.add(new PhotoStudioDto("Light & Lens", "Madrid", "Photography, Studio Rentals", 75, false, "901-234-5678", "Elijah Moore", false));
        photoStudios.add(new PhotoStudioDto("Studio X", "Los Angeles", "Photography, Editing", 60, true, "112-233-4455", "Chloe Lee", true));
        photoStudios.add(new PhotoStudioDto("Flash Point", "Sydney", "Photography, Prints, Studio Rentals", 65, false, "223-344-5566", "Benjamin Taylor", false));
        photoStudios.add(new PhotoStudioDto("The Art Studio", "Milan", "Photography, Editing", 80, true, "334-455-6677", "Sophia Wright", true));
        photoStudios.add(new PhotoStudioDto("Camera Focus", "New York", "Photography, Editing", 85, true, "445-566-7788", "Liam King", false));
        photoStudios.add(new PhotoStudioDto("Capture Moments", "Chicago", "Photography, Videography", 90, true, "556-677-8899", "Hannah Young", true));


        return photoStudios;
    }

    @Bean("pipe")
    public List<PipeDto> getPipeInfo() {
        List<PipeDto> pipes = new ArrayList<>();
        pipes.add(new PipeDto("PVC", 2.5, 10, true, "Water Pipe", "White", 2.5, true));
        pipes.add(new PipeDto("Steel", 5.0, 12, false, "Drainage Pipe", "Silver", 5.5, false));
        pipes.add(new PipeDto("Copper", 3.0, 20, true, "Gas Pipe", "Copper", 3.2, true));
        pipes.add(new PipeDto("PVC", 4.0, 15, false, "Sewer Pipe", "Grey", 4.5, false));
        pipes.add(new PipeDto("Plastic", 2.0, 18, true, "Water Pipe", "Blue", 2.1, true));
        pipes.add(new PipeDto("Steel", 6.0, 25, true, "Gas Pipe", "Silver", 6.8, true));
        pipes.add(new PipeDto("Aluminum", 3.5, 30, false, "Vent Pipe", "Grey", 3.7, true));
        pipes.add(new PipeDto("PVC", 3.0, 10, true, "Water Pipe", "White", 3.2, false));
        pipes.add(new PipeDto("Copper", 5.0, 40, true, "Gas Pipe", "Copper", 5.2, true));
        pipes.add(new PipeDto("Steel", 6.5, 50, false, "Sewer Pipe", "Silver", 6.8, true));
        pipes.add(new PipeDto("PVC", 4.5, 35, true, "Drainage Pipe", "Green", 4.7, true));
        pipes.add(new PipeDto("Plastic", 2.5, 12, true, "Water Pipe", "White", 2.8, false));
        pipes.add(new PipeDto("Copper", 5.5, 15, true, "Water Pipe", "Copper", 5.7, true));
        pipes.add(new PipeDto("Steel", 6.0, 20, true, "Gas Pipe", "Silver", 6.3, true));
        pipes.add(new PipeDto("PVC", 3.0, 25, false, "Sewer Pipe", "Grey", 3.2, false));

        return pipes;
    }

    @Bean("shampoo")
    public List<ShampooDto> getShampooInfo() {
        List<ShampooDto> shampoos = new ArrayList<>();
        shampoos.add(new ShampooDto("Head & Shoulders", "Anti-dandruff", 200, "Zinc Pyrithione, Fragrance", "Fresh", true, 5.0, "Bottle"));
        shampoos.add(new ShampooDto("Pantene", "Moisturizing", 300, "Pro-Vitamin B5", "Floral", true, 6.0, "Bottle"));
        shampoos.add(new ShampooDto("Dove", "Nourishing", 250, "Hydrating Oils", "Coconut", false, 4.5, "Tube"));
        shampoos.add(new ShampooDto("Herbal Essences", "Volumizing", 350, "Rose Extracts", "Floral", true, 7.0, "Bottle"));
        shampoos.add(new ShampooDto("TRESemmé", "Repair & Protect", 400, "Biotin", "Fresh", false, 6.5, "Bottle"));
        shampoos.add(new ShampooDto("Sunsilk", "Anti-frizz", 500, "Honey", "Sweet", true, 4.0, "Bottle"));
        shampoos.add(new ShampooDto("L'Oreal", "Color Protect", 200, "UV Filters", "Lavender", true, 8.0, "Bottle"));
        shampoos.add(new ShampooDto("Aveda", "Shine", 300, "Coriander", "Earthy", false, 10.0, "Bottle"));
        shampoos.add(new ShampooDto("OGX", "Moisturizing", 250, "Coconut Oil", "Coconut", true, 5.5, "Tube"));
        shampoos.add(new ShampooDto("Bioderma", "Sensitive", 200, "Natural Oils", "Neutral", true, 12.0, "Bottle"));
        shampoos.add(new ShampooDto("Kiehl's", "Strengthening", 250, "Ginseng", "Herbal", true, 15.0, "Tube"));
        shampoos.add(new ShampooDto("Moroccanoil", "Hydrating", 300, "Argan Oil", "Citrus", false, 20.0, "Bottle"));
        shampoos.add(new ShampooDto("Burt's Bees", "Smoothing", 250, "Aloe Vera", "Mint", true, 9.0, "Bottle"));
        shampoos.add(new ShampooDto("Redken", "Extreme Strength", 300, "Protein Complex", "Floral", true, 13.0, "Bottle"));
        shampoos.add(new ShampooDto("Lush", "Clarifying", 350, "Lemon", "Citrus", true, 14.0, "Block"));


        return shampoos;
    }

    @Bean("shoe")
    public List<ShoeDto> getShoeInfo() {
        List<ShoeDto> shoes = new ArrayList<>();
        shoes.add(new ShoeDto("Nike", "Running Shoes", "Mesh", "Red", 10.5, true, 120.0, true));
        shoes.add(new ShoeDto("Adidas", "Casual Shoes", "Leather", "Black", 9.5, false, 80.0, true));
        shoes.add(new ShoeDto("Puma", "Running Shoes", "Synthetic", "Blue", 8.5, true, 100.0, false));
        shoes.add(new ShoeDto("Reebok", "Training Shoes", "Mesh", "Gray", 11.0, false, 90.0, true));
        shoes.add(new ShoeDto("Under Armour", "Casual Shoes", "Canvas", "White", 10.0, true, 110.0, true));
        shoes.add(new ShoeDto("New Balance", "Walking Shoes", "Leather", "Brown", 12.0, true, 130.0, true));
        shoes.add(new ShoeDto("Asics", "Running Shoes", "Mesh", "Purple", 9.0, false, 140.0, true));
        shoes.add(new ShoeDto("Fila", "Casual Shoes", "Canvas", "Green", 8.5, true, 60.0, false));
        shoes.add(new ShoeDto("Skechers", "Casual Shoes", "Leather", "Black", 10.5, true, 85.0, true));
        shoes.add(new ShoeDto("Nike", "Basketball Shoes", "Synthetic", "Orange", 12.5, false, 150.0, true));
        shoes.add(new ShoeDto("Adidas", "Sports Shoes", "Mesh", "Yellow", 11.5, true, 110.0, false));
        shoes.add(new ShoeDto("Saucony", "Running Shoes", "Mesh", "Pink", 9.0, true, 120.0, true));
        shoes.add(new ShoeDto("Vans", "Casual Shoes", "Canvas", "Black", 8.0, true, 50.0, true));
        shoes.add(new ShoeDto("Converse", "Casual Shoes", "Canvas", "White", 10.0, false, 60.0, false));
        shoes.add(new ShoeDto("Columbia", "Outdoor Shoes", "Leather", "Gray", 9.5, true, 135.0, true));

        return shoes;
    }

    @Bean("smartPhone")
    public List<SmartPhoneDto> getSmartPhoneInfo() {
        List<SmartPhoneDto> smartphones = new ArrayList<>();
        smartphones.add(new SmartPhoneDto("Apple", "iPhone 13", "iOS", 6.1, 3095, 999.0, 4, 128));
        smartphones.add(new SmartPhoneDto("Samsung", "Galaxy S21", "Android", 6.2, 4000, 799.0, 8, 128));
        smartphones.add(new SmartPhoneDto("OnePlus", "9 Pro", "Android", 6.7, 4500, 1069.0, 12, 256));
        smartphones.add(new SmartPhoneDto("Google", "Pixel 5", "Android", 6.0, 4080, 699.0, 8, 128));
        smartphones.add(new SmartPhoneDto("Xiaomi", "Mi 11", "Android", 6.81, 4600, 749.0, 8, 128));
        smartphones.add(new SmartPhoneDto("Sony", "Xperia 1 II", "Android", 6.5, 4000, 1199.0, 8, 256));
        smartphones.add(new SmartPhoneDto("Oppo", "Find X3 Pro", "Android", 6.7, 4500, 1149.0, 12, 256));
        smartphones.add(new SmartPhoneDto("Huawei", "P40 Pro", "Android", 6.58, 4200, 999.0, 8, 256));
        smartphones.add(new SmartPhoneDto("Realme", "GT 5G", "Android", 6.43, 4500, 599.0, 12, 256));
        smartphones.add(new SmartPhoneDto("Vivo", "X60 Pro", "Android", 6.56, 4200, 799.0, 12, 256));
        smartphones.add(new SmartPhoneDto("Asus", "ZenFone 8", "Android", 5.9, 4000, 699.0, 8, 128));
        smartphones.add(new SmartPhoneDto("Motorola", "Edge Plus", "Android", 6.7, 5000, 999.0, 12, 256));
        smartphones.add(new SmartPhoneDto("Nokia", "8.3 5G", "Android", 6.81, 4500, 699.0, 8, 128));
        smartphones.add(new SmartPhoneDto("LG", "V60 ThinQ", "Android", 6.8, 5000, 799.0, 8, 128));
        smartphones.add(new SmartPhoneDto("Poco", "X3 Pro", "Android", 6.67, 5160, 249.0, 6, 128));

        return smartphones;
    }

    @Bean("television")
    public List<TelevisionDto> getTelevisionInfo() {
        List<TelevisionDto> televisions = new ArrayList<>();
        televisions.add(new TelevisionDto("Samsung", 55, "4K", true, "Black", 499.0, "LED", 4));
        televisions.add(new TelevisionDto("LG", 65, "8K", true, "Silver", 1499.0, "OLED", 3));
        televisions.add(new TelevisionDto("Sony", 75, "4K", true, "Gray", 999.0, "LED", 4));
        televisions.add(new TelevisionDto("TCL", 55, "4K", false, "Black", 349.0, "LED", 2));
        televisions.add(new TelevisionDto("Panasonic", 60, "4K", true, "White", 799.0, "LED", 3));
        televisions.add(new TelevisionDto("Vizio", 50, "HD", true, "Black", 249.0, "LED", 2));
        televisions.add(new TelevisionDto("Hisense", 65, "4K", true, "Black", 599.0, "LED", 3));
        televisions.add(new TelevisionDto("Sharp", 55, "4K", true, "Silver", 649.0, "LED", 3));
        televisions.add(new TelevisionDto("Samsung", 85, "8K", true, "Black", 2499.0, "QLED", 5));
        televisions.add(new TelevisionDto("LG", 50, "4K", true, "Black", 799.0, "OLED", 4));
        televisions.add(new TelevisionDto("TCL", 65, "4K", false, "Black", 599.0, "LED", 3));
        televisions.add(new TelevisionDto("Samsung", 43, "HD", true, "Black", 349.0, "LED", 2));
        televisions.add(new TelevisionDto("Sony", 55, "4K", true, "Silver", 899.0, "LED", 3));
        televisions.add(new TelevisionDto("Vizio", 70, "4K", true, "Black", 749.0, "LED", 3));
        televisions.add(new TelevisionDto("Hisense", 75, "8K", true, "Gray", 1799.0, "ULED", 4));

        return televisions;
    }

    @Bean("trainee")
    public List<TraineeDto> getTraineeInfo() {
        List<TraineeDto> trainees = new ArrayList<>();
        trainees.add(new TraineeDto("John Doe", "Software Engineering", 22, "Tech Institute", "Mike Watson", "01-01-2022", "01-06-2022", "123-456-7890"));
        trainees.add(new TraineeDto("Jane Smith", "Marketing", 25, "Business Academy", "Sarah Taylor", "15-01-2022", "15-06-2022", "987-654-3210"));
        trainees.add(new TraineeDto("Sam Lee", "Data Science", 23, "AI Institute", "David Brown", "10-02-2022", "10-08-2022", "234-567-8901"));
        trainees.add(new TraineeDto("Emma Clark", "HR Management", 24, "Business Academy", "Rachel Adams", "01-03-2022", "01-09-2022", "345-678-9012"));
        trainees.add(new TraineeDto("Michael Miller", "Finance", 26, "Finance Academy", "John Smith", "20-02-2022", "20-08-2022", "456-789-0123"));
        trainees.add(new TraineeDto("Sophia Johnson", "Marketing", 21, "Tech Institute", "Mike Watson", "15-04-2022", "15-10-2022", "567-890-1234"));
        trainees.add(new TraineeDto("David Taylor", "Software Engineering", 23, "Software Academy", "Tom Harris", "01-01-2022", "01-07-2022", "678-901-2345"));
        trainees.add(new TraineeDto("Olivia Martinez", "UI/UX Design", 22, "Design Institute", "Sarah Davis", "01-06-2022", "01-12-2022", "789-012-3456"));
        trainees.add(new TraineeDto("Liam Wilson", "Mechanical Engineering", 25, "Engineering Institute", "Peter White", "20-03-2022", "20-09-2022", "890-123-4567"));
        trainees.add(new TraineeDto("Ava Harris", "Human Resources", 24, "Business Academy", "Rachel Adams", "15-02-2022", "15-08-2022", "901-234-5678"));
        trainees.add(new TraineeDto("Ethan Moore", "Project Management", 23, "Tech Institute", "Mike Watson", "25-04-2022", "25-10-2022", "123-123-1234"));
        trainees.add(new TraineeDto("Charlotte Lee", "Data Science", 22, "AI Institute", "David Brown", "10-01-2022", "10-07-2022", "234-234-2345"));
        trainees.add(new TraineeDto("Amelia Brown", "Marketing", 26, "Business Academy", "Sarah Taylor", "01-05-2022", "01-11-2022", "345-345-3456"));
        trainees.add(new TraineeDto("Jack White", "HR Management", 25, "Business Academy", "John Smith", "01-07-2022", "01-01-2023", "456-456-4567"));
        trainees.add(new TraineeDto("Mason Green", "Project Management", 24, "Tech Institute", "Tom Harris", "20-05-2022", "20-11-2022", "567-567-5678"));

        return trainees;
    }
    @Bean("watch")
    public List<WatchDto> getWatchInfo() {
        List<WatchDto> watches = new ArrayList<>();
        watches.add(new WatchDto("Rolex", "Submariner", "Automatic", "Stainless Steel", true, 7999.0, "Black", true));
        watches.add(new WatchDto("Omega", "Seamaster", "Quartz", "Titanium", true, 4500.0, "Blue", false));
        watches.add(new WatchDto("Tag Heuer", "Carrera", "Automatic", "Steel", true, 3500.0, "Black", true));
        watches.add(new WatchDto("Casio", "G-Shock", "Quartz", "Resin", false, 100.0, "Gray", false));
        watches.add(new WatchDto("Seiko", "Presage", "Mechanical", "Stainless Steel", false, 600.0, "White", true));
        watches.add(new WatchDto("Audemars Piguet", "Royal Oak", "Automatic", "Stainless Steel", true, 25000.0, "Blue", true));
        watches.add(new WatchDto("Patek Philippe", "Calatrava", "Manual", "Gold", false, 22000.0, "Silver", true));
        watches.add(new WatchDto("Citizen", "Eco-Drive", "Quartz", "Titanium", false, 300.0, "Black", true));
        watches.add(new WatchDto("Longines", "Master Collection", "Automatic", "Stainless Steel", false, 1800.0, "Silver", false));
        watches.add(new WatchDto("Fossil", "Grant", "Quartz", "Leather", false, 130.0, "Brown", true));
        watches.add(new WatchDto("Rolex", "Daytona", "Automatic", "Gold", true, 15000.0, "Black", true));
        watches.add(new WatchDto("Hublot", "Big Bang", "Automatic", "Titanium", false, 7000.0, "Blue", false));
        watches.add(new WatchDto("Apple", "Watch Series 7", "Smartwatch", "Aluminum", false, 399.0, "Green", true));
        watches.add(new WatchDto("Tissot", "Le Locle", "Automatic", "Stainless Steel", false, 550.0, "Black", true));
        watches.add(new WatchDto("Michael Kors", "Parker", "Quartz", "Gold", false, 150.0, "Rose Gold", true));

        return watches;
    }

    @Bean("weapon")
    public List<WeaponDto> getWeaponInfo() {
        List<WeaponDto> weapons = new ArrayList<>();

        weapons.add(new WeaponDto("Sword of Light", "Sword", 1.5, 50.0, 1.5, false, "Steel", 100));
        weapons.add(new WeaponDto("Bow of the Wild", "Bow", 1.2, 35.0, 50.0, true, "Wood", 85));
        weapons.add(new WeaponDto("Dragon Slayer", "Sword", 2.8, 120.0, 2.0, false, "Dragonbone", 200));
        weapons.add(new WeaponDto("Flame Bow", "Bow", 1.0, 40.0, 70.0, true, "Wood", 90));
        weapons.add(new WeaponDto("Crossbow", "Crossbow", 3.0, 45.0, 100.0, true, "Steel", 95));
        weapons.add(new WeaponDto("Axe of Fury", "Axe", 3.5, 75.0, 1.2, false, "Steel", 150));
        weapons.add(new WeaponDto("Staff of the Arcane", "Staff", 2.0, 30.0, 3.0, false, "Wood", 80));
        weapons.add(new WeaponDto("Mithril Sword", "Sword", 1.7, 55.0, 1.8, false, "Mithril", 120));
        weapons.add(new WeaponDto("Recurve Bow", "Bow", 1.1, 30.0, 60.0, true, "Wood", 75));
        weapons.add(new WeaponDto("Lightning Spear", "Spear", 2.2, 60.0, 3.0, false, "Steel", 110));
        weapons.add(new WeaponDto("Greatsword of the Fallen", "Sword", 4.0, 100.0, 2.5, false, "Steel", 180));
        weapons.add(new WeaponDto("Longbow of the Eagle", "Bow", 1.3, 50.0, 80.0, true, "Wood", 85));
        weapons.add(new WeaponDto("Twin Daggers", "Daggers", 0.8, 25.0, 1.0, false, "Steel", 65));
        weapons.add(new WeaponDto("Silver Mace", "Mace", 3.0, 70.0, 1.2, false, "Silver", 130));
        weapons.add(new WeaponDto("Throwing Knives", "Knife", 0.3, 15.0, 30.0, true, "Steel", 50));

        return weapons;
    }


}
