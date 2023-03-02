package homeWork1;

public class Main {
    public static void main(String[] args) {
        JsonPlaceholder1 example1 = new JsonPlaceholder1(1, 2, "xfgbfb", "srrfgbfgb");
        System.out.println(example1);

        JsonPlaceholder2 example2 = new JsonPlaceholder2(3, 5, "fghh", "sttgrtg", "rthrtbhrs");
        System.out.println(example2);

        Car car = new Car("BMW", 300, 2.4, true);
        System.out.println(car);

        Book book = new Book("Harry Potter", 654, new String[]{"Ani", "Sam"}, "trailer");
        System.out.println(book);

        Dog dog = new Dog("Bob", 3, "doberman");
        System.out.println(dog);
    }
}
