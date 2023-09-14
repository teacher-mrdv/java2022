// Depends on the Animal classes
public class AnimalExample
{
    public static void main(String[] args)
    {
        // NEW calls the constructor and instantiates ahMeng
        // the parameters initialise the object's (ahMeng's) attributes
        Animal ahMeng = new Animal("Ah Meng", 1990);
        System.out.println(ahMeng); // default output: Animal@75bd9247
        System.out.println(ahMeng.getName() + " was born " + ahMeng.getBirthYear());
        ahMeng.setName("Bob"); // a setter allows us to modify an attribute
        System.out.printf( "Name: %-10s | Birth Year: %4d\n",
                ahMeng.getName(), ahMeng.getBirthYear() );
        ahMeng.talk();
        ahMeng.eat();
    }
}
