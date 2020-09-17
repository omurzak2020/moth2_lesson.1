package com.company;

public class Main {

    public static void main(String[] args) {

       Dog dog1 = new Dog();
       dog1.setName("Рекс");
       dog1.setBreed("Немецкая овчарка");
       String[] commands = {"сидеть","лежать","прыгать"};
       dog1.setCommands(commands);
       System.out.println(dog1.getInfo());
       dog1.makeVoice("Гаф-гаф");

        Dog dog2 = new Dog("лайка"," Алабай", Color.BLACK,
                new Shelter("симба","Советская 175"));
        dog2.setCommands(commands);
        System.out.println(dog2.getInfo());
        dog2.makeVoice("таф-таф",2);

        Shelter shelter = new Shelter("лайка2","Токтогула 175");
        Dog dog3 = new Dog(Color.BLACK, shelter,
                "Алгыр","чихуа-хува",commands);
        System.out.println(dog3.getInfo());
        dog3.makeVoice(4,"Vay");
    }
}
