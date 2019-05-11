package recap.lecture9;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        List<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add("Cat");
        listOfAnimals.add("Tiger");
        listOfAnimals.add("Dog");
        listOfAnimals.add("Bear");
        listOfAnimals.add("Monkey");

        System.out.println(listOfAnimals);


        if (listOfAnimals.contains("Donkey")) {
            System.out.println("Error");
        }

        listOfAnimals.add(4, "Eagle");
        System.out.println(listOfAnimals);

        List<String> newListOfAnimalas = new ArrayList<>();
        newListOfAnimalas.addAll(listOfAnimals);

        System.out.println(newListOfAnimalas);
    }

}
