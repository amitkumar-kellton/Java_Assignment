class Main {
    public static void main(String[] args) {
        
        int first = 0;
        int second = 1;
        int i = 0;
        int maxNum = 10;
        int res = 0;
        
        while(i <= maxNum){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            i++;
        }
    }
}
