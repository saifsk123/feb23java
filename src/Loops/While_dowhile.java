package Loops;

public class While_dowhile {
    public static void main(String[] args) {
        int a=0;
        int sun=2;
        do {
            sun=sun+a;
            a++;
        }while (a<2);
        System.out.println(sun);
        a=0;
        sun=2;
        while (a<2)
        {
            sun=sun+a;
            a++;
            System.out.println(sun);
        }
    }
}
