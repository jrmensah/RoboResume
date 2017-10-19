package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String answer ="";

        // Create a new person for resume
        Person person = new Person();
        College college = new College();
        Job job = new Job();
        Skill skill = new Skill();
        Resume resume = new Resume();


        do
            {
                System.out.println("Welcome to the RoboResume!");
                System.out.println("Please enter your name, email, education, work experiences and skills with the rating below");
            do
                {
                    System.out.println("Name:");
                    person.setName(keyboard.nextLine());
                    System.out.println("Email:");
                    person.setName(keyboard.nextLine());
                    System.out.println("Education Achievements:");
                    person.setName(keyboard.nextLine());

                    do
                        {
                            System.out.println("Do you want to add another school?");
                        }while(answer.equalsIgnoreCase("y") && answer.equalsIgnoreCase("n"));
                        answer = keyboard.nextLine();
                    if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
                    {
                        System.out.println("Invalid option. Please enter 'Y' or 'N' (Ah!)");
                    }
        if(answer.equalsIgnoreCase("y")) {


            System.out.println("Enter Name of College:");
            college.name = keyboard.nextLine();
            System.out.println("Enter Major at College:");
            college.major = keyboard.nextLine();
            System.out.println("Enter the degree");
            college.degree = keyboard.nextLine();
            resume.add(college);
        }else{
            System.out.println(" Press any key to continue.");
            answer = keyboard.next();
        }
        {
            System.out.println(college.name);
            System.out.println(college.major);
            System.out.print(college.degree);
            System.out.println();
        }
    }while(answer.equalsIgnoreCase("y"));


    }while(answer.equalsIgnoreCase("y"));
}
}
