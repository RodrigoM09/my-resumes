package Java;

public class Welcome {
    //DECLARATION OF VARIABLES------------------------------>
    private int age;

    private String name;

    public Welcome(int newAge, String newName) {
        //INITIALIZATION OF VARIABLES----------------------------->
        age = newAge;
        name = newName;
    }

    public void myNewFunction() {
        System.out.println("This is my function..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge() {
        age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat Class{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                '}';
    }

/* public void display()
{
System.out.println("The name of the cat is : " + getName() + " and the age of the cat is : " + getAge());
}*/

    public static void main(String[] args) {
        Welcome myObj = new Welcome(10, "cat");

        myObj.setName("New Cat Name");
        System.out.println(myObj.getName());
        System.out.println(myObj.getAge());

        System.out.println(myObj.toString());


        Welcome myObj2 = new Welcome(50, "persian");

        System.out.println(myObj2.toString());

/* myObj.myNewFunction();

myObj.setName("Kitty");

System.out.println(myObj.getName());*/
    }
}
