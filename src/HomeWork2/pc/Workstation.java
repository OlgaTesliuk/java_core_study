package HomeWork2.pc;

public class Workstation extends Laptop{
    private String producer;

    public Workstation(String producer) {
        this.producer = producer;
    }

    public Workstation() {
    }

    public Workstation(String procesor, int id, String type, String producer) {
        super(procesor, id, type);
        this.producer = producer;
    }
}
