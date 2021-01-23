public class AfterLastFour {

    public int[] afterLastFour(int[]arr){
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
        System.arraycopy(arr, (result+1), resArr, 0, resArr.length);

        return resArr;
    }
}
