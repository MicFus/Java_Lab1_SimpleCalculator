package com.company;
import Enums.FigureType;
import Interfaces.Print;
import Models.Figure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMenu {
    private Scanner scanner = new Scanner(System.in);
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
    public void CreateFigure() throws Exception {
            System.out.println("\n1. Triangle \n2. Square\n3. Circle\n");
            int x = scanner.nextInt();
            if (x > 0 && x < 4) {
                figureType = FigureType.values()[x - 1];

                try {
                    if (figureType == FigureType.Triangle) {
                        System.out.print("a: ");
                        parameters[0] = Double.parseDouble(reader.readLine());
                        System.out.print("h: ");
                        parameters[1] = Double.parseDouble(reader.readLine());
                        return;
                    } else if (figureType == FigureType.Square) {
                        System.out.print("a: ");
                        parameters[0] = Double.parseDouble(reader.readLine());
                        return;
                    }
                    if (figureType == FigureType.Circle) {
                        System.out.print("r: ");
                        parameters[0] = Double.parseDouble(reader.readLine());
                        return;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                throw new Exception("Index out of Range");
            }
    }
    public void Display(Print figure) {
        figure.Print();
        return;
    }
}