import java.util.Arrays;

public class Main {


    private static int[] afterLastFour(int[]arr){
        int count = 0;
        int value = 4;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
            if (count == 0) {
                throw new RuntimeException("not valid array, should contain 4");
            }

            int index = 0;
            int result = 0;
            while (index < arr.length - 1) {
                index++;
                if (arr[index] == value) {
                    count--;
                }
                if (count == 0) {
                    result = index;
                    break;
                }
            }

            int[] resArr = new int[(arr.length - 1) - result];
            if (resArr.length == 0){
                throw new RuntimeException("There is no element after last index");
            }
            System.arraycopy(arr, (result+1), resArr, 0, resArr.length);

        return resArr;
    }



    public static boolean oneOrFour(int[]arr){
        boolean isContain = false;
        int index = 0;
        while (index < arr.length){
            if (arr[index] != 4 && arr[index] != 1){
                isContain = false;
                break;
            }
            index++;
            isContain = true;
        }


        return isContain;
    }


    public static void main(String[] args) {
        int[] ints = new int[]{1,1,1,1,1,1,4,1};
       // System.out.println(Arrays.toString(afterLastFour(ints)));
        System.out.println(oneOrFour(ints));
    }
}
