package recursion;

public class SortedArray {
    public static boolean isSorted(int arr[],int index){
        if(index==arr.length-1){/*length -1  because we are comparing with the next element.agar nhi karte to
                                 last element se compare karega to index+1 wala element to hai hi nhi array me.*/

            return true;
        }
        if(arr[index]<arr[index+1]){
            return isSorted(arr,index+1);
        }
        return false; 
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,4};
        boolean res=isSorted(arr,0);
        if(res){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
    
}
