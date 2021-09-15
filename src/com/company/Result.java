package com.company;

public class Result {

    private static double total_cost;

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip_cost = (tip_percent/100.0) * meal_cost;
        double tax_cost = (tax_percent/100.0) * meal_cost;
        total_cost = (meal_cost + tip_cost + tax_cost);
        System.out.println(Math.round(total_cost));
    }

    public double getTotal(){
        return Math.round(total_cost);
    }


}
