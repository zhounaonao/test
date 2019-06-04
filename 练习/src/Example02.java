public class Example02 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        show(s1, s2);
        System.out.println(s1 + s2);
    }

    public static void show(String s1, String s2) {
        s1 = s1 + "q";
        s2 = s2 + s1;
    }
}
