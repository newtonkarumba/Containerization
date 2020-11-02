package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
	// write your code here
     Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the bin capacity");
        int binCapacity = scanner.nextInt();
        //insert three items here
        List<Integer> items = Arrays.asList(50,45,65);
        //insert the bin capacity
       // int binCapacity = 5;
        CheckBin algorithm = new CheckBin(items, binCapacity);
        algorithm.solvingBinPackingProblem();
        algorithm.showResults();
        System.out.println("This is after committing");
    }
}
