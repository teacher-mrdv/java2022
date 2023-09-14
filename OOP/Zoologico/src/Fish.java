public class Fish extends Animal {

    private boolean seaWater; // waterType

    public Fish(String name, int birthYear, boolean seaWater) {
        super(name, birthYear);
        this.seaWater = seaWater;
    }

    public Fish(String name, int birthYear, char seaWater) {
        super(name, birthYear);
        this.setSeaWater(seaWater);
    }

    // accessor (getter)
    public boolean isSeaWater() {
        return seaWater;
    }

    public char getSeaWater() {
        if( seaWater ) {
            return 'Y';
        } else {
            return 'N';
        }
    }

    public void setSeaWater(boolean seaWater) {
        this.seaWater = seaWater;
    }

    public void setSeaWater(char seaWater) {
        seaWater = Character.toUpperCase(seaWater);
        if(seaWater == 'Y')
            this.seaWater = true;
        else
            this.seaWater = false;
    }

    public void talk() {
        System.out.println("Glu glu");
    }

    public void eat() {
        System.out.println("Nom nom");
    }

    @Override
    public String toString() {
        return super.toString() + " | Salt water fish? " + getSeaWater();
    }
}
