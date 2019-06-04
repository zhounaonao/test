import java.lang.reflect.Array;
import java.util.Arrays;

public class Example05 {
    public static void main(String[] args) {
        int arr1[]={7,8,3,2,12,6,5,4};
        int arr2[]=arr1.clone();
        System.out.println("arry2克隆的结果是:"+Arrays.toString(arr2));
        Arrays.sort(arr1);
        output(arr1);
        System.out.println(System.getProperties());

    }
    public static void output(int []a) {//遍历
        for(int i=0;i<a.length;i++) {
            System.out.printf(a[i]+" ");
        }
        System.out.println();
    }

}
