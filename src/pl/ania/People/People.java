package pl.ania.People;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 2016-09-22.
 */
public class People<T extends Human> {

    private final List<T> list;


    public People() {
        list = new ArrayList<T>();
    }




    public List<T> getAll() {
        return list;
    }


    boolean isPresent(T person) {
        return list.contains(person);
    }

    public boolean add(T person) {

        if (!isPresent(person)) {
            list.add(person);
            return true;
        }
        return false;
    }


}
