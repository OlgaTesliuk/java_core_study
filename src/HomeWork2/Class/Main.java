package HomeWork2.Class;

import lesson2.enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Skils> skils = new ArrayList<>();
        skils.add(new Skils("java", 10));
        skils.add(new Skils("js", 10));
        skils.add(new Skils("c++", 10));

User user= new User(1,"vasia","n c", 33,
        Gender.MALE, skils, new Car("bmw",33,250));
        System.out.println(user);
    }
}
