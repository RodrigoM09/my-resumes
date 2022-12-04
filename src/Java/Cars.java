package Java;


public class Cars extends Vehicles
{
    long a = 10;
    int b = (int) a;


    static void myFunction(Vehicles v)
    {
        if (v instanceof Cars)
        {
            Cars myCar = (Cars) v;

            System.out.println("Downcasting is performed");
        }
    }

    public static void main(String[] args)
    {
        Vehicles v = new Cars();

        Cars.myFunction(v);

    }

}