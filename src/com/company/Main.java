package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(contains(5, 9, 6, 7, 8, 5));


    }

    static boolean contains(int a, int... varargs) {
        boolean result=true;
        for (int i = 0; i < varargs.length; i++) {
            if (varargs[i] == a) {
                result = true;
                break;
            } else {
                result = false;
            }
        }
            return result;
        }
    }




