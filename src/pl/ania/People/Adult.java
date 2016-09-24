package pl.ania.People;

/**
 * Created by lukasz on 2016-09-22.
 */
public class Adult implements Human {


    private String name;
    public Adult(String name){
        this.name = name;
    }

    @Override
    public boolean isAdult() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
