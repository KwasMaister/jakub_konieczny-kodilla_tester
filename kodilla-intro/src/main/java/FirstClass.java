public class FirstClass {
    public static void main (String[] args){
        Notebook notebook = new Notebook(999, 599, 2022); // tworzymy obiekt
        System.out.println("Weight: " + notebook.weight + " " + "Price: " + notebook.price + " Year of production: " + notebook.year);
        notebook.checkPrice();  // wywolujemy metody
        notebook.checkWeight();  // wywolujemy metody
        notebook.yearOfProductionAndPrice();  // wywolujemy metody
        System.out.println();

        Notebook heavyNotebook = new Notebook(3000, 601, 2014); //tworzymy obiekt
        System.out.println("Weight: " + heavyNotebook.weight + " " + "Price: " + heavyNotebook.price + " Year of production: " + heavyNotebook.year);
        heavyNotebook.checkPrice();  // wywolujemy metody
        heavyNotebook.checkWeight();  // wywolujemy metody
        heavyNotebook.yearOfProductionAndPrice();  // wywolujemy metody
        System.out.println();

        Notebook oldnotebook = new Notebook(1000, 500, 2005);  // tworzymy boeikt
        System.out.println("Weight: " + oldnotebook.weight + " " + "Price: " + oldnotebook.price + " Year of production: " + oldnotebook.year);
        oldnotebook.checkPrice();  // wywolujemy metody
        oldnotebook.checkWeight();  // wywolujemy metody
        oldnotebook.yearOfProductionAndPrice();  // wywolujemy metody
        System.out.println();
    }
}
