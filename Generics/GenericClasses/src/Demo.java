import Generics.src.*;

public class Demo {
    public static void main(String[] args) {

        Pair<Integer, Integer> ii;
        ii = new Pair<Integer, Integer>(12,23);

        System.out.println(ii.getOne());
        System.out.println(ii.getTwo());
    }
}
