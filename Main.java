package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("In this Game,the player is in a land full of dragons." +
                "the dragons all live in caves with their large piles of collected treasure" +
                "other dragons are hungry and eat anyone who enters their cave." +
                "the player approaches two caves, one with a friendly dragon" +
                "and the other with a hungry dragon but doesn't know which dragon is in which cave. The player must choose" +
                "between the two");
        var in = new Scanner(System.in).next();
        if (in.equals("1")){
            System.out.println("you will die");
        }
        else if(in.equals("2")){
            System.out.println("you survived");
        }
        }
    }

