public class StorageServer extends Server {
    private int redundancy;

    public StorageServer(String name, int primaryMemory, int secondaryMemory,
                         int clients, int redundancy) {
            super(name, primaryMemory, secondaryMemory, clients);
            this.redundancy = redundancy;
    }

    // StorageServer communityServer = new StorageServer("OFScs", 32, 16384,
    //				    400, 3);

    public int getRedundancy() {
        return redundancy;
    }

    public void setRedundancy(int redundancy) {
        this.redundancy = Math.abs(redundancy); // make sure it's a +integer
    }

    public String toString() {
        return super.toString() + "\nRedundancy: " + this.redundancy;
    }
}

