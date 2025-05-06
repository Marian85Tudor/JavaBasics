package arrays;

public interface CopntinueKeyword {
    public static void main(String[] args) {

        int[] numers={9,66,100,8,10,78,5,101,99};
        for (int i=0;i<numers.length;i++){
            if (numers[i]%2==0){
                continue;
            }
            System.out.println(numers[i]);
        }


    }
}
