// Depends on the Animal class (and may depend on its subclasses if used here)
public class ZooTest {

    public static void main(String[] args) {
        Zoo ofs = new Zoo("OFS", "81 Pasir Ris Heights");
        Animal ofsAnimal;
        ofsAnimal = new Fish("Minmin", 2010, 'y' );
        ofs.setAnimal(ofsAnimal);
        ofsAnimal = new Zebra("Marty", 2012, "Savannah");
        ofs.setAnimal(ofsAnimal);
        ofsAnimal = new Rabbit("Arnold", 2005, "Grey");
        ofs.setAnimal(ofsAnimal);
        System.out.println(ofs);
    }
}
