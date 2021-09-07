public class switchStatement {
    public static void main(String[] args) {
        int age;
        age = 20;

        switch (age) {
            case 16:
                System.out.println("You can drive.");
                break;
            case 21:
                System.out.println("You can drink.");
                break;
            case 62:
                System.out.println("You can retire.");
                break;
            default:
                System.out.println("You are somewhere on the way.");
                break;
        }
    }
}
