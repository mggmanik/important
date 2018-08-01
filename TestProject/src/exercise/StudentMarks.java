package exercise;
import java.util.Scanner;

public class StudentMarks {

    private int numOfStudents;
    private int[] stuGrades;

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int[] getStuGrades() {
        return stuGrades;
    }

    public void setStuGrades(int[] stuGrades) {
        this.stuGrades = stuGrades;
    }

    public static void main(String[] args) {

        StudentMarks sm = new StudentMarks();

        int num;
        System.out.println("Enter the numbers of students: ");
        Scanner in = new Scanner(System.in);
        sm.setNumOfStudents(in.nextInt());
        num = sm.getNumOfStudents();
        int[] grades = new int[num];
        System.out.println("Enter grades for each of them: ");


        for(int i=0;i<grades.length;i++)
        {
            grades[i]=in.nextInt();
            if(grades[i]>0 && grades[i]<100)
            {
                System.out.println("Correct");
            }
            else
                System.out.println("Error! Enter between 0-100!");
        }

        sm.setStuGrades(grades);
        int[] gr = sm.getStuGrades();
        for(int i =0;i<gr.length;i++)
        {
            System.out.println(gr[i]);
        }

    }
}
