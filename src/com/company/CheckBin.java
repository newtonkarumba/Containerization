package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckBin {
    private List<Bin> bins ;
    private List<Integer> items;
    private int binCapacity;
    private int binCounter = 1;



    public CheckBin(List<Integer> items, int binCapacity) {

        this.items = items;
        this.binCapacity = binCapacity;
        this.bins =  new ArrayList<Bin>(this.items.size());

    }

    public void solvingBinPackingProblem(){
        //sort the items using sort method in collections from biggest to smallest element
        Collections.sort(this.items, Collections.reverseOrder());
//check whether the item to put is greater than the bin.
        if (this.items.get(0)>this.binCapacity){
            System.out.println("The item cannot fit in the bin. No feasible solution...");
            return;
        }
//first bin
        this.bins.add(new Bin(binCapacity, binCounter));

        for (Integer currentItem : items){
            boolean isOk = false;// track whether we have put the item into a bin or not
            int currentBin = 0;

            while (!isOk){
                if (currentBin == this.bins.size()){ //check if the item doesnt fit in last bin so we create a new bin
                    Bin newBin = new Bin(binCapacity, ++binCounter); //new bin
                    newBin.put(currentItem); //put item
                    this.bins.add(newBin); //add item in list
                    isOk = true;
               }
                else if (this.bins.get(currentBin).put(currentItem)){
                    isOk = true; //if true we can put item in the bin

                }
                else {
                    currentBin++; // try the next bin if it cannot fit
                }
            }

        }
    }
    public void showResults(){
        //printing out contents in the bin
        for (Bin bin : this.bins){
            System.out.println(bin);
        }
    }
}
