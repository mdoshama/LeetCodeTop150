public class MergeSortedArray {
    public static void main(String[] args) {
        int[] array1 = {1,3,6,7};
        int[] array2 = {2,4,5,8};
       int[] mergedArray = mergeSortedArray(array1, array2);
       for(int val: mergedArray) {
           System.out.print(val + " ");
       }
    }


    public static int[] mergeSortedArray(int[] array1,  int[] array2) {

        int lengthOfArray1 = array1.length;
        int lengthOfArray2 = array2.length;

        int i = 0;
        int j = 0;
        int[] mergedArray = new int[lengthOfArray1 + lengthOfArray2];



        int  k = 0;
        while (i < array1.length && j < array2.length) {
            if(array1[i] < array2[j]) {
                mergedArray [k] = array1[i];
                i++;
            }else {
                mergedArray [k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < array1.length) {
            mergedArray[k] = array1[i];
            i++;
        }

        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
        }

        return mergedArray;

    }
}
