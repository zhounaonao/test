public class Example04 {
    public static void main(String[] args) {
        String a="aaabbcc";
        String s="abcdefg";
        String s1 = new String("itcast");
        String s2 = new String(new char[] {'i','t','c','a','s','t'});
        System.out.println(s1.split("it"));
        System.out.println(s1.split("c",3));

        StringBuffer s3=new StringBuffer();
        s3.append(1);
        s3.append(2345);
        s3.append(true);
        s3.append("ccdd");
        StringBuffer s4=new StringBuffer("aaacc");
        Integer in1 = new Integer(10);
        Integer in2 = new Integer(10);
        Integer in3 = 10;
        Integer in4 = 10;
        System.out.println(s3.toString());
        System.out.println("===============");
        System.out.println(s3);
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        System.out.println("===============");
        System.out.println(s1+s2);
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println("===============");
        System.out.println(a.indexOf("d"));
        System.out.println("===============");
        System.out.println(in1 == in2);
        System.out.println(in1 == in3);
        System.out.println(in3 == in4);
        System.out.println(s.substring(2, 5));
    }
}
