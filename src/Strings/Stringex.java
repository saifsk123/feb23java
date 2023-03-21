package Strings;

public class Stringex {
    public static void main(String[] args) {
       /* //declaration of a string
        String s1="Naveen";//string literal(constant pool)
        String s2=new String("naveen");// 2 objects one in string constant pool and another in heap pool(to make memory efficient)
        //why string is immutable
        String s3="Welcome";
        String s4="welcome";
        String s5="Welcome";
        because java uses the concept of string literal.suppose there are 5 reference variables,all refers to one object "Welcome".If one reference variable changes
        the value of the object,it will be affected to all reference variables.That is why string objects are immutable*/

        //String methods
        String s1="Naveen";
        //length to return the no of chars i a string
        int length=s1.length();
        System.out.println(length);
        //to retrieve char's from the string

    }
}
