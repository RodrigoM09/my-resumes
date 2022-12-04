package Java;

public class Lion extends Animal
{
    String name = "Elephant";

    Lion()
    {
        super();

        System.out.println("This is the child class constructor ");
    }

    public void display()
    {
        System.out.println("The name of the animal is : " + super.name);

    }

    public void eat(String a, int b)
    {
        //super.eat(1,2);
        System.out.println("Lion class , eat function is called..");
    }

    public static void main(String[] args)
    {
        Lion africanLion = new Lion();

        //access variable(fields) and the methods of the parent calss
        //africanLion.name = "AfricanLion";

        africanLion.display();

        africanLion.eat(1,2);

        africanLion.eat("LionEat", 5);


    }
}
