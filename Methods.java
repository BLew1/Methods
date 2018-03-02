import java.util.ArrayList;
import java.util.List;
public class Methods {
    public static void main(String[] args){
        printStuff();

        int a = 4;
        int b = 17;
        int sum = getSum(a, b);

        double c = 7.0;
        double d = 9.5;
        double average = getAverage(c, d);

        String firstName = "Brandon";
        String lastName = "Lew";
        String fullName = getFullName(firstName, lastName);

        String gradYear = "2018";
        String studentNum = "1023145";
        List information = getInformation(firstName, lastName, gradYear, studentNum);

        int e = 20;
        String result = aboveEighteen(e);

        System.out.println(sum);
        System.out.println(average);
        System.out.println(fullName);
        System.out.println(information);
        System.out.println(result);
    }

    static String aboveEighteen(int e) {
        if (e > 18){
            return "Over 18";
        } else{
            return "Under 18";
        }
    }

    static List getInformation(String firstName, String lastName, String gradYear, String studentNum) {
        List info = new ArrayList();
        info.add(firstName);
        info.add(lastName);
        info.add(gradYear);
        info.add(studentNum);

        return info;
    }

    static String getFullName(String firstName, String lastName) {
        return (lastName + ", " + firstName);
    }

    static double getAverage(double c, double d) {
        return (c+d) / 2.0;
    }

    static int getSum(int a, int b) {
        return (a+b);
    }

    private static void printStuff() {
        System.out.println("Whatever");
    }
}
