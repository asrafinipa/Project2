package GroupProject2;

public abstract class Marks {
    /*12. We have to calculate the average of marks obtained in three subjects by
    student A and by student B. Create class 'Marks' with an abstract method
    'getPercentage' that will return the average percentage of marks. Provide
    implementation of abstract methods in classes 'A' and 'B'. The constructor of
    student A takes the marks in three subjects as its parameters and the marks
    in four subjects as its parameters for student B. Test your code*/

    double averageMark;
     int subject1;
     int subject2;
     int subject3;
     public Marks(int subject1, int subject2, int subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
     abstract double getPercentage();
}
class A extends Marks{

    A(int subject1, int subject2, int subject3) {
        super(subject1, subject2, subject3);
    }



    @Override
    double getPercentage() {

        return (subject1+subject2+subject3)/3;
    }
}
class  B extends Marks{
    int subject4;
    B(int subject1, int subject2, int subject3,int subject4) {
        super(subject1, subject2, subject3);
        this.subject4=subject4;
    }


    double getPercentage() {
        return (this.subject1+this.subject2+this.subject3+this.subject4)/4;
    }

    public static void main(String[] args) {
        A student = new A(28, 78, 69);
        B student2 = new B(86, 87, 100, 66);

        System.out.println("A Average: " + student.getPercentage());

        System.out.println("B Average: " + student2.getPercentage());
    }
}

