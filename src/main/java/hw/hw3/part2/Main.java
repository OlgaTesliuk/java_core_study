package hw.hw3.part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments= new ArrayList<>();
        instruments.add(new Baraban(4));
        instruments.add(new Gitara(6));
        instruments.add(new Truba(5));

        for(Instrument instrument: instruments){
            instrument.play();
        }
    }
}
