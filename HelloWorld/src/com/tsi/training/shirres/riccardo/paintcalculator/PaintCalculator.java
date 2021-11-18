package com.tsi.training.shirres.riccardo.paintcalculator;

//import java.util.Scanner;

import java.util.Scanner;

public class PaintCalculator {


    public static void main(String[] args)
    {
        /*
        Scanner reader = new Scanner(System.in);
        System.out.println("wall 1 surface area = ");
        double wall1Area = reader.nextDouble();
        */

        boolean answer = true;

        int wallNo = 1;

        while (answer)
        {
            Scanner reader = new Scanner(System.in);
            System.out.println("Do you want to add a wall? [true/false]");
            answer = reader.nextBoolean();

            if (answer == true)
            {
                Surface wall = new Surface()
            }

            wallNo++;

        }

        Surface wall1 = new Surface();
        double wall1Area = wall1.area;
        double paintPersqm = 2;
        double totalArea = wall1Area + wall2Area;
        double totalPaint = totalArea * paintPersqm;
        System.out.println("You will need " + totalPaint + " litres of paint");
    }
}
