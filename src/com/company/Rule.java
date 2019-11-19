package com.company;
import java.util.LinkedList;

public class Rule {

    private final int divisor;
    private final String exclamation;

    public Rule(int div, String exc) {
        divisor = div;
        exclamation = exc;
    }

    public LinkedList<String> applyRule(int num, LinkedList<String> excList) {
        if (num % divisor == 0) {
            excList.add(exclamation);
        }
        return excList;
    }
}