package entities;

public class Student {

    public String Name;
    public Double Grade1;
    public Double Grade2;
    public Double Grade3;

    public double FinalGrade() {
        return Grade1 + Grade2 + Grade3;
    }

    public void ValidationcompletedClass(double FinalGrade) {

        double rest;
        System.out.println("FINAL GRADE = " + FinalGrade);

        if (FinalGrade >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            rest = Math.abs(FinalGrade - 60.00);
            System.out.printf("MISSING %.2f POINTS", rest);
        }
    }


}
