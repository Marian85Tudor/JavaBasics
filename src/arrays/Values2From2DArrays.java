package arrays;

public class Values2From2DArrays {
    public static void main(String[] args) {

        String[][] countries = {
                {"USA","Canada"},
                {"Peru","Brasil","Argentina"},
                {"France","Italy","Portugal","Belgium","Germany"},
                {"Japan","South Korea"}
        };
        for (String[] countryArray:countries){//outer loop interates over  each 1D array

            for (String country:countryArray){//inner loop interates over each element from 1D Array
                System.out.print(country+ " ");
            }
            System.out.println();
        }
    }
}
