import java.util.Scanner;

public class ProgramController {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // User inputs plateau dimensions x and y
        System.out.println("Enter plateau dimensions x and y: ");
        String dimensions = scan.nextLine();

        // Call buildPlateau method
        String plateau = buildPlateau(dimensions);
        System.out.println("plateau = " + plateau);

        // Loop through each rover
        int i = 0;
        while (i < 2) {
            i++;

            String name = "Rover" + i;

            // User inputs coordinates for start position to place Rover on plateau
            System.out.println("Enter location of " + name + " as - 'x y' plus direction 'N,S,E or W': ");
            String startPosition = scan.nextLine();

            // Call method to strip direction from input
            String direction = getDirection(startPosition);
            System.out.println("Direction= " + direction);

            // User inputs a string with rover navigation instructions
            System.out.println("Enter instructions: ");
            String navInstructions = scan.nextLine();

            // Process instructions and set rover end position
            startPosition = Directions.processInstructions(direction, navInstructions, startPosition);
            System.out.println("Final Position = " +  startPosition);
        }
    }

    // Getters and setters
    // *******************

    public static String buildPlateau(String dimensions) {
        String[] part = dimensions.split(" ");
        String x = part[0];
        String y = part[1];
        String strDimensions = x + y;
        return strDimensions;
    }
    public static int[] getXYCoordinates(String startPosition) {
        String[] part = startPosition.split(" ");
        int[] arrayCoordinates = new int[2];
        arrayCoordinates[0] = Integer.parseInt(part[0]);
        arrayCoordinates[1] = Integer.parseInt(part[1]);
        return arrayCoordinates;
    }

    public static String getDirection(String startPosition) {
        String[] part = startPosition.split(" ");
        String strDirection = part[2];
        return strDirection;
    }

    // Set new position
    public static String setNewPosition(int[] endCoordinates, String direction) {
        int x = endCoordinates[0];
        int y = endCoordinates[1];
        return (x + " " + y + " " + direction);
    }
    
}
