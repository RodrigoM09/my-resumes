package Java;

import java.util.ArrayList;

public class ArrListExample
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("paul");
        names.add("vicky");
        names.add("jack");
        names.add("michael");


        for (String i : names)
        {
            System.out.println(i);
        }

//names.add(25);

// System.out.println(names.get(2));

/* names.remove(0);
System.out.println(names.set(2,"David"));*/

/*for (int i = 0; i < names.size(); i++)
{
System.out.println(names.get(i));
}*/


//System.out.println(names);

    }
}