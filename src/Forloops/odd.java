package Forloops;

public class odd {
    public static void main(String[] args) {
        for (int t=1;t<=5;t++){
            for (int r=1;r<=(2*t-1);r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
