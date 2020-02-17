package notme.example;

public class InheritanceCheck {

    private static String checking;

//    public static void main(String[] args) {
//        absolutelyNothingSpecial();
//    }

    public static void absolutelyNothingSpecial() {
        System.out.println("I told you, nothing special!!!");
    }

    public static String getChecking() {
        return checking;
    }

    public static void setChecking(String checking) {
        InheritanceCheck.checking = checking.concat("!!!");
    }

}
