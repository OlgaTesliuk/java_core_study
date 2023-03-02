package lesson1.demo2;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    int id;
    String name;
    boolean status;
    double weidht;
}
