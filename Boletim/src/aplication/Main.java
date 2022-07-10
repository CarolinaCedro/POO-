package aplication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student;

        student = new Student();

        System.out.println("Name student");
        student.Name = sc.nextLine();
        System.out.println("enter grade 1, grade 2 and grade 3: ");
        student.Grade1 = sc.nextDouble();
        student.Grade2 = sc.nextDouble();
        student.Grade3 = sc.nextDouble();

        student.ValidationcompletedClass(student.FinalGrade());

    }
}
