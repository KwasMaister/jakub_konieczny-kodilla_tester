import java.util.Scanner;

public class GradesExcercise {
    public static void main (String [] args){
        Grades grades = new Grades();   // tutaj tworzymy obiekt -> TypZmiennej nazwaZmiennej = new NazwaKlasy();
        System.out.println("Podaj 10 ocen");
        Scanner ocena = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            int grade = ocena.nextInt();
            grades.add(grade); // tutaj wywolujemy metode add i wysylamy wartosc grade
        }
        grades.allGrades();
        System.out.println("Last Grades: " + grades.lastGrade());
        System.out.println("Average Grades: " + grades.averageGrades());


    }
}
