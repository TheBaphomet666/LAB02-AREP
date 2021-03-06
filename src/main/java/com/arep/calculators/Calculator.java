package com.arep.calculators;


import com.arep.model.LinkedList;
import com.arep.model.Node;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/**
 * Calculator for Mean and std:dev
 */
public class Calculator {

    /**
     * Calculates the Mean and the std.dev
     * @param list list of the numbers
     * @return mean and std.dev in a map
     */
    public static HashMap<String,Double> calculate(LinkedList list){

        HashMap<String,Double> map = new HashMap<String, Double>();
        map.put("Mean",mean(list));
        map.put("std.Dev",dev(list,map.get("Mean")));
        return map;
    }

    /**
     * Calculates the mean
     * @param list the list with values to calculate the mean
     * @return the mean
     */
    private static  Double mean(LinkedList list){
        Double val = 0.0;
        for(int i=0;i<list.getSize();i++){
            val+=(Double) list.get(i).getData();
        }
    return val/list.getSize();
    }

    /**
     * Calculates the std.dev
     * @param list the list with the values
     * @param mean the mean
     * @return the std.dev
     */
    private static  Double dev(LinkedList list, Double mean){
        Double sd = 0.0;
        for (int i = 0; i < list.getSize(); i++)
        {
            sd+=Math.pow(((Double) list.get(i).getData()-mean),2);
        }
        double val = sd/(list.getSize()-1);
        return Math.sqrt(val);
    }
}
