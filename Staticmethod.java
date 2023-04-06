package com.Notes.Method;

import javax.sql.rowset.spi.SyncResolver;

public class Staticmethod {
    static int a=5;
    void change(){
    System.out.println(a);
   }  

}
class Test{
    public static void main(String[] args) {
        Staticmethod s1= new Staticmethod();
        s1.change();
        
    }
}
