public class OneOrFour {

    public boolean oneOreFour(int[] arr) {
        boolean four = false;
        boolean one = false;
        int index = 0;
        while (index <= (arr.length -1) && (arr[index] == 4 || arr[index] == 1)){
            if (arr[index] == 4) {
                four = true;
            }
            if (arr[index] == 1){
                one = true;
            }

            index++;
        }

        return four & one;
    }
}



