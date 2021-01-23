public class OneOrFour {

    public boolean oneOreFour(int[]arr){
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
}
