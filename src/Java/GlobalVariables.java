package Java;

public class GlobalVariables {
    int i;//global

    static int j;


    public static void myFunction()
    {
/*i = 10;

System.out.println(i);*/
    }

    public void anotherFunction()
    {
        i = 150;
    }

    public static void main(String[] args)
    {


        for ( j = 0; j < 10; j++)
        {
            System.out.println(j);
        }

        for ( j = 10; j < 20; j++)
        {
            System.out.println(j);
        }

    }
}
