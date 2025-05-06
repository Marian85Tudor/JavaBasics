package conditionalstatements;

public class NestedIf {
    public static void main(String[] args) {

        boolean shipped = false;
        boolean delivered = false;

        if (shipped){
            System.out.println("Order has been shipped");

            if (delivered){
                System.out.println("Product has been deliverd");
            }else {
                System.out.println("Product is in transit");
            }

        }else{
            System.out.println("Order has not been shipped yet");
        }



    }
}
