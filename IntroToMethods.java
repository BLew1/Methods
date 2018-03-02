import java.util.Scanner;

public class IntroToMethods {
    public static void main(String[] args) {

        // Get marks from user
        int[] marks = getMarks();


        // print marks
        printMarks(marks);

        // modify marks
        marks = modifyMarks(marks);


        // print marks
        printMarks(marks);

    }
    static int[] getMarks(){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }
        return marks;

    }

    static void printMarks(int[] marks){
        System.out.println("\nPrinting marks");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
    }

    static int[] modifyMarks(int[] marks){
        System.out.println("\nModifying marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 5;
        }
        return marks;
    }


}
