enum colors {
        RED, GREEN, BLUE;
    }
public class ColorSelection {

    public static void fullNameOfColors(){
        String firstLetter = ColorDialogs.getFirstLetter();
        switch (firstLetter){
            case "r" :
                System.out.println("RED");
                break;
            case "g" :
                System.out.println("GREEN");
                break;
            case "b":
                System.out.println("BLUE");
                break;
        }
    }
}
