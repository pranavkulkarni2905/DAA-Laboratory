// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //  binary search algorithm
        int size=8;
        int arr[]=new int[size];
        
       System.out.println("Enter the elements of array:");
       for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
       }
        
        System.out.println("Enter the key value to seach an element:");
        int key=sc.nextInt();
        
        int ele=binarySearch(arr,0,size-1,key);
        
        if(ele==-1){
            System.out.println("Not Found...");
        }else{
            System.out.println("Found...");
        }
        
        
        
    }
    
    public static int binarySearch(int arr[],int i,int j,int key){
        
       
        int mid=(i+j)/2;
        
        if(arr[mid]==key){
            return mid;
        }
        else{
            // for left side
            if(arr[mid]>key){
                binarySearch(arr,i,mid-1,key);
            }
            // for right side
            else{
                binarySearch(arr,mid+1,j,key);
            }
        }
        return -1;
        
    }
}

/* 12 34 56 78 96 89
   i              j
   
   key= 96
   mid=i+j/2 i.e 0+5/2=2
   
   mid=2
   arr[mid]==key
   56==96 ---> false
   
   else:
   arr[mid]>key
   56>96--> false
   
   then arr[mid]<key
   56<96
   
   call recursivley binary search algorithm
   i=mid+1

    we had mid=2 and i=0
    now i=2+1 i.e 3
    i=3
    
    12 34 56 78 96 89
             i      j
    mid=i+j/2
    mid=3+5/2
    mid =4
    
    if: 
    arr[mid]==key
    arr[4]==96
    96==96 ---> TRUE
    
    then return mid value
    that means give input key element is found in array...
*/
