package com.arep;


import com.arep.adapters.FileAdapter;
import com.arep.adapters.JsonAdapter;
import com.arep.calculators.Calculator;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Unit test for simple App.
 */
public class CalculatorTest{
    @Test
    public void testCalculator1(){
        HashMap<String, Double> map =Calculator.calculate(FileAdapter.adapt("./src/test/resources/test1.txt"));
        Assert.assertEquals(550.6,map.get("Mean"),0.1);
        Assert.assertEquals(572.03,map.get("std.Dev"),0.1);
    }
    @Test
    public void testCalculator2(){
        HashMap<String, Double> map =Calculator.calculate(FileAdapter.adapt("./src/test/resources/test2.txt"));
        Assert.assertEquals(60.32,map.get("Mean"),0.1);
        Assert.assertEquals(62.26,map.get("std.Dev"),0.1);
    }

}
