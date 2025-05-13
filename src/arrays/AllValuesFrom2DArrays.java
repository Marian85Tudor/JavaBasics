package arrays;

public class AllValuesFrom2DArrays {
    public static void main(String[] args) {

        int [][] numbers = {
                {1,2,3},
                {10,20,30,40,50},
                {100,200}
        };
        System.out.println(numbers.length);// returns number of 1D arrays or number of rows
        System.out.println(numbers[0].length);// return number of elements 1d array
        System.out.println(numbers[1].length);// return number of elements 2d array

        for (int r=0;r<numbers.length;r++){
            for (int c=0;c<numbers[r].length;c++){
                System.out.print(numbers[r][c]+ " ");
            }
            System.out.println();
        }




    }
}
