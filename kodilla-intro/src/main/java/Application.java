public class Application {
    String name;
    double age;
    double height;
    public void users(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void usersCheck(){
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else  {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main (String[] args){
        Application adam = new Application();
        adam.users("Adam", 36, 180);
        adam.usersCheck();

        Application jakub = new Application();
        jakub.users("Jakub", 40, 150);
        jakub.usersCheck();

        Application zosia = new Application();
        zosia.users("Zosia", 10, 190);
        zosia.usersCheck();
    }
}
