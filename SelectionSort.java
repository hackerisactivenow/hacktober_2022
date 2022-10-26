import java.util.Scanner;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Taking array length
        System.out.print("Enter number of elements in array: ");
        int noOfElements = sc.nextInt();
        //      initializing array
        System.out.println("Enter Array elements one by one ");
        int[] myArray = new int[noOfElements];
        for (int i=0; i<noOfElements; i++){
            myArray[i] = sc.nextInt();
        }

        for(int i=0; i<noOfElements-1; i++){
//      declaring temporary variable to hold index of minimum value
            int indexOfMinimum = i;
            for(int j=i+1; j<noOfElements; j++){
//      comparing value of current element with minimum value
                if(myArray[j] < myArray[indexOfMinimum]){
                    indexOfMinimum = j;
                }
            }
//      swapping the minimum with myArray[i]
            if(indexOfMinimum != i){
                myArray[i] = myArray[i] + myArray[indexOfMinimum];
                myArray[indexOfMinimum] = myArray[i] - myArray[indexOfMinimum];
                myArray[i] = myArray[i] - myArray[indexOfMinimum];
            }
        }
//        Displaying the sorted array
        System.out.print("Sorted array : ");
        for (int x=0; x<noOfElements; x++){
            System.out.print(myArray[x] + " ");
        }
    }
}
