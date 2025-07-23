public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,6,7};

        //smallest*************
        // int smallest=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(smallest>arr[i]) smallest=arr[i];
        // }
        // System.out.println("Smallest Element:"+smallest);

        //second Smallest******************

        int smallest=arr[0];
        int secSmallest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(smallest>arr[i]){
                secSmallest=smallest;
                smallest=arr[i];
            }
            else if(secSmallest>arr[i] || smallest==secSmallest)
            {
                if(smallest!=arr[i]){
                    secSmallest=arr[i];
                }
            }
        }
        System.out.println("Smallest:"+smallest);
        System.out.println("secSmallest:"+secSmallest);
    }
}
