public class FirstClass {
    public static void main (String[] args){
        Notebook notebook = new Notebook(999, 599, 2022);
        System.out.println("Weight: " + notebook.weight + " " + "Price: " + notebook.price + " Year of production: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.yearOfProductionAndPrice();
        System.out.println();

        Notebook heavyNotebook = new Notebook(3000, 601, 2014);
        System.out.println("Weight: " + heavyNotebook.weight + " " + "Price: " + heavyNotebook.price + " Year of production: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.yearOfProductionAndPrice();
        System.out.println();

        Notebook oldnotebook = new Notebook(1000, 500, 2005);
        System.out.println("Weight: " + oldnotebook.weight + " " + "Price: " + oldnotebook.price + " Year of production: " + oldnotebook.year);
        oldnotebook.checkPrice();
        oldnotebook.checkWeight();
        oldnotebook.yearOfProductionAndPrice();
        System.out.println();
    }
}
