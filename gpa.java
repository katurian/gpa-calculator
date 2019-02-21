import java.util.Scanner;

class gpa {
    public static double gpa() {
        System.out.println("");
        System.out.println("----Katski's Grade Point Average calculator-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("      Directions:");
        System.out.println("             Input a class's letter grade (A, A-, B+, B, B-, etc.) ");
        System.out.println("             Input the credit hours given for that class");
        System.out.println("             Once you've entered enough infomation, input -1 on the credit hour prompt to calculate your GPA");
        System.out.println("");

        int sum = 0, value, count = 1;
        double total;
        String grade;

        System.out.print(count);
        System.out.println("");
        Scanner letter = new Scanner(System.in);
        System.out.print("Enter the letter grade you recieved for class " + count + ": ");
        grade = letter.nextLine();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the credit hours given for said class: ");
        value = scan.nextInt();

        double gradeValue = 0;

        while(value != -1) {
            sum += value;
            switch (grade) {
                case "A" : gradeValue = gradeValue + (4.00 * value);
                    break;
                case "a" : gradeValue = gradeValue + (4.00 * value);
                    break;
                case "A-" : gradeValue = gradeValue + (3.67 * value);
                    break;
                case "a-" : gradeValue = gradeValue + (3.67 * value);
                    break;
                case "B+" : gradeValue = gradeValue + (3.33 * value);
                    break;
                case "b+" : gradeValue = gradeValue + (3.33 * value);
                    break;
                case "B" : gradeValue = gradeValue + (3.00 * value);
                    break;
                case "b" : gradeValue = gradeValue + (3.00 * value);
                    break;
                case "B-" : gradeValue = gradeValue + (2.67 * value);
                    break;
                case "b-" : gradeValue = gradeValue + (2.67 * value);
                    break;
                case "C+" : gradeValue = gradeValue + (2.33 * value);
                    break;
                case "c+" : gradeValue = gradeValue + (2.33 * value);
                    break;
                case "C" : gradeValue = gradeValue + (2.00 * value);
                    break;
                case "c" : gradeValue = gradeValue + (2.00 * value);
                    break;
                case "C-" : gradeValue = gradeValue + (1.67 * value);
                    break;
                case "c-" : gradeValue = gradeValue + (1.67 * value);
                    break;
                case "D+" : gradeValue = gradeValue + (1.33 * value);
                    break;
                case "d+" : gradeValue = gradeValue + (1.33 * value);
                    break;
                case "D" : gradeValue = gradeValue + (1.00 * value);
                    break;
                case "d" : gradeValue = gradeValue + (1.00 * value);
                    break;

            }
            count = count + 1;
            System.out.print(count);
            System.out.println("");

            System.out.print("Enter the letter grade you recieved for class " + count + ": ");
            grade = letter.nextLine();

            System.out.print("Enter the credit hours for said class: ");
            value = scan.nextInt();
        }
        total = (double)sum;
        return gradeValue/total;


    }

    public static void main(String[] args) {
        System.out.print(gpa());
    }
}
