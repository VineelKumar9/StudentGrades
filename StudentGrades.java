import java.util.ArrayList;
import java.util.Scanner;

public  class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        for(int i = 0;i<numStudents;i++){
            System.out.println("Enter the grade for student" + (i+1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        double average = computeAverage(grades);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);

        System.out.println("\nResults:");
        System.out.println("Average score:" + average);
        System.out.println("Highest score:" + highest);
        System.out.println("Lowest score:" + lowest);
    }

    public static double computeAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    public static int findHighest(ArrayList<Integer> grades){
        int highest = grades.get(0);
        for(int grade : grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public  static int findLowest(ArrayList<Integer> grades){
        int lowest = grades.get(0);
        for (int grade : grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return  lowest;
    }
}