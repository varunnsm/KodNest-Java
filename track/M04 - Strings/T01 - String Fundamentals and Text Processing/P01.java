// String Pooling (==)

public class P01 {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        if (s1 == s2) {
            System.out.println("Reference are Equal");
        } else {
            System.out.println("Reference are Not Equal");
        }
    }
}
