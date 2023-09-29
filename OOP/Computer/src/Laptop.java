public class Laptop extends Computer {

    private double batteryCapacity; // in mWh (megaWatts per hour)

    public Laptop(String name, int primaryMemory, int secondaryMemory, double batteryCapacity) {
        super(name, primaryMemory, secondaryMemory);
        this.batteryCapacity = batteryCapacity;
    }

    public Laptop(String name, String cpu, int primaryMemory, int secondaryMemory, double batteryCapacity) {
        super(name, cpu, primaryMemory, secondaryMemory);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double calculateVirtualMemory() {
        return this.getPrimaryMemory() * 1.2;
    }
    public String toString() {
        return super.toString() + "\nBattery capacity (mWh): " + this.batteryCapacity;
    }
}
