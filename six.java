/* 6) Create a student class
	-create 5 student objects and store it in 
	a proper datastructure
- find the average marks of the students */

import java.util.Scanner;

class Student{
    String name;
    int marks;

    public Student(String name, int marks){
        this.name= name;
        this.marks= marks;
    }
}

class StudentAverage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student[] students= new Student[5];
        int totalMarks = 0;

        for(int i=0; i<5; i++){
            System.out.print("Enter student " + (i+1)+ " name: ");
            String name = sc.next();
            System.out.print("Enter " + name + " 's marks: ");
            int marks = sc.nextInt();

            students[i] = new Student(name,marks);
            totalMarks = totalMarks+marks;
        }
        sc.close();

        double average = (double) totalMarks / students.length;
        System.out.println("Average marks of students: " + average);
    }
}