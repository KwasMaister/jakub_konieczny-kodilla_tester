public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook (int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if (this.price < 600) {
            System.out.println("This price is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This price is expensive");
        }
    }

    public void checkWeight(){
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight >= 1000 && this.weight <= 2000){
            System.out.println("This notebook isn't very heavy");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void yearOfProductionAndPrice(){
        if (this.year >= 2000 && this.year < 2015){
            if (this.price < 600){
                System.out.println("This could be a weak notebook");
            } else if (this.price >= 600 && this.price <= 1000) {
                System.out.println("It could be a good buy");
            } else {
                System.out.println("It will be a good buy");
            }
        } else {
            System.out.println("Probably It will be a good buy !");
        }
    }
}

