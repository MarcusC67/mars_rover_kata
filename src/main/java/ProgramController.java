import java.util.Scanner;

public class ProgramController {

    //public static void main(String[] args) {
    public static void input() {

        Scanner scan = new Scanner(System.in);

        // Accept input for plateau dimensions x and y
        // *******************************************
        System.out.println("Enter plateau dimensions x and y: ");
        String dimensions = scan.nextLine();
        // call buildPlateau method
        String plateau = buildPlateau(dimensions);
        System.out.println("plateau = " + plateau);

    }
    public static String buildPlateau(String dimensions) {
        String[] parts = dimensions.split(" ");
        String x = parts[0];
        String y = parts[1];
        String str = x + y;
        return str;
    }

}
