public class Directions {

    public static String processInstructions(String direction, String navInstructions, String startPosition) {

        for (int j = 0; j < navInstructions.length(); j++) {
            char instruction = navInstructions.charAt(j);

            // Get start x y coordinates eg: input 1 1 N - get 1 1
            int[] startCoordinates = ProgramController.getXYCoordinates(startPosition);
            int x = startCoordinates[0];
            int y = startCoordinates[1];

            switch (instruction) {
                case 'L':
                    direction = RoverMove.rotateLeft(direction);
                    // Set new position
                    startPosition = (x + " " + y + " " + direction);
                    break;
                case 'R':
                    direction = RoverMove.rotateRight(direction);
                    // Set new position
                    startPosition = (x + " " + y + " " + direction);
                    break;
                case 'M':

                    // Get end x y coordinates
                    int[] endCoordinates = RoverMove.moveForward(x, y, direction);

                    // Set new position
                    startPosition = ProgramController.setNewPosition(endCoordinates, direction);
                    break;
                default:
                    throw new RuntimeException("Program Error!");
            }
        }
        return startPosition;
    }
}