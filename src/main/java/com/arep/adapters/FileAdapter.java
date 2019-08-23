package com.arep.adapters;

import com.arep.model.LinkedList;
import com.arep.model.Node;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileAdapter {

    public static LinkedList adapt(String path){

        LinkedList list = new LinkedList();
        BufferedReader br ;
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                list.add(new Node<>(Double.parseDouble(line)));
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
