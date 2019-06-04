public class Example03 {
    public static void main(String[] args) {
        int[] srcArray = {11, 12, 13, 14};
        int[] destArray = {21, 22, 23, 24};
        System.arraycopy(srcArray, 1, destArray, 2, 2);
        for (int i = 0; i < destArray.length; i++) {
            System.out.print(destArray[i] + " ");
        }
    }
}
