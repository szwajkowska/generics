package pl.ania;

/**
 * Created by lukasz on 2016-09-21.
 */
public class Holder<T> {

    private T value;

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
