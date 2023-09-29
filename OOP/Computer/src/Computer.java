/*
	Note: nevermind the abstract, it's something to help remind you to write the calculateVirtualMemory method in...
	...ALL your subclasses
*/
public abstract class Computer {

    private String name;
    private String cpu;
    private int primaryMemory;        // in GB
    private int secondaryMemory;    // in GB

    public Computer(String name, int primaryMemory, int secondaryMemory) {
        this.name = name;
        this.cpu = "";
        this.primaryMemory = primaryMemory;
        this.secondaryMemory = secondaryMemory;
    }

    public Computer(String name, String cpu, int primaryMemory, int secondaryMemory) {
        this.name = name;
        this.cpu = cpu;
        this.primaryMemory = primaryMemory;
        this.secondaryMemory = secondaryMemory;
    }

    public String getName() {
        return this.name;
    }

    public int getPrimaryMemory() {
        return this.primaryMemory;
    }

    public int getSecondaryMemory() {
        return this.secondaryMemory;
    }

    public String getCPU() {
        return this.cpu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryMemory(int primaryMemory) {
        this.primaryMemory = primaryMemory;
    }

    public void setSecondaryMemory(int secondaryMemory) {
        this.secondaryMemory = secondaryMemory;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public abstract double calculateVirtualMemory(); // this is fine

    public String toString() {
        String output = "Computer name: " + this.name;
        output = output + "\nProcessor: " + this.cpu;
        output = output + "\nRAM in GB: " + this.primaryMemory;
        output = output + "\nSSD in GB: " + this.secondaryMemory;
        return output;
    }

}
