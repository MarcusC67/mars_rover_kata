public class RoverMove {

    private int x;
    private int y;

    public static String rotateLeft(String direction) {
        switch (direction) {
            case "N": return "W";
            case "W": return "S";
            case "S": return "E";
            case "E": return "N";
            default: throw new RuntimeException("Should not get here!");
        }
    }
    public static String rotateRight(String direction) {
        switch (direction) {
            case "N" : return "E";
            case "E" : return "S";
            case "S" : return "W";
            case "W" : return "N";
            default: throw new RuntimeException("Should not get here!");
        }
    }

    public static int[] moveForward(int x, int y, String direction) {

        int[] arrXandY = new int[2];
        arrXandY[0] = x;
        arrXandY[1] = y;

        switch (direction) {
            case "N":
                arrXandY[1] += 1;
                return arrXandY;
            case "E":
                arrXandY[0] += 1;
                return arrXandY;
            case "S":
                arrXandY[1] -= 1;
                return arrXandY;
            case "W":
                arrXandY[0] -= 1;
                return arrXandY;
            default: throw new RuntimeException("Should not get here!");

        }

    }

}