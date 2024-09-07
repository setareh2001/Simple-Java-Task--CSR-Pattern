package main.java;

import java.util.*;
import java.lang.*;
import java.time.*;


public class practice {
    public static void main(String[] args) {

        //concatenation
        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);

        //Output
        System.out.println("we will not use 'Hello world'");

        //building String
        StringBuilder builder = new StringBuilder();
        builder.append("seti");
        String completeBuilder = builder.toString();
        System.out.println(completeBuilder);

        //Input
        Scanner in = new Scanner(System.in);
        System.out.print("what is your name?");
        String name = in.nextLine();
        System.out.print("How old are you?");
        int age = in.nextInt();
        System.out.println("my name is " + name + " and I'm " + age);

        //Date and Time
        System.out.printf("%tc%n", new Date());

        //constructor and making an object
        practice num = new practice();
        //LocalDate
        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
        System.out.println(newYearsEve);
        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        System.out.println(aThousandDaysLater);

        //Gregorian Calendar
        GregorianCalendar someDay = new GregorianCalendar(1999, Calendar.DECEMBER, 31);
        someDay.add(Calendar.DAY_OF_MONTH, 1000);
        System.out.println(someDay);


    }

    //getter and setter methods
    private int number;

    public int getNumber() {
        return number;
    }

    ;

    public void setNumber(int newNumber) {
        number = newNumber;
    }

    private int Age;

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    //static method
    private static int nextId = 1;

    public static int getNextId() {
        return nextId; // returns static field
    }

    int n = practice.getNextId(); // calls static method

    //inheritance
    public class Manager extends practice {
        private double bonus;

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }
    }
}


