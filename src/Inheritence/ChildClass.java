package Inheritence;

public class ChildClass extends BaseClass
{

    public void ChildProperties(int a,int b)
    {
        int basesum=Baseproperties(a,b);
        int sum=basesum+a+b;
        System.out.println(sum);
    }
}
