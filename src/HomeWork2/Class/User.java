package HomeWork2.Class;

import lesson2.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   private int id;
   private String name;
   private String surname;
   private int age;
   private Gender gender;
   private List<Skils> skils;
   private Car car;


}
