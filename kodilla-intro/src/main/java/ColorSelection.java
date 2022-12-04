enum colors {
        RED, GREEN, BLUE;
    }
public class ColorSelection {

    public static void fullNameOfColors(){
        String firstLetter = ColorDialogs.getFirstLetter();
        switch (firstLetter){
            case "r" :
                System.out.println(colors.BLUE);
                break;
            case "g" :
                System.out.println(colors.GREEN);
                break;
            case "b":
                System.out.println(colors.RED.name());
                break;
        }
    }
}
