/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: Client code for searching and sorting classes
 * Program Name:  SandSClient
 *
 * Description: driver code used to implement various sorting and searching objects
 *
 * Input: an array, unsorted, varying types and sizes
 *
 * Output: unsorted and sorted lists
 ***********************************************************************/
 
 // import java libraries here as needed
 
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class CS40Assignmentt2 {  // begin class
    
    public static void main(String[] args) {  // begin main
    
    // ********* declaration of constants **********
        
        final int MAX = 1000;        // max size of test array
    
    // ********** declaration of variables **********

        String strin;				// string data input from keyboard
        String strout;				// processed info string to be output
        String bannerOut;			// string to print banner to message dialogs

        String prompt;				// prompt for use in input dialogs

        String delim = "[ :]+";		// delimiter string for splitting input string
        String tabSpace = "      ";	// six spaces
        
        int[] list = new int[MAX];          // TEST ARRAY
        int actualLength = 0;
        
        int key = 0;                // search key
        int searchIndex = 0;        // index of key if found in list

        int[] Array = {5,4,1,2,3}; 
    // **************** create objects **********************

        //ProgramInfo programInfo = new ProgramInfo();
        ArrayList<Integer>  arrayFunctions = new ArrayList<>(MAX);
        //Random rnd = new Random();
    	
    // ********** Print output Banner **********
    
        //System.out.println(programInfo.getBanner("A2 Search and Sort"));
    	
    // ************************ get input **********************

    // ************************ processing ***************************
  
        // *** un comment these line to implement your own sorter and searcher
        // classes ***

        // create a sorter class
        //Sorter s = new Sorter();

        // load, print, sort and print the list 
        //actualLength = arrayFunctions.loadList(list); 
        //arrayFunctions.printList(list, actualLength);
        // s.bubbleSort(list, actualLength);
        //arrayFunctions.printList(list, actualLength);
    //System.out.println((180/100)%10);
    //System.out.println(800/100);
    //System.out.println(8%10);
    //Selectionsort(Array);
    Quicksort(Array);
    System.out.println("Array[0]= "+Array[0]);
    System.out.println("Array[1]= "+Array[1]);
    System.out.println("Array[2]= "+Array[2]);   
    System.out.println("Array[3]= "+Array[3]);
    System.out.println("Array[4]= "+Array[4]);
	// **** quick sort ***
	
        // re-load the list so it is once again unsorted
        // print, sort and print again
        //actualLength = arrayFunctions.loadList(list);
        //arrayFunctions.printList(list, actualLength);
        //s.quickSort(list, 0, list.length - 1);
        //arrayFunctions.printList(list, actualLength);

	// **** selection sort ****
	        
        // re-load the list so it is once again unsorted
        // print, sort and print again
        //actualLength = arrayFunctions.loadList(list);
        //arrayFunctions.printList(list, actualLength);
        //s.selectionSort(list, actualLength);
        //arrayFunctions.printList(list, actualLength);
        
        // ************** searchin **********************
        
        /* now for some searching. we'll generate a new list,
        *  search for a key value using the linear search on an unordered list
        *  sort the list using qSort, search for the same key using
        *  an enhanced linear search, then search for the same key using 
        *  a binary search.
        */
        
        // create the searcher object
        //Searcher searcher = new Searcher();
        
        //actualLength = arrayFunctions.loadList(list);
        //key = rnd.nextInt(10000);
        //key++;
        //searchIndex = searcher.linearSearch(list, actualLength, key);
        //s.quickSort(list, 0, list.length - 1);
        // searchIndex = searcher.linearSearch(list, actualLength, key);
        // searchIndex = searcher.binarySearch(list, actualLength, key);
       

    // ************************ print output ****************************
    
    
        // ******** closing message *********
        
        //System.out.println(programInfo.getClosingMessage());
    }  // end main
   
    
   public static void Bublesort(int Array []){
       
       int length = Array.length; 
        for (int Start = 0; Start < length-1; Start++)  // if lngth = 4, compare = 3, Start = 0
            for (int After = Start; After < Array.length; After++) // After = 4-1 = 3 , 2,1,0
                if (Array[Start] > Array[After])  // if Start is bigger than After
                { 
                    int Changer = Array[After];  // Changer has After
                    Array[After] = Array[Start];  // After is given the value of Start
                    Array[Start] = Changer;  // Start is given the value of After
                } 
    
   }
   public static void Selectionsort(int Array []){
       
       int ArrayLengthMinusOne = Array.length-1;
       int HolderSmaller = 0;
       for(int Smaller = 0; Smaller < Array.length; Smaller++){ // biggest
           int Holder = Array[Smaller]; //The holder will hold Array[Smaller] until it is updated in the for loop
           //System.out.println("HolderBeforeUpdate ="+Holder);
           //int Big = 0;
           for(int Bigger = Smaller+1; Bigger < Array.length; Bigger++){ // Will always be +1 bigger than the Front for loop
           //Big++; // to keep track of how many loops
           //System.out.println("Number of Loop ="+Big);
           if(Array[Bigger] < Holder){ // if the holder is bigger then the next value in the array then the if loop will activate 
           Holder = Array[Bigger]; // The holder holds the smaller value
           //System.out.println("Holder ="+Holder);
           } // The holder will update to hold the smaller value each time the for loop begins
           
           // this is when changes to the array occur
           if(Bigger == ArrayLengthMinusOne && Array[Smaller] != Holder){ // The first half of the 'if loop' will update the array, the second will deal with satuations when an array doesnt need to update
           HolderSmaller = Array[Smaller]; // Holds the value of Array[Smaller] before update
           //System.out.println("HolderSmaller ="+HolderSmaller);
           Array[Smaller] = Holder; // the current Smaller will have the value of holder
           //System.out.println("Array[Smaller] ="+Array[Smaller]);
           Array[Bigger] = HolderSmaller; // since we have changed one value in the array when we changed the Array[Smaller], 
                                          // we would need to change another to make sure there is no duplicates
           //System.out.println("Array[Bigger] ="+Array[Bigger]);
           }
        }
           
       }
      
   }
   public static void Quicksort(int Array []){
      int Length = Array.length;
      int Pivot = Array.length/2;
      int High = Length-1;
      int Low = 0;
      int Holder = 0;
      //System.out.println("Array[low]: "+Array[Low]);
      //System.out.println("Array[Pivot]: "+Array[Pivot]);
      //System.out.println("Array[High]"+Array[High]);
      for(int i = 0; i < Array.length; i++){ // as i increases  
           if(Array[Low] >= Array[Pivot] && Array[High]<= Array[Pivot]){// if Conditions are right for changing
                 
                 Holder = Array[Low]; // Gives the Value of Array[Low] to holder
                 Array[Low] = Array[High]; // Gives the value of Array[High] to Array[Low]
                 Array[High] = Holder; // Gives the value of Holder to Array[High], because Array[Low] has changed
                 System.out.println("Array[low]"+Array[Low]); // Verification
                 System.out.println("Array[Pivot]"+Array[Pivot]); // Verification
                 System.out.println("Array[High]"+Array[High]); // Verification
            }
           if(Array[Low] <= Array[Pivot] && Array[High]>= Array[Pivot]){ // If both dont meent condition
           Low++;
           High--;
           }
           else{
             if(Array[Low] >= Array[Pivot] ){ // if Array[low] is bigger than pivot Increment low
                 Low++;
             }
             if(Array[High]<= Array[Pivot]){ // if Array[High] is Lesser than pivot Decrement High
                 High--;
             }
           }
           
           
      }
   }
   
   
}  // end class
