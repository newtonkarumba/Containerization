package com.company;

import java.util.Scanner;

public class Shape implements shape3D{
    private int length;
    private int width;
    private int height;
    public Scanner scanner;

    public Shape() {
        this.length = length;
        this.width = width;
        this.height = height;
        this.scanner = new Scanner(System.in);

    }

    public void containerPrompt(){
        System.out.println("Please enter the length");
        this.length = scanner.nextInt();
        System.out.println("Please enter the width");
        this.width = scanner.nextInt();
        System.out.println("Please enter the height");
        this.height = scanner.nextInt();
    }

    public void objectPrompt(){
        System.out.println("Please enter the length");
        this.length = scanner.nextInt();
        System.out.println("Please enter the width");
        this.width = scanner.nextInt();
        System.out.println("Please enter the height");
        this.height = scanner.nextInt();
     }

    @Override
    public int containerVolume() {
        return length*width*height;
    }

    @Override
    public int objectVolume() {
        return length*width*height;
    }
}
