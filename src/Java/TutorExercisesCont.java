package Java;

public class TutorExercisesCont {
    public static void main(String[] args)
    {
        // RAG ARRAYS: EACH ARRAY HAS A DIFFERENT NUMBER OF NUMBERS
        int[][] integers = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

//int[][] integers = getArray();

        printArray(integers);

    }


    public static int[][] getArray()
    {
        return new int[][]{{10,20,30},{40,50,60},{70,80,90}};
    }
// PRINTING EACH OF THE NUMBERS IN THE ARRAYS-------------------------------->
    public static void printArray(int[][] integers)
    {
        for (int i = 0; i < integers.length; i++)
        {
            for (int j = 0; j < integers[i].length; j++)
            {
                System.out.println(integers[i][j]);
            }
        }

// FINDING THE MAXIMUM OF EACH ROW IN THE ARRAYS--------------------------->
        int[][] numbers = {
                {1,10,5,25},
                {12,32,87,15},
                {30,18,1,10}
        };

        for (int i = 0; i < 3; i++)
        {
            int max = numbers[i][0];

            for (int j = 1; j < 4; j++)
            {
                max = (numbers[i][j] > max) ? numbers[i][j] : max;
            }

            System.out.println("Row : " + (i + 1) + " : " + max);
        }
        int[][] numbers2 = {
                {1,10,5,25},
                {12,32,87,15},
                {30,18,1,10}
        };

        for (int i = 0; i < 3; i++)
        {

            System.out.println("Row : " + (i + 1) + " : " + getMax(numbers2[i]));
        }



    }
// GET MAX FUNCTION----------------------------------------------------->
    private static int getMax(int[] number)
    {
        int max = number[0];

        for (int i = 0; i < number.length; i++)
        {
            max = (max < number[i] ? number[i] : max);

        }

        return max;

    }
}
