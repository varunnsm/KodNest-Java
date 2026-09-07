// new String() comparison using ==

public class P02 {

    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        if (s1 == s2) {
            System.out.println("References are Equal");
        } else {
            System.out.println("References are Not Equal");
        }
    }
}
