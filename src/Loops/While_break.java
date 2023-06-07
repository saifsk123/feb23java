package Loops;

public class While_break
{
    public static void main(String[] args) {
        int a=0;
        int sut=0;
        while (a<=10)
        {
            sut=sut+a;
            if (a==7)
            {
                break;
            }
            a++;
            System.out.println(sut);
        }
    }
}
