import java.util.Scanner;
 
// the base class
abstract class STUDENT { 
    String name, course;
    int studentID;
    Scanner BSE= new Scanner(System.in);

    void input(){
        System.out.println("Enter your full names:");
        name= BSE.nextLine();
        System.out.println("Enter your student ID:");
        studentID= BSE.nextInt();
        BSE.nextLine();   // reads the new line left behind in the buffer by the nextInt in line 12 
        System.out.println("Enter the name of course you are taking:");
        course= BSE.nextLine();
      
    }
    
    public abstract void DISPLAY();  //enables every class that extends STUDENT class to ccreate its own display method

}


//the subclass
public class COURSE extends STUDENT{
    String grade;
    int courseID, marks;

    void add(){
        input();  //inherits from the base class
        System.out.println("Enter the course ID:");
        courseID= BSE.nextInt();
        System.out.println("Enter the marks you scored on the course:");
        marks= BSE.nextInt();

    }       

    @Override  //overrides the display finction in the base class
    public void DISPLAY(){
        System.out.println("YOUR STUDENT DETAILS ARE AS FOLLOWS:");
        System.out.println("Your name is:" + name);
        System.out.println("Your student ID is:" + studentID);
        System.out.println("Your name of the course you are taking is:" + course);
        System.out.println("The course ID is:" + courseID);
        System.out.println("Your marks are:" + marks);

        if (marks>=70) {
            System.out.printf("Your grade is :%s\n",  grade = "A");
        }
        else if(marks>=60){
            System.out.printf("Your grade is:%s\n", grade= "B");
        }
        else if(marks>=50){
            System.out.printf("Your grade is:%s\n", grade= "C");
        }
        else{
        System.out.printf("Your grade is:%s\n", grade= "YOU HAVE FAILED!!!!!");
        }

    }

    public static void main(String[] args) {
        COURSE student1= new COURSE();  //instantiate a new object
        student1.add();
        student1.DISPLAY();
        
    }

}

