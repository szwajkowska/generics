package pl.ania.People;

/**
 * Created by lukasz on 2016-09-22.
 */
public class Kid implements Human, Grownup{

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
}
