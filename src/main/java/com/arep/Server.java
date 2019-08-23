package com.arep;


import com.arep.adapters.JsonAdapter;
import com.arep.calculators.Calculator;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import static spark.Spark.*;

public class Server {

    public static void main(String[] args) {
        port(getPort());

        post("/calculate", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            res.type("application/json");
            return JsonAdapter.adapt(Calculator.calculate(JsonAdapter.adapt(jsonObject)));
        });

        get("/operations", (req, res) -> "std.dev\nMean");
    }

    private static int getPort() {
        if (System.getenv("PORT") == null) {

            return 9074;
        }
        return Integer.parseInt(System.getenv("PORT"));
    }
}