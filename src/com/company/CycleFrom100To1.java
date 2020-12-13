package com.company;

public class CycleFrom100To1 {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--){
            if (i % 2 == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
