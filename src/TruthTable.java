public class TruthTable {
    public static void main(String[] args) {
        int x = 5;
        system.out.println("x > 5: " + (x > 5)); //false
        system.out.println("x >= 5: " + (x >= 5)); //true
        system.out.println("x == 5: " + (x == 5)); //true        
        system.out.println("x != 5: " + (x != 5)); //false

        int y = 4;
        system.out.println("y > 5: " + (y > 5)); //false
        system.out.println("y >= 5: " + (y >= 5)); //true
        system.out.println("y == 5: " + (y == 5)); //true        
        system.out.println("y != 5: " + (y != 5)); //false

        int z = 6;
        system.out.println("z > 5: " + (z > 5)); //false
        system.out.println("z >= 5: " + (z >= 5)); //true
        system.out.println("z == 5: " + (z == 5)); //true        
        system.out.println("z != 5: " + (z != 5)); //false

        //Even number check
        boolean isEven = x % 2 == 0;
        boolean isPositive = x > 0;
        system.out.println("Is this number even " + isEven);
        system.out.println("Is this number possitive " + isPossitive);

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
