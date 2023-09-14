// Depends on the Rabbit and Animal classes
public class RabbitTest
{
    public static void main(String[] args)
    {
        System.out.println("Rabbit test class");
        // complete this class -- use AnimalExample and ZebraTest as inspiration
        System.out.println();
        Rabbit fluffy = new Rabbit("Mr Fluffy", 2020, "white");
        System.out.println(fluffy); // this tests toString()
        System.out.print(fluffy.getName() + " ");
        System.out.println(fluffy.getHideColour());
        fluffy.setHideColour("green");
        System.out.println(fluffy);
        fluffy.talk();
        fluffy.eat();
    }
}
