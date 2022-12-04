public class User {

    String name;
    int age;
    public User (String name, int age){  // konstruktor
        this.name = name;
        this.age = age;
    }
    public static void main (String[] args){
        User jakub = new User("Jakub", 26);  //deklaracja obiektu (nazwa obiektu np. jakub)
        User lukasz = new User("Lukasz", 30);
        User wiktoria = new User("Wiktoria", 22);
        User igor = new User("Igor", 10);
        User czeslaw = new User("Czeslaw", 40);
        User magda = new User("Magda", 27);

        User [] users = {jakub, lukasz, wiktoria, igor, czeslaw, magda};
        // deklaracja tablicy o nazwie users
        // przypisanie obiektow do do tablicy (users).

        double average = 0;
        double sum = 0;
        for (int i = 0; i < users.length; i++){
            sum = sum + users[i].age;
        }
        average = sum / users.length;
        System.out.println("Srednia wieku wynosi: " + average);

        for (int i = 0; i < users.length; i++){
            if (users[i].age < average){
                System.out.println("Below average age: " + users[i].name);
            }
        }

    }

}
