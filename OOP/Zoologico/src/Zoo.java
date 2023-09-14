public class Zoo
{
    private static final int MAXCAPACITY = 1000;
    private String name;
    private String address;
    public Animal[] animals; // aggregation

    public Zoo(String name, String address)
    {
       this.name = name;
       this.address = address;
       this.animals = new Animal[MAXCAPACITY];
    }


}
