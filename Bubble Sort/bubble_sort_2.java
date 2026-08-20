public class bubble_sort_2 {
    public static void main(String[] args) {
        
    int [] arr={12,34,11,23,4,56,67,4};
    bubble_sort(arr);
    for(int number:arr){
        System.out.print(number+" ");
    }



    
}


public static int[] bubble_sort(int [] arr){

int n= arr.length;
for(int i=0;i<n-1;i++){
for(int j=0;j<n-1-i;j++){

    if(arr[j]>arr[j+1]){

        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
  }


  }  
  return arr;  
 }
 }