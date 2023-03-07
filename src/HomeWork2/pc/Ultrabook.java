package HomeWork2.pc;

public class Ultrabook extends Laptop {
    private String model;

    public Ultrabook() {
    }

    public Ultrabook(String model) {
        this.model = model;
    }

    public Ultrabook(String procesor, int id, String type, String model) {
        super(procesor, id, type);
        this.model = model;
    }
}
