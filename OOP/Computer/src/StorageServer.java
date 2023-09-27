public class StorageServer extends Server {
    private int redundancy;

    public StorageServer(String name, int primaryMemory, int secondaryMemory, int clients) {
            super(name, primaryMemory, secondaryMemory);
    }

}

