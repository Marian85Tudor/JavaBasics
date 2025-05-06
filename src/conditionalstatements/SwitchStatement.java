package conditionalstatements;

import javax.swing.event.SwingPropertyChangeSupport;

public class SwitchStatement {
    public static void main(String[] args) {


        String choice = "juice";

        switch (choice) {

            case "water":
                System.out.println("Dispensing  water");
                break;
            case "soda":
                System.out.println("Dispensing soda");
                break;
            case "juice":
                System.out.println("Dispensing juice");
                break;
            case "coffee":
                System.out.println("Dispensing coffee");
                break;
            default:
                System.out.println("Your drink's is not available");
                break;


        }
    }
}
