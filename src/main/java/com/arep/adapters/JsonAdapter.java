package com.arep.adapters;

import com.arep.model.LinkedList;
import com.arep.model.Node;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.HashMap;

public class JsonAdapter {

    public static LinkedList adapt(JsonObject json){
        JsonArray list = json.get("values").getAsJsonArray();
        LinkedList<Double> linkedList = new LinkedList<>();

        for(int i=0; i< list.size();i++){

            linkedList.add(new Node(list.get(i).getAsDouble()));
        }
        return linkedList;
    }

    public static JsonObject adapt(HashMap<String,Double> map){

        Gson gson = new Gson();
        String json = gson.toJson(map);
        JsonParser parser = new JsonParser();
        JsonObject adapted = parser.parse(json).getAsJsonObject();
        return adapted;
    }
}
