
// To calculate percentage of given student in CBSE board exam ( Input his 5 subject marks )


import java.util.Scanner;

public class Project_1 
{
    public static void main(String[] args) 
    {
        System.out.println("*** Welcome to the CBSE Percentage Calculator *** ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Enter Name of the Student : ");

        System.out.println("Enter Marks in Subject 1 ");
        double s1 = sc.nextDouble();

        System.out.println("Enter Marks in Subject 2 ");
        double s2 = sc.nextDouble();

        System.out.println("Enter Marks in Subject 3 ");
        double s3 = sc.nextDouble();

        System.out.println("Enter Marks in Subject 4 ");
        double s4 = sc.nextDouble();

        System.out.println("Enter Marks in Subject 5 ");
        double s5 = sc.nextDouble();

        double sum = s1 + s2 + s3 + s4 + s5;
        double per = (sum/5);

        System.out.println("\n \n \n ");
        System.out.println("*** Welcome to the CBSE Percentage Calculator *** ");
        System.out.print("Name of the Student : ");
        System.out.println(name);
        System.out.print("Sum of his Marks : ");
        System.out.println(sum);
        System.out.print("Percentage of Marks : ");
        System.out.println(per);
    }
}