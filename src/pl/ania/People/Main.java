package pl.ania.People;

/**
 * Created by lukasz on 2016-09-22.
 */
public class Main {
    public static void main(String[] args) {

        Kid kidOne = new Kid("Bartek");
        Kid kidTwo = new Kid("Ada");

        Adult adultOne = new Adult("Lukasz");
        Adult adultTwo = new Adult("Ania");

       People<Kid> kids = new People<>(kidOne);

    }
}
