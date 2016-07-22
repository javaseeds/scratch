package funk.shane.interview;

/**
 * Created by Shane
 */
public class Overloaded {
    public static void main(String[] args) {
        JH(null);
    }

    public static void JH(String s){
        System.out.println("String");
    }

//    public static void JH(Integer i) {
//        System.out.println("Integer");
//    }

    public static void JH(Object o) {
        System.out.println("Object");
    }
}
