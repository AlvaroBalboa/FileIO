package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by souporman on 2/15/17.
 */
public class Massage {
    String masseuse;
    int lengthOfTime;
    int price;
    int yelpRating;
    String specialty;



    public String getMasseuse() {
        return masseuse;
    }

    public void setMasseuse(String masseuse) {
        this.masseuse = masseuse;
    }

    public int getLengthOfTime() {
        return lengthOfTime;
    }

    public void setLengthOfTime(int lengthOfTime) {
        this.lengthOfTime = lengthOfTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYelpRating() {
        return yelpRating;
    }

    public void setYelpRating(int yelpRating) {
        this.yelpRating = yelpRating;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //saves the list currently as it is
    public static void saveGirls() throws IOException {

        JsonSerializer serializer = new JsonSerializer();
        String jsonFormmatedPerson = serializer.include("*").serialize(Main.listMasseuse);

        File file = new File("savedGirls.json");
        FileWriter fwriter = new FileWriter(file);
        fwriter.write(jsonFormmatedPerson);
        fwriter.close();
    }

    //Loads the list with the previous save
    //TODO FIX THIS PIECE OF SHYTE
//    public static Massage loadGirls() throws FileNotFoundException {
//        File f = new File("savedGirls.json");
//        Scanner scanner = new Scanner(f);
//        scanner.useDelimiter("\\Z");
//        String contents = scanner.next();
//
//        JsonParser parser = new JsonParser();
//        //return parser.parse(contents, Main.listMasseuse.add(new HappyEnding()));
//        return Main.listMasseuse.add(new HappyEnding(parser.parse(contents,Massage.class)));
//    }

    //This si the print screen and it retrieves it by iterating through everything and using this object in the parent class
    public void print() {
        String pMasseuse=getMasseuse();
        int pLengthOfTime = getLengthOfTime();
        int pPrice = getPrice();
        int pYelpRating = getYelpRating();
        String pSpecialty = getSpecialty();

        System.out.printf("\nMASSEUSE NAME  :%s\n", pMasseuse);
        System.out.printf("OFFERS %s MINUTE SERVICE\n", pLengthOfTime);
        System.out.printf("PRICE:  $%s PER SESSION\n", pPrice);
        System.out.printf("SPECIALTY :%s \n", pSpecialty);
        System.out.printf("YELP RATING  %s STARS\n", pYelpRating);

    }
}
