package hw.hw3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Baraban implements  Instrument{
    int size;

    @Override
    public void play() {
        System.out.println("Играет baraban c size "+size);
    }
}
