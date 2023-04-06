package com.Notes.Method;

public class memmoryAllocation {
    public static int change(int a){
         int b=5;
          return a+b;
    }
  public static void main(String[] args) {
    int n=5;
    System.out.println(change(n));
  }
}

