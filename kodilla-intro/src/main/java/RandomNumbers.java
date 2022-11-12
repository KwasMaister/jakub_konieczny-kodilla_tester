import java.util.Random;
public class RandomNumbers {
    Random random = new Random();
    public int min;
    public int max;
    int maximum;

    public void draw() {
        int sum = 0;
        int temporary = 0;
        this.min = 30;
        this.max = 0;
        this.maximum = 5000;
        while (sum < maximum) {
            temporary = random.nextInt(31);
            sum = sum + temporary;

            if (temporary > this.max) {
                this.max = temporary;
            }
            if (temporary < this.min) {
                this.min = temporary;
            }
        }
    }
    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }


    public static void main(String[] args) {
        RandomNumbers random = new RandomNumbers(); // zainicjowanie randomou - nazwa zmiennej "random"
        random.draw(); // wywolanie obiektu "draw"
        System.out.println("Min: " + random.getMin());
        System.out.println("Max: " + random.getMax());
    }
}
