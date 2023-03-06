package Mainmethod;

import Variables2.Nonstatics;
import Variables2.Statics;

public class Runners {
    public static void main(String[] args) {
        Nonstatics obj=new Nonstatics();
        String s=obj.name;
        System.out.println(s);
        String f= Statics.name;
import Variables2.Nonstatics2;
import Variables2.Statics2;

public class Runners {
    public static void main(String[] args) {
        Nonstatics2 obj=new Nonstatics2();
        int e=obj.age;
        System.out.println(e);
        int f= Statics2.age;
        System.out.println(f);
    }
}
