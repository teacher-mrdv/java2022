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
        ofsAnimal = new Zebra("Arnold", 2020, "Plains");
        ofs.setAnimal(ofsAnimal);
        ofsAnimal = new Rabbit("Kooky", 2013, "White");
        ofs.setAnimal(ofsAnimal);
        System.out.println(ofs);
        // how to print the first animal added to the zoo?
        System.out.println(ofs.getAnimal(0));
        // how to print the last animal added to the zoo?
        System.out.println(ofs.getAnimal(ofs.getPopulation()-1));
        // how to get the first and last animal's names?
        System.out.println(ofs.getAnimal(0).getName());
        System.out.println(ofs.getAnimal(ofs.getPopulation()-1).getName());
        // which animal is the youngest in the zoo?
        if(!ofs.isEmpty()) {
            int min = ofs.getAnimal(0).getAge();
            for(int i = 1; i < ofs.getPopulation(); i++) {
                if (ofs.getAnimal(i).getAge() < min) {
                    min = ofs.getAnimal(i).getAge();
                }
            }
            System.out.println(min);
        }
    }
}
