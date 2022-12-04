public class SimpleArray {
    public static void main (String[] args)
    {
        String [] namesOfFriends = new String [5];
        namesOfFriends[0] = "Bartek";
        namesOfFriends[1] = "Lukasz";
        namesOfFriends[2] = "Marek";
        namesOfFriends[3] = "Wiktoria";
        namesOfFriends[4] = "Justyna";

        String firstName = namesOfFriends[3];
        System.out.println(firstName);

        int numberOfElements = namesOfFriends.length;
        System.out.println("W mojej tablicy jest przechowywanych "+numberOfElements+" elementów");
    }
}
