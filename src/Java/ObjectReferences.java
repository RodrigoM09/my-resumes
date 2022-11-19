package Java;

public class ObjectReferences
    {

        //passing object to method
        private double length;
        private double width;

        ObjectReferences(double len, double wid)
        {
            length = len;
            width = wid;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void set(double l , double w)
        {
            length = l;
            width = w;
        }

        public static void changeValues(ObjectReferences r)
        {
            r.set(25,45);

        }

        public static void main(String[] args)
        {
            ObjectReferences myObj = new ObjectReferences(10,20);

            System.out.println("Length : " + myObj.getLength());
            System.out.println("Width : " + myObj.getWidth());

            changeValues(myObj);

            System.out.println("___________________________________");
            System.out.println("Length : " + myObj.getLength());
            System.out.println("Width : " + myObj.getWidth());



        }
}
