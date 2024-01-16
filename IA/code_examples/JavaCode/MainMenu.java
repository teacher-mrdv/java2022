import java.io.IOException;
/**
 * Main menu for Subject management system
 * @author marcos
 */
public class MainMenu
{
    public static void main(String[] args) throws IOException 
    {
        boolean continues = true;
        do
        {   // display the main menu
            System.out.println("\n\t== MENU ==");
            System.out.println("[ S ] Manage Students");
            System.out.println("[ T ] Manage Teachers");
            System.out.println("[ C ] Manage Subjects/Classes");
            System.out.println("[ Q ] Quit");
            char decision = IBIO.inputChar("\tEnter one letter for your option: ");
            decision = Character.toLowerCase(decision);
            System.out.println();
            switch (decision)
            {
                case 's':
                    StudentController.main(null);
                    break;

                case 't':
                    TeacherController.main(null);
                    break;

                case 'c':
                    SubjectController.main(null);
                    break;

                case 'q':
                    continues = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
                    break;
            } //end switch
        } while (continues);
                
    }
}
