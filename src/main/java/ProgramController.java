import java.util.Scanner;

public class ProgramController {

    public static void main(String[] args) {
    //public static void input() {

        Scanner scan = new Scanner(System.in);

        // Accept input for plateau dimensions x and y
        // *******************************************
        System.out.println("Enter plateau dimensions x and y: ");
        String dimensions = scan.nextLine();
        // call buildPlateau method
        String plateau = buildPlateau(dimensions);
        System.out.println("plateau = " + plateau);

        // Accept input coordinates for start position to place Rover on plateau
        // *********************************************************************
        String name = "Rover1";
        System.out.println("Enter location of " + name + " as - x y h: ");
        String roverStartPosition = scan.nextLine();
        // call method to place rover at start position
        String rover = RoverController.placeRover(name, plateau, roverStartPosition);

    }

    public static String buildPlateau(String dimensions) {
        String[] part = dimensions.split(" ");
        String x = part[0];
        String y = part[1];
        String str = x + y;
        return str;
    }

}
