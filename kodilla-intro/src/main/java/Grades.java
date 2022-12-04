public class Grades {
    public int [] grades;   // zadeklarowanie tablicy grades
    public int size;  // musi tutaj byc public ? a nie moze byc po prostu int size ?

    public Grades(){  //konstruktor
        this.grades = new int [10];  // przypisanie ile nasza tablica ma przechowywac elementow
        this.size = 0;
    }

    public void add (int value){  // to jest metoda (na pewno) a czemu nie konstruktor . Konstruktor przewaznie // za bardzo tego value nie rozumiem. To jest ta wskazana jedna ocena tak ?
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;  // zapis tego (tablica grades ma miec this.size elementow) i to jest value?
        this.size++;
    }


    public void allGrades(){  // metoda
        for (int i = 0; i < this.size; i++){
            System.out.println("Podales nastepujace oceny: "+ this.grades[i]);
        }
    }
    public int lastGrade(){
        return this.grades[this.size -1];   //konstruktor
    }
    public double averageGrades(){ //konstruktor
        double sum = 0;   //dlaczego sum musze miec jako double ? nie powinno starczyc jako int ? Czy po prostu operacje matematyczne musza byc wykonywane na tych samych typach danych ?
        double average = 0;
        for (int i = 0; i < this.size; i++){
            sum = sum + this.grades[i];
        }
        average = sum / this.size;
        return average;
    }

}
