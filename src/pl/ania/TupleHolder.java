package pl.ania;

/**
 * Created by lukasz on 2016-09-21.
 */
public class TupleHolder<T, R> {

    private T key;

    private R value;

    public TupleHolder(T key, R value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public R getValue() {
        return value;
    }
}
