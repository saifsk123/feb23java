package Mainmethod;

import Variables.Nonstaticvariable;
import Variables.Staticvariable;

public class variable_runner {
    public static void main(String[] args) {
        Nonstaticvariable obj=new Nonstaticvariable();
        int s=obj.age;
        System.out.println(s);
        int v=Staticvariable.age1;
        System.out.println(v);
    }
}
