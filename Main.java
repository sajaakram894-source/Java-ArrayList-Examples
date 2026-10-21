import java.util.ArrayList;
public class Main { public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Orange");
    fruits.add("Banana");

    System.out.println("Fruits: " + fruits);

    fruits.set(1, "Mango");
    System.out.println("After update: " + fruits);

    fruits.remove("Banana");
    System.out.println("After removal: " + fruits);

    System.out.println("All fruits:");

    for (String fruit : fruits) {
        System.out.println(fruit);
    }

    System.out.println("Size: " + fruits.size());
    System.out.println("Contains Apple: " + fruits.contains("Apple"));
}
}
