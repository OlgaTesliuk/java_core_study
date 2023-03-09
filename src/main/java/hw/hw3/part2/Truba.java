package hw.hw3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Truba  implements Instrument{
    int diameter;

    public void play() {
        System.out.println("Играет труба с диаметром "+ diameter);

    }
}
