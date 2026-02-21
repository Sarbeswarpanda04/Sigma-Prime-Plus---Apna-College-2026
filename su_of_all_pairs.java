public class su_of_all_pairs {
    
    public static void sumpair(int arr[]){
       for(int i=0;i<arr.length;i++){
        int first = i;
        for(int j=i+1;j<arr.length;j++){
            int last = j;
            for(int k=first;k<=last;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        sumpair(arr);
    }
}
