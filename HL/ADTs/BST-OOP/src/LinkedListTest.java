import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LinkedListTest {
    public static void main(String[] args) throws IOException {
        LinkedList list = new LinkedList();
        int id;
        String name;
        Student newNode;
        File file = new File("student_data.txt");
        Scanner in = new Scanner(file);
        while (in.hasNext()) {
            String temp = in.nextLine();
            String[] line = temp.split(",");
            id = Integer.parseInt(line[0]);
            name = line[1];
            newNode = new Student(id, name);
            //System.out.println(newNode);
            list.add(newNode);
        } // end while
        in.close();
        //System.out.println("Data loaded from file.\n");
        System.out.println(list);
    }
}
