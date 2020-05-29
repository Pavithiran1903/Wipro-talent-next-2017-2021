public class program1{
 public static void main(String [ ] args) { 
        int arr[]={2,5,9,12,15,20};
        int sum=0;
        float avg;
        for(int  i=0;i<arr.length;i++)
        {
            sum +=arr[i];
        }
        avg = (float)sum/arr.length;
        System.out.println("Sum="+sum);
        System.out.println("Average="+avg);
    }

}