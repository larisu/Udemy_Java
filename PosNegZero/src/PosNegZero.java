public class PosNegZero {

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(-21);
        checkNumber(42);
    }
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("Pos");
        }
        else if (number < 0){
            System.out.println("Negative");
        }
        else System.out.println("Zero");
    }
}
