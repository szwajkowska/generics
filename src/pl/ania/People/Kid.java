package pl.ania.People;

/**
 * Created by lukasz on 2016-09-22.
 */
public class Kid implements Human {

    private String name;

    public Kid(String name){
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isAdult() {
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - jest dzieckiem";
    }
}
