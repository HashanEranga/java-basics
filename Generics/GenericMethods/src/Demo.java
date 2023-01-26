public class Demo {
    public static void main(String[] args) {
        PrintAny(12);
        PrintAny("Hashan");
        PrintAny(true);
    }

    public static <T> void PrintAny(T input){
        System.out.println(input.getClass() + " = " + input);
    }
}
