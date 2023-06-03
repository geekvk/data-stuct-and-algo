package array;

public class Array {
    public Integer findMin(Integer[] arr){
        Integer minVal = arr[0];
        for (int i=1;i<arr.length-1;i++){
            if (arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
    private void swapNum(Integer[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void printArray(Integer[] arr){
        for (Integer i : arr){
            System.out.println(i);
        }
    }
    public void reverseArray(Integer[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
            swapNum(arr, start, end);
            start++;
            end--;
        }
    }
    public Integer[] removeEven(Integer[] arr){
        int oddCount = 0;
        for (int a : arr){
            if (a %2 != 0){
                oddCount++;
            }
        }
        Integer[] evenInteger = new Integer[oddCount];
        int index = 0;
        for (int i=0;i<arr.length;i++){
            if ( arr[i] %2 != 0){
                evenInteger[index] = arr[i];
                index++;
            }
        }
        return evenInteger;
    }
    public Integer findSecondMin(Integer[] arr){
        Integer min = Integer.MAX_VALUE;
        Integer secMin = Integer.MAX_VALUE;
        for (int a : arr){
            if (a < min){
                secMin = min;
                min = a;
            }
            else if (a > min && a != min){
                secMin = a;
            }

        }
        return secMin;
    }
    public Integer findSecondMax(Integer[] arr){
        Integer maxVal = Integer.MIN_VALUE;
        Integer secMaxVal = Integer.MIN_VALUE;

        for (int a : arr){
            if (a > maxVal){
                secMaxVal = maxVal;
                maxVal = a;
            }
            else if (a > secMaxVal && a != maxVal){
                secMaxVal = a;
            }
        }
        return secMaxVal;
    }
    public void moveZeros(Integer[] arr){
        Integer zeroCount = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == 0)
        }
    }
}
