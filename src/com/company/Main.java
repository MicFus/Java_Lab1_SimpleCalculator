package com.company;
import Enums.FigureType;
import Interfaces.Print;
import Models.Circle;
import Models.Figure;
import Models.Square;
import Models.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculatorMenu menu = new CalculatorMenu();
        Figure figure = null;

        do{
            menu.mainMenu();
            if(menu.choice==1) {
                try {
                    menu.CreateFigure();
                    if (menu.figureType == FigureType.Triangle) {
                        figure = new Triangle(menu.parameters[0],menu.parameters[1]);
                    }
                    else if (menu.figureType == FigureType.Square) {
                        figure = new Square(menu.parameters[0]);
                    }
                    else if (menu.figureType == FigureType.Circle) {
                        figure = new Circle(menu.parameters[0]);
                    }
                }
                catch (Exception e){System.out.println("Index out of range");}
            }
            else if(menu.choice==2 && figure!=null) {
                menu.Display((Print)figure);
            }
        }while(menu.choice!=0);
    }
}
