package Java;

import java.math.BigInteger;
import java.util.ArrayList;

public class Wrapping
{
    public static void main(String[] args)
    {
            /* Object myObj;

            Float myVal;*/

            //boxing , wrapping the data
            int var1 = 15;

            double var2 = 45.45;

            boolean var3 = false;

            Integer obj1 = Integer.valueOf(var1);

            Double obj2 = Double.valueOf(var2);

            Boolean obj3 = Boolean.valueOf(var3);

            if(obj1 instanceof Integer)
            {
            System.out.println("An object of Integer is created");
            }
            if(obj2 instanceof Double)
            {
            System.out.println("An object of Double is created");
            }
            if(obj3 instanceof Boolean)
            {
            System.out.println("An object of Boolean is created");
            }



        Integer object1 = Integer.valueOf(35);

        Double object2 = Double.valueOf(45.47);

        Boolean object3 = Boolean.valueOf(true);


        //unboxing , unwrapping the data
        int variable1 = object1.intValue();
        double variable2 = object2.doubleValue();
        boolean variable3 = object3.booleanValue();

        //print primitive values
        System.out.println("The value of int variable : " + variable1);

        System.out.println("The value of double variable : " + variable2);

        System.out.println("The value of boolean variable : " + variable3);

        //Unboxing an ArrayList-------------------------------------------------->
        ArrayList<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(5);

        System.out.println("Array list : " + list);


        int a = list.get(0);//unboxing

        System.out.println("The value at index 0 is : " + a);



        //USING BIGINTEGER FOR VERY LARGE NUMBERS-------------------------------------->
        BigInteger myObj1 = new BigInteger("2562154620548654684641894765164646148784154625523015421478521548741");

        BigInteger myObj2 = new BigInteger("14516987548745527154271585250285252563215486258845148524521");
        //BigInteger myObj3 = null;

        BigInteger myObj3 = myObj1.add(myObj2);
        System.out.println(myObj3);

        BigInteger myObj4 = myObj1.multiply(myObj2);
        System.out.print(myObj4);
        myObj3 = myObj1.divide(myObj2);
        myObj3 = myObj1.subtract(myObj2);

        myObj3 = myObj1.gcd(myObj2);

        BigInteger myObj5 = myObj1.pow(10);

        System.out.println(myObj5);
    }
}
