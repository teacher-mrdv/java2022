
public class ComputerTest {
	
	public static void main (String[] args) {
		Computer laptop = new Computer("T14s", 8, 512);
		System.out.println(laptop);
		System.out.println("Upgrading");
		laptop.setName("Lenovo T14s");
		System.out.println(laptop.getName());
		laptop.setPrimaryMemory(16);
		System.out.println(laptop.getPrimaryMemory()+" GB RAM");
		laptop.setSecondaryMemory(1024);
		System.out.println(laptop.getSecondaryMemory()+" GB SSD");
		System.out.println("Recommended VM allocation = " + laptop.getVirtualMemory() + " GB");

		System.out.println();
		Server opteron = new Server("Opteron01", 64,4096, 25);
		System.out.println(opteron);
		System.out.println("Upgrading");
		System.out.println( "Recommended VM allocation = " +
				opteron.getVirtualMemory() + " GB for " +
				opteron.getClients() + " clients" );
		opteron.setClients(15);
		System.out.println( "Recommended VM allocation = " +
				opteron.getVirtualMemory() + " GB for " +
				opteron.getClients() + " clients" );

		System.out.println();
		ThinClient chromeBook = new ThinClient("HP Stream", 4,32, "TCP/IP");
		System.out.println(chromeBook);
		System.out.println("Upgrading");
		chromeBook.setProtocol("TCP/IP v4, v6");
		System.out.println(chromeBook.getProtocol());
		System.out.println( "VM allocation = " +
				chromeBook.getVirtualMemory() + " GB" );
	}
}

