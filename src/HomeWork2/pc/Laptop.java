package HomeWork2.pc;




public class Laptop extends PC{
    private String procesor;

    public Laptop(){}

    public Laptop(String procesor, int id,String type){
        super(id, type);
        this.procesor=procesor;
    }
}
