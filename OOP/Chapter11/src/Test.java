import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        String n = "Pepe";
        String m = n;
        String o = new String("Pepe");
        String q = "Pepe";
        System.out.println(n == m);
        System.out.println(n == o);
        System.out.println(n == q);
        System.out.println(n.equals(o));
    }
}
