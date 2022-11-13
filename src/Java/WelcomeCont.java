package Java;

public class WelcomeCont {
    private int age;

    WelcomeCont(int myAge)
    {
        age = myAge;
    }

    private void myFunction()
    {
        System.out.println("This is a static function");
    }


    public static void main(String[] args)
    {

        WelcomeCont myObj = new WelcomeCont(10);
        myObj.myFunction();
        System.out.println(myObj.age);
    }
}
