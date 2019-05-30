package Example01;

public class Example01 {
    static String[] strs={"aaa","bbb","ccc"};
    public static void main(String[] args) {

        for (String str:strs){
            str="ddd";

        }
        System.out.println("foreach循环修改后的数组："+strs[0]+","+strs[1]+","+strs[2]);
        for (int i=0;i<=2;i++){
            strs[i]="ddd";
        }
        System.out.println("for循环修改后的数组："+strs[0]+","+strs[1]+","+strs[2]);
    }
}
