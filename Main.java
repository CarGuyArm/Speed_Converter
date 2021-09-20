package com.company;

public class Main{
    public static class SpeedConverter  {
        public long toMilesPerHour(double kilometersPerHour){
            if(kilometersPerHour > 0){
                return Math.round(kilometersPerHour / 1.609);
            }
            return -1;
        }
        public void printConversion(double kilometersPerHour){
            if(kilometersPerHour<0){
                System.out.println("Invalid Value");
            }
            else
                System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }

    public static void main(String [] args){
        SpeedConverter sp = new SpeedConverter();
        sp.toMilesPerHour(10.25);
        sp.printConversion(10.25);
    }


}

