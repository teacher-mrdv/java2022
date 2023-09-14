// Depends on the Fish and Animal classes
public class FishTest {

    public static void main(String[] args) {
        Fish ye = new Fish("Mr West", 1977, 'Y');
        System.out.println(ye);
        ye.setSeaWater('N');
        System.out.println(ye);
        ye.setSeaWater(true);
        System.out.println(ye);
        ye.talk();
        ye.eat();

        Fish cartman = new Fish("Cartman", 1990, false);
        System.out.println(cartman);
        cartman.talk();
        cartman.eat();
    }
}
