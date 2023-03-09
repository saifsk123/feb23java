package Loops;

public class Dowhile {
    public static void main(String[] args) {
        int a=0;
        int sum=0;
        do {
            sum=sum+a;
            a++;
        }while (a<10);
        System.out.println(sum);
    }
}
