package hw.hw3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gitara implements Instrument{
    int countStrun;
    @Override
    public void play() {
        System.out.println("Играет gitara c countStrun"+ countStrun);
    }
}
