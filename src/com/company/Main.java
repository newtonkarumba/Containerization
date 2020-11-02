package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
	// write your code here
   Scanner scanner = new Scanner(System.in);
   List<Shape> shapes = new ArrayList<>();
        //System.out.println("Please enter the bin capacity");
        Shape container = new Shape();
        container.containerPrompt();
        container.containerVolume();
        int binCapacity = container.containerVolume();
        //insert three items here
        System.out.println("How many cubes do want to store: 1, 2 or 3 ");
        int choice = scanner.nextInt();
        while (choice-- >0){
            Shape object = new Shape();
            object.objectPrompt();
            shapes.add(object);

            /*
            object.objectVolume();
            int one = object.containerVolume();*/
        }

        /*switch (choice){
            case 1:
                Shape shape1 = new Shape();
                shape1.objectPrompt();
                shape1.objectVolume();
                int one = shape1.containerVolume();
                break;
            case 2:
                Shape shape2 = new Shape();
                shape2.objectPrompt();
                shape2.objectVolume();
                int two = shape2.containerVolume();

                Shape shape3 = new Shape();
                shape3.objectPrompt();
                shape3.objectVolume();
                int one = shape1.containerVolume();
                break;

            case 3:
                Shape shape1 = new Shape();
                shape1.objectPrompt();
                shape1.objectVolume();
                int one = shape1.containerVolume();
                break;
            default:
        }*/
        List<Integer> items=new ArrayList<>();

        for (Shape shape: shapes){
            items.add(shape.containerVolume());
            System.out.println(shape.containerVolume());
        }



        //List<Integer> items = Arrays.asList(shapes.get(0).containerVolume());
        //insert the bin capacity
       // int binCapacity = 5;
        CheckBin algorithm = new CheckBin(items, binCapacity);
        algorithm.solvingBinPackingProblem();
        algorithm.showResults();
       // System.out.println("This is after committing");


    }
}
