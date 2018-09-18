package GUI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExamGrades {

    public static void main (String[] args)
    {
        int grade, count = 0, sum = 0, max, min;
        double average;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the first grade and give maax and min that initial value.");
        grade = scan.nextInt();

        max = min = grade;

        while(grade >= 0)
        {
            count++;
            sum += grade;

            if (grade > max)
                max = grade;
            else
                if (grade < min)
                    min = grade;

            System.out.print("Enter the next grade (-1 to quit): ");
            grade = scan.nextInt();
        }

        if (count == 0)
            System.out.println("No valid grades were enteered.");
        else
        {
            DecimalFormat fmt = new DecimalFormat("0.##");
            average = (double)sum /count;
            System.out.println();
            System.out.println("Total number of students: " + count);
            System.out.println("Average grade: " + fmt.format(average));
            System.out.println("Highest grade: " + max);
            System.out.println("Lowest grade" + min);
         }
    }
}
