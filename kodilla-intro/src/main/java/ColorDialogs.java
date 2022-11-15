import java.util.Scanner;

public class ColorDialogs {
    public static String getFirstLetter (){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("First letter of collor (lowercase): r or g or b");
            String color = scanner.nextLine().trim();
            if (color.length() == 1){
                return color;
            } else
                System.out.println("Enter the first letter of the color again");

        }
    }
}
