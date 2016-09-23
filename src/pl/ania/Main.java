package pl.ania;

public class Main {

    public static void main(String[] args) {
        StringHolder stringHolder = new StringHolder("generyki weneryki");
        StringHolder2<Integer> stringHolder2 = new StringHolder2<>("testdadsada", 23);
        System.out.println(stringHolder2.getValue());


        Holder<String> holder = new Holder<>("test");

        System.out.println(holder.getValue());

        Holder<Integer> intHolder = new Holder<>(24);

        System.out.println(intHolder.getValue());

        Holder<Holder<Integer>> holderHolder = new Holder<>(intHolder);
        Holder<Integer> value = holderHolder.getValue();
        System.out.println(value.getValue());

    }
}
