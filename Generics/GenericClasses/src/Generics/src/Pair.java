package Generics.src;

public class Pair<A,B> {
    private A one;
    private B two;
    public Pair(A a,B b){
        one=a;
        two=b;
    }

    public A getOne() {
        return one;
    }

    public void setOne(A one) {
        this.one = one;
    }

    public B getTwo() {
        return two;
    }

    public void setTwo(B two) {
        this.two = two;
    }
}
