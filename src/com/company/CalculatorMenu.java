package com.company;
import Enums.FigureType;
import Interfaces.Print;
import Models.Figure;

import java.util.Scanner;

public class CalculatorMenu {
    private Scanner scanner = new Scanner(System.in);
    public FigureType figureType;
    public double[] parameters;
    public int choice;

    public CalculatorMenu(){
        figureType=FigureType.values()[0];
        parameters= new double[2];
    }

    public void mainMenu(){
        System. out.println("\n\n");
        System.out.println("        Simple calculator       ");
        System.out.println("\n1. Create figure\n2. Display\n0. Exit");
        choice=scanner.nextInt();
    }
    public void CreateFigure() throws Exception{
        if(choice==1) {
            System.out.println("\n1. Triangle \n2. Square\n3. Circle\n");
            int x = scanner.nextInt();
            if (x > 0 && x < 4) {
                figureType = FigureType.values()[x-1];

                if (figureType == FigureType.Triangle) {
                    System.out.print("a: ");
                    parameters[0] = scanner.nextDouble();
                    System.out.print("h: ");
                    parameters[1] = scanner.nextInt();
                    return;
                } else if (figureType == FigureType.Square) {
                    System.out.print("a: ");
                    parameters[0] = scanner.nextDouble();
                    return;
                }
                if (figureType == FigureType.Circle) {
                    System.out.print("r: ");
                    parameters[0] = scanner.nextDouble();
                    return;
                }
            }
        }
        else{
            throw new Exception();
        }
    }
    public void Display(Print figure) {
        figure.print();
        return;
    }
}
