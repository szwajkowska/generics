package pl.ania.People;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 2016-09-22.
 */
public class People<T> {

    private T person;

    public T getPerson() {
        return person;
    }

    public People(T person){
        this.person = person;
    }

    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public List<T> getAll() {
        return list;
    }

    public void add(T person) {
        list.add(person);
    }


}
