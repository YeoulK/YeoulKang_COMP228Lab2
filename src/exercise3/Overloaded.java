package exercise3;

public class Overloaded {

    //Method 1
    public static int method(int x, int y) {
        return x + y;
    }

    //Method 2
    public static int method(int x, int y, int z) {
        return x * y * z;
    }

    //Method 3
    public static double method(double x, double y){
        return x/y;

    }

    public static void main(String[] args){
        int result0 = method(2,1);
        int result1 = method(2,1,3);
        double result2 = method(12.5,0.5);


        System.out.println("Sum of 2 integers: "+result0);
        System.out.println("Multiply of 3 integers: "+result1);
        System.out.println("Divide of 2 doubles: " + result2);
    }

}
