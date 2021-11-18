package com.tsi.training.shirres.riccardo.paintcalculator;

import java.util.Scanner;

public class Surface {

    public double area;

    public void setArea(double area)
    {
        this.area = area;
    }

    public Surface(String surfaceName)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("The surface area of wall =");
        area = reader.nextDouble();
    };

}
