
public class MoveRover {

    public static String processInstructions(String direction, char instruction) {

        if (instruction == 'L') {

            if (direction.equals("N")) {
                return "W";
            } else if (direction.equals("W")) {
                return "S";
            } else if (direction.equals("S")) {
                return "E";
            } else if (direction.equals("E")) {
                return "N";
            } else {
                return "";
            }
        } else if (instruction == 'R') {

            if (direction.equals("N")) {
                return "E";
            } else if (direction.equals("E")) {
                return "S";
            } else if (direction.equals("S")) {
                return "W";
            } else if (direction.equals("W")) {
                return "N";
            } else {
                return "";
            }
        } else {

            return "";
        }
    }
}