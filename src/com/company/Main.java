package com.company;

import com.company.colleges.College;
import com.company.jobs.Job;
import com.company.skills.Skill;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declare variables

        Scanner keyboard = new Scanner(System.in);


        ArrayList<College> Education = new ArrayList <College>();
        ArrayList<Job> Experience = new ArrayList <Job>();
        ArrayList<Skill>Expertise = new ArrayList <Skill>();


        int size = 20;
        int counter = 0;
        String answer = "";
        College college = new College();
        Job job = new Job();
        Skill skill;
        // Create a new person for resume
        Person person = new Person();




        do {
            System.out.println("Welcome to the RoboResume!");
            System.out.println("Please enter your name, email, education, work experiences and skills with the rating below");
            do {
                System.out.println("Enter your Name:");
                person.setName(keyboard.nextLine());
                System.out.println("Enter your Email:");
                person.setName(keyboard.nextLine());
                System.out.println("Education Achievements:");
                System.out.println("Do you want to add a school?");
                answer = keyboard.nextLine();
                if (!answer.equalsIgnoreCase("y")) {
                    System.out.println("Invalid option. Please enter 'Y' or 'N' ");
                } else if (answer.equalsIgnoreCase("y")) {
                    System.out.println("Enter the Degree of College");
                    college.degree = keyboard.nextLine();
                    System.out.println("Enter Major at College:");
                    college.major = keyboard.nextLine();
                    System.out.println("Enter Name of College:");
                    college.name = keyboard.nextLine();
                    System.out.println("Enter the year of Graduation");
                    college.year = keyboard.nextInt();
                    Education.add(college);

                    System.out.println("Here are the education achievements you entered:");

                    for (College colleges : Education) {
                        System.out.print(college.degree);
                        System.out.print(" " + "in" + " ");
                        System.out.println(college.major);
                        System.out.print(college.name);
                        System.out.println(" " + "," + college.year);
                    }
                    System.out.println("Do you want to add another school?");
                    answer = keyboard.nextLine();
                    if (!answer.equalsIgnoreCase("y"))
                    {

                        System.out.println("Do you want to add a work experience?");
                        answer = keyboard.nextLine();
                    }
                    if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                        System.out.println("Invalid option. Please enter 'Y' or 'N' ");
                    } else if (answer.equalsIgnoreCase("y")) {

                        System.out.println("Enter the title of job:");
                        job.title = keyboard.nextLine();
                        System.out.println("Enter the place of job:");
                        job.place = keyboard.nextLine();
                        System.out.println("Enter the date you worked at the job:");
                        job.date = keyboard.nextLine();
                        System.out.println("Enter the first duty of work");
                        job.duty1 = keyboard.nextLine();
                        System.out.println("Enter the second duty of work");
                        job.duty2 = keyboard.nextLine();
                        Experience.add(job);

                        System.out.println("Here are the work experiences you entered:");

                        for (Job jobs : Experience)
                        {
                            System.out.println(job.title);
                            System.out.println(job.place + " " + "," + " " + " " + job.date);
                            System.out.println(job.duty1);
                            System.out.println(job.duty2);
                        }

                    }


                }while (answer.equalsIgnoreCase("y")) ;

            }while (answer.equalsIgnoreCase("y"));

        }while (answer.equalsIgnoreCase("y"));
    }
}
