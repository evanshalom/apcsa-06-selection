public class PassFail {
    public static void main(String[] args) {
        int score = 100;
        String msg = "";
        if (score >= 65){
            msg = "pass";
            System.out.println(msg);
        } else {
            msg = "fail";
            System.out.println(msg);
        }

        if(score == 100) {
            msg = "perfect";
            System.out.println(msg);
        }
        System.out.println("Done");
        
    }
}
