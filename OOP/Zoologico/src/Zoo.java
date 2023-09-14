import java.util.Arrays;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public Animal getAnimal(int index) {
        if( animals[index] == null || index < 0 || index > MAXCAPACITY) {
            System.out.println("Error");
            return null;
        }
        return animals[index];
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setAnimal(Animal animal, int index) {
        if( index < 0 || index > MAXCAPACITY) {
            System.out.println("Error");
            return;
        }
        animals[index] = animal;
    }

    @Override
    public String toString() {
        String output =
                "Zoo name: " + this.name + "\nAddress: " + this.address +
                "Animals:\n";
        for(Animal a : animals) {
            if(a!=null)
                output = output + "\t" + a.toString() + "\n";
        }
        return output;

/*        return "Zoo name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", animals=" + Arrays.toString(animals) +   // Depdendency on
                '}';                                        // Arrays class
 */
    }

}
