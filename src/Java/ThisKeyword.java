package Java;

public class ThisKeyword {
        public String name;
        public int age;


        ThisKeyword(String newName , int newAge)
        {
            name = newName;
            age = newAge;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Welcome{" +
                    "name='" + this.getName() + '\'' +
                    ", age=" + this.getAge() +
                    '}';
        }


        public static void main(String[] args)
        {
            ThisKeyword myObj = new ThisKeyword("Paul", 25);

            System.out.println(myObj.toString());

        }
    }

