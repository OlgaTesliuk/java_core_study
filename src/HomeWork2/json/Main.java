package HomeWork2.json;

public class Main {
    public static void main(String[] args) {
User user= new User(1,"vasia", "kokos", "ksdjvnj@gmail.com",
        new Address("sc","dvd","vsdv","4546-8",
                new Geo("88","66")),
        "7864t736484874123847","www.com",
        new Company("sdc","scsac","sdcsd"));

        System.out.println(user);
    }

}
