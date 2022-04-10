

public class RoverController {

    String heading;
    String position;
    String name;

    public static String placeRover(String name, String plateau, String roverStartPosition) {

        System.out.println("In rover controller " + name + " " + plateau + " " + roverStartPosition);

        String[] part = roverStartPosition.split(" ");
        int x = Integer.parseInt(part[0]);
        int y = Integer.parseInt(part[1]);
        char direction = part[2].toCharArray()[0];

        System.out.println("Direction= " + direction);

        return Character.toString(direction);
    }

}
