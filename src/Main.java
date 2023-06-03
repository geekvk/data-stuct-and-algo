import array.Array;

public class Main {
    public static void main(String[] args) {

        System.out.println("DSA");
        Array myArray = new Array();
        Integer[] arr = { 1,14,3,4,5,6,7,8,9};
        Integer min = myArray.findMin(arr);
        System.out.println("Min value : " + min);
        myArray.reverseArray(arr);
        Integer[] even = myArray.removeEven(arr);
//        myArray.printArray(even);
        System.out.println(myArray.findSecondMin(arr));
        System.out.println("sec max : " + myArray.findSecondMax(arr));
    }
}