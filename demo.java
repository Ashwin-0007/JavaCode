package com.Notes.Method;

abstract class myclass {
    // protected abstract void display();
}

public class demo extends myclass {
    protected void display() {
        System.out.println("Abstraction method is used!");
    }

    void sum() {
        int a = 5, b = 7, c;
        System.out.println("Sum of two number is:" + (c = a + b));
    }

    public static void main(String[] args) {
        demo my = new demo();
        my.display();
        my.sum();
    }
}
