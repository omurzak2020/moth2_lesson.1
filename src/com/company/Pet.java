package com.company;

import java.util.Random;

public class Pet {
    private int age;
    private Color color;
    private Shelter shelter;

    public void setColor(Color color){
        this.color=color;
    }
    public void setShelter(Shelter shelter){
        this.shelter=shelter;
    }

    public int getAge(){
        return age;
    }
    public Color getColor(){
        return color;
    }
    public Shelter getShelter(){
        return shelter;
    }

    private int generateDefaultAge(){
//        Random  r = new Random();
//        return r.nextInt(20);

        return (int) (Math.random()*10+5);
    }
    public String getInfo(){

        return "Pet = ["+"\nage = "+age+
                "\ncolor = "+color+
                "\nshelter = "+shelter+
                "\n ]";
    }
}
