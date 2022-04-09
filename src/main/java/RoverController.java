//import javax.swing.text.Position;

public class RoverController {

    String heading;
    String position;
    String name;

    public static String placeRover(String name, String plateau, String roverStartPosition) {

        System.out.println("In rover controller " + name + " " + plateau + " " + roverStartPosition);

        String[] parts = roverStartPosition.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        char heading = parts[2].toCharArray()[0];

        System.out.println("heading= " + heading);

        return "true";
    }

}
