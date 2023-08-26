package org.example;


public class Main {
    public static void main(String[] args) {

        for (Month month : Month.values()){
            if(month.name().endsWith("Y")){
                System.out.println(month + " end with y");
            } else {
                System.out.println(month + " doesn't end with y");
            }
        }

        // altro metodo
        for (Month month : Month.values()){
            char lastLetter = month.name().charAt(month.name().length() - 1);
            if (lastLetter == 'Y'){
                System.out.println(month + " end with y");
            } else {
                System.out.println(month + " doesn't end with y");
            }
        }
    }
}