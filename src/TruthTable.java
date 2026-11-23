public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x > 5: " + (x > 5));
        System.out.println("x >= 5: " + (x >= 5));
        System.out.println("x == 5: " + (x == 5));
        System.out.println("x != 5: " + (x != 5));

        int y = 4;
        System.out.println("y > 5: " + (y > 5));
        System.out.println("y >= 5: " + (y >= 5)); 
        System.out.println("y == 5: " + (y == 5));   
        System.out.println("y != 5: " + (y != 5));

        int z = 6;
        System.out.println("z > 5: " + (z > 5));
        System.out.println("z >= 5: " + (z >= 5));
        System.out.println("z == 5: " + (z == 5)); 
        System.out.println("z != 5: " + (z != 5));

        //Even number check
        boolean isEven = x % 2 == 0;
        boolean isPositive = x > 0;
        System.out.println("Is this number even " + isEven);
        System.out.println("Is this number possitive " + isPositive);

        // doubles 
        double gpa = 3.5;
        System.out.println(gpa >= 3.5);

        System.out.println(0.1 + 0.2 == 0.3);

        //here is the fix

        double sum = 0.1 + 0.2;
        double gap = sum - 0.3;
        boolean close = gap < 0.000001;
        System.out.println(close);



    


    }
}
