
public class Main {

    public static void main(String[] args) {
        SimpleDate d1 = new SimpleDate(1, 2, 2000);
        SimpleDate d2 = new SimpleDate(21, 3, 2001);
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

    }
}
