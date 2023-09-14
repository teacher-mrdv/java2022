// Depends on the Animal class (and may depend on its subclasses if used here)
public class ZooTest {

    public static void main(String[] args) {
        Zoo ofs = new Zoo("OFS", "81 Pasir Ris Heights");
        Animal[] ofsAnimals = new Animal[10];
        ofsAnimals[0] = new Fish("Minmin", 2010, 'y' );
        ofsAnimals[1] = new Zebra("Marty", 2012, "Savannah");
        ofsAnimals[2] = new Rabbit("Arnold", 2005, "Grey");
        ofs.setAnimals(ofsAnimals);
        System.out.println(ofs);
    }
}
