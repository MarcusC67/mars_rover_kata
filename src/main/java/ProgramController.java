import java.util.Scanner;

public class ProgramController {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Accept input for plateau dimensions x and y
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

            // Accept input coordinates for start position to place Rover on plateau
            System.out.println("Enter location of " + name + " as - x y h: ");
            String startPosition = scan.nextLine();

            // Call method to strip direction from input
            String direction = getDirection(startPosition);
            System.out.println("Direction= " + direction);

            // Accept input string for Rover direction instructions
            System.out.println("Enter instructions: ");
            String navInstructions = scan.nextLine();

            for (int j = 0; j < navInstructions.length(); j++) {
                char instruction = navInstructions.charAt(j);
                System.out.println("print each : " +  instruction);

                switch (instruction) {
                    case 'L': RoverMove.rotateLeft(direction);
                    case 'R': RoverMove.rotateRight(direction);
                    case 'M':
                        int[] startCoordinates = getXYCoordinates(startPosition);
                        int x = startCoordinates[0];
                        int y = startCoordinates[1];
                        int[] endCoordinates = RoverMove.moveForward(x, y, direction);
                        System.out.println("end coordinates = " + endCoordinates);
                    default: throw new RuntimeException("Should not get here!");
                }
            }
        }
    }

    public static String buildPlateau(String dimensions) {
        String[] part = dimensions.split(" ");
        String x = part[0];
        String y = part[1];
        String strDimensions = x + y;
        return strDimensions;
    }
    private static int[] getXYCoordinates(String startPosition) {
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

}
