import java.util.Arrays;

public class Zoo
{
    private static final int MAXCAPACITY = 1000;
    private String name;
    private String address;
    private Animal[] animals; // aggregation
    private int population;

    public Zoo(String name, String address)
    {
       this.name = name;
       this.address = address;
       this.animals = new Animal[MAXCAPACITY];
       this.population = 0;
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
        if( index < 0 || index >= MAXCAPACITY || animals[index] == null ) {
            System.out.println("Error");
            return null;
        }
        return animals[index];
    }

    /* Not really useful to us...
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    */

    public void setAnimal(Animal animal) {
        if( this.population >= MAXCAPACITY) {
            System.out.println("Over capacity");
            return;
        }
        animals[population] = animal;
        population++;
    }

    @Override
    public String toString() {
        String output =
                "Zoo name: " + this.name + "\nAddress: " + this.address +
                "\nPopulation: " + this.population + "\nAnimals:\n";
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
