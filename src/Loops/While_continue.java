package Loops;

public class While_continue {
    public static void main(String[] args) {
        int s=0;
        int fun=0;
        while (s<=10)
        {
            fun=fun+s;
            if (fun==3)
            {
                continue;
            }
            s++;
            System.out.println(fun);
        }
    }
}
