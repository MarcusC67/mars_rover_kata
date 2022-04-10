import java.util.Scanner;

public class ProgramController {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Accept input for plateau dimensions x and y
        System.out.println("Enter plateau dimensions x and y: ");
        String dimensions = scan.nextLine();
        // call buildPlateau method
        String plateau = buildPlateau(dimensions);
        System.out.println("plateau = " + plateau);

        // Accept input coordinates for start position to place Rover on plateau
        String name = "Rover1";
        System.out.println("Enter location of " + name + " as - x y h: ");
        String roverStartPosition = scan.nextLine();

        // call method to strip direction from input
        String direction = getDirection(roverStartPosition);
        System.out.println("Direction= " + direction);

        // Accept input string for Rover direction instructions
        System.out.println("Enter instructions: ");
        String navInstructions = scan.nextLine();

        // navInstructions = "LMLMLMLMLMM";

        for (int i = 0; i < navInstructions.length(); i++) {
            char instruction = navInstructions.charAt(i);
            // System.out.println("print each : " +  instruction);
            MoveRover.processInstructions(direction, instruction);
        }

    }

    public static String buildPlateau(String dimensions) {
        String[] part = dimensions.split(" ");
        String x = part[0];
        String y = part[1];
        String strDimensions = x + y;
        return strDimensions;
    }

    public static String getDirection(String roverStartPosition) {

        //System.out.println("Start Position = " + roverStartPosition);

        String[] part = roverStartPosition.split(" ");
        int x = Integer.parseInt(part[0]);
        int y = Integer.parseInt(part[1]);
        char direction = part[2].toCharArray()[0];

        String strDirection = Character.toString(direction);
        return strDirection;

    }

}
