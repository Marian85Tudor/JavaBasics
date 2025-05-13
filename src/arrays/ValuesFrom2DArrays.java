package arrays;

public class ValuesFrom2DArrays {
    public static void main(String[] args) {

        int [][] numbers = {
                {1,2,3}, //1 array
                {10,20,30,40,50}, // 2 array
                {100,200} // 3 array
        };
        for (int[] myNumbers:numbers){  //outer loop interates over each 10 arrays
            for (int num:myNumbers){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }
}
