class Main {
    public static void main(String[] args) {
        
        int arr[] = {34, 54, 23, 43, 67, 76};
        
        int i = 0;
        while(i <= arr.length - 1){
            int j = i + 1;
            while(j <= arr.length - 1){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i++;
        }
        int x = 0;
        while (x < arr.length) {
            System.out.print(arr[x] + " ");
            x++;
        }
    }
}
