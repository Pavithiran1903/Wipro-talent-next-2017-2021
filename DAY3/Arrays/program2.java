public class program2{
 public static void main(String [ ] args) { 
       int arr[]={12,24,30,50,55};
       int min,max;
       max=min=arr[0];
       for(int  i=0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min="+min);
        System.out.println("Maximum="+max);
    }

}