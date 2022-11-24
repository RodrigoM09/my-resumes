package Java;

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

    }
}
