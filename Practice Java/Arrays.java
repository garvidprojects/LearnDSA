import java.util.*;

//LEARN ARRAYS : Arrays is a data structure which stores data in linear fashion.
/*
In Java, following are two different ways to create an array.

    Array: Simple fixed sized arrays that we create in Java, like below
      int arr[] = new int[10]   
    ArrayList : Dynamic sized arrays in Java that implement List interface.
      ArrayList<Type> arrL = new ArrayList<Type>();
      Here Type is the type of elements in ArrayList to
      be created
    An array is basic functionality provided by Java. ArrayList is part of collection framework in Java.
    Therefore array members are accessed using [], while ArrayList has a set of methods to access 
    elements and modify them.
*/

public class Arrays {
    public static void main(String[] args){
        int[] arr =  new int[4];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        System.out.println(arr[0]);
        System.out.println(arrList.get(0)); //Lookup is O(1) 
        arrList.add(6); //Pushing is also O(1);
        System.out.println(arrList);
        arrList.remove(3);
        System.out.println(arrList);
    }
}
/* Important Performance  in ARRAYLIST
Insert at last index : O(1)
Insert at given index : O(N)
Search by value : O(N)
Get by Index : O(1)
Remove by value  : O(N)
Remove by index : O(N)

add() – takes O(1) time
add(index, element) – in average runs in O(n) time
get() – is always a constant time O(1) operation
remove() – runs in linear O(n) time. We have to iterate the entire array to find the element qualifying for removal
indexOf() – also runs in linear time. It iterates through the internal array and checking each element one by one. So the time complexity for this operation always requires O(n) time
contains() – implementation is based on indexOf(). So it will also run in O(n) time
*/