public class GradesExcercise {
    public static void main (String [] args){
        Grades grades = new Grades();
        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        grades.add(7);
        grades.add(8);
        grades.add(9);
        grades.add(12);
        grades.add(50);
        grades.add(80);

        System.out.println("Last Grades: " + grades.lastGrade());
        System.out.println("Average Grades: " + grades.averageGrades());

    }
}
