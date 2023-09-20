package LMS;
import java.util.*;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int[] marks = new int[10];
        char[] grade = new char[10];

        for (int i = 0; i < 10; i++) {
        	
            System.out.println("Enter marks of the student " + (i + 1) );
            marks[i] = sc.nextInt();

            switch (marks[i] / 10) {
                case 10:
                case 9:
                    grade[i] = 'A';
                    break;
                case 8:
                    grade[i] = 'B';
                    break;
                case 7:
                    grade[i] = 'C';
                    break;
                case 6:
                    grade[i] = 'D';
                    break;
                case 5:
                    grade[i] = 'E';
                    break;
                default:
                    grade[i] = 'F';
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println( " Student's marks: " + marks[i] + " | Student's grade: " + grade[i]);
        }

     
        sc.close();
    }
}