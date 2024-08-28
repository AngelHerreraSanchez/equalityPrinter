public class Main {
    public static void main(String[] args) {
        System.out.println(printEqual(1, 1, 1));
        System.out.println(printEqual(1, 1, 2));
        System.out.println(printEqual(-1, -1, -1));
        System.out.println(printEqual(1, 2, 3));
    }


    public static boolean printEqual(int a, int b, int c){
        if(a <0 && c < 0 && c <0){
            System.out.println("Invalid");
        }else if (a == b && b == c){
            System.out.println("All numbers are equal");
        }else if (a != b && b != c){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Invalid");
        };
        return false;
    }
}
