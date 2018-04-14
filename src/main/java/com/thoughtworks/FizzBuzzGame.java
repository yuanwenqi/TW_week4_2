package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();




    public FizzBuzzGame(){

    }
    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(GetObject(i));
        }

    }

    public String GetObject(int index){
        String numberStr = Integer.toString(index);
        String s = "";
        if (numberStr.contains("3")){
            return "Fizz";
        }
        if (index%3 == 0 ){
            s += "Fizz";
        }
        if (index%5==0 ){
            s += "Buzz";
        }
        if (index%7==0 ){
            s += "Whizz";
        }
        if (s == ""){
            s += index;
        }
        return s;
    }

    public List<String> getResults() {
        return results;
    }
}


