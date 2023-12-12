import java.util.HashMap;


public class Program {
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("pride", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValues(hashmap);
    }

    public static void printValues(HashMap<String,Book> hashmap) {
        System.out.println("A");
        for (Book book: hashmap.values()) {
            System.out.println(book.toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Book book: hashmap.values()) {
            if (!book.getName().contains(text)) {
                continue;
            }

            System.out.println(book);
        }
    }

}
