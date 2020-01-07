package data;

import java.util.ArrayList;
import java.util.Arrays;

public class FakeData {
    public static ArrayList<Animal> animals = new ArrayList(Arrays.asList(
        new Animal("Anjing"),
        new Animal("Kucing"),
        new Animal("Burung"),
        new Animal("Hamster"),
        new Animal("Kelinci"),
        new Animal("Biawak"),
        new Animal("Ular")
    ));

    public static ArrayList<AnimalRace> animalRaces = new ArrayList(Arrays.asList(
            new AnimalRace(animals.get(0),"Husky"),
            new AnimalRace(animals.get(0),"Golden"),
            new AnimalRace(animals.get(0),"Pomerian"),
            new AnimalRace(animals.get(0),"Pomsky"),
            new AnimalRace(animals.get(0),"Shiba"),
            new AnimalRace(animals.get(0),"Samoyed"),
            new AnimalRace(animals.get(1),"Persia"),
            new AnimalRace(animals.get(1),"Sphynx"),
            new AnimalRace(animals.get(1),"Ragdoll"),
            new AnimalRace(animals.get(1),"Anggora"),
            new AnimalRace(animals.get(2),"Merpati"),
            new AnimalRace(animals.get(2),"Hantu"),
            new AnimalRace(animals.get(2),"Pengicau"),
            new AnimalRace(animals.get(2),"Walet"),
            new AnimalRace(animals.get(2),"Beo"),
            new AnimalRace(animals.get(2),"Kakaktua"),
            new AnimalRace(animals.get(3),"Roborovski"),
            new AnimalRace(animals.get(3),"Campbell"),
            new AnimalRace(animals.get(3),"Gansu"),
            new AnimalRace(animals.get(3),"Cricetulus"),
            new AnimalRace(animals.get(4),"Rex"),
            new AnimalRace(animals.get(4),"Dwarf"),
            new AnimalRace(animals.get(4),"Holland Lop"),
            new AnimalRace(animals.get(4),"Flemish"),
            new AnimalRace(animals.get(4),"Tapeti"),
            new AnimalRace(animals.get(5),"-"),
            new AnimalRace(animals.get(6),"Phyton"),
            new AnimalRace(animals.get(6),"Cobra"),
            new AnimalRace(animals.get(6),"Titanoboa"),
            new AnimalRace(animals.get(6),"Sanca"),
            new AnimalRace(animals.get(6),"Anakonda")
    ));
}
