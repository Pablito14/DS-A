public class ArrayReverse {

    public static int[] reverseArray(int[] arrayToReverse){
        int[] answer = new int[arrayToReverse.length];

        for(int i = arrayToReverse.length - 1; i > 0 ; i--){ // off by one?
            for(int k = 0; k < arrayToReverse.length; k++){
                answer[k] = arrayToReverse[i];
            }
        }
        return answer;
    }
}