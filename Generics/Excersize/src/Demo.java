
public class Demo {
    public static void main(String[] args) {
        Class<Integer> myClass = new Class<Integer>();
        Class<String> yourClass = new Class<String>();
        myClass.set(0);
        yourClass.set("0");
        System.out.println(myClass.get() + yourClass.get());
    }
}

