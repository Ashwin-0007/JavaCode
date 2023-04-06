package com.Notes.Method;

public class InstaceMethod {
    private int roll;
    private String name="mohan";
    public int getrollno(){
        return roll;
    }
    public void setRoll(int rollno){
        this.roll=rollno;
    }
   
    public String getnam(){
        return name;
    }
    public void setnam(String name){
        this.name= name;
    }
    public void display(){
        System.out.println("Roll number is: "+roll);
        System.out.println("Name is: "+name);
    }
    public static void main(String[] args) {
        InstaceMethod obj = new InstaceMethod();
        obj.setRoll(14);
        obj.setnam("mohan");
        obj.display();
    }
}
