package conditionalstatements;

public class IfElseStatement {
    public static void main(String[] args) {

        int score = 80;

        if (score>90){
            System.out.println("You are doing a great job");
        }else{
            System.out.println("You are doing good, however there is room for improvement");
        }

        String password="Hello123";

        if (password.equals("Hello123")){
            System.out.println("Password is correct,you will be able to login");
        }else {
            System.out.println("Password is not correct,error message will be displayed");
        }

    }
}
