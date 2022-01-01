package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rows = inputInt("How many rows are there");

        for (int i = 0; i < rows; i++) {
            getLine(rows, i);
        }
    }


    public static void getLine(int rows, int i)
    {
        String firstLine = "";
        String secondLine = "";
        for (int j = 0; j < rows; j++) {
            firstLine = firstLine + "X";


        }
        secondLine = replaceCross(firstLine, secondLine, i);
        print(secondLine);
    }

    public static String replaceCross(String firstLine, String secondLine, int pos)
    {
        String[] lineArray = firstLine.split("");
        lineArray[pos] = "+";
        for (int j = 0; j < lineArray.length; j++) {
            secondLine = secondLine + lineArray[j];
        }
        return secondLine;
    }
    public static void print(String m)
    {
        System.out.println(m);
    }


    public static int inputInt(String m)
    {
        int answer;
        Scanner scanner = new Scanner(System.in);
        print(m);
        answer = scanner.nextInt();

        return answer;
    }
}
