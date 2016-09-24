package pl.ania.People;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 2016-09-22.
 */
public class Main {
    public static void main(String[] args) {

        Kid kidOne = new Kid("Bartek");
        Kid kidTwo = new Kid("Ada");
        Kid kidThree = new Kid("Franio");

        Adult adultOne = new Adult("Lukasz");
        Adult adultTwo = new Adult("Ania");

        People<Kid> kids = new People<>();
        kids.add(kidOne);
        kids.add(kidTwo);

        People<Adult> adults = new People<>();
        adults.add(adultOne);
        adults.add(adultTwo);

        People<Human> allPeople = new People<>();
        allPeople.add(kidOne);
        allPeople.add(adultOne);

        System.out.println(kids.getAll());
        System.out.println(kids.add(kidThree));
        System.out.println(kids.getAll());
        System.out.println(allPeople.getAll());

        for (Human human : allPeople.getAll()) {
            System.out.println(human);
        }

        for (int i = 0; i < allPeople.getAll().size(); i++) {
            System.out.println(allPeople.getAll().get(i));
        }


    }
}
