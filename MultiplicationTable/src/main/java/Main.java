public class Main {
    public static void main(String[] args) {
        for(int row = 1; row <= 10; row++){
            for(int col = 1; col <= 10; col++){
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }

        int [] nums = {12, 34, 56, 78, 90};
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        System.out.println(sum);
    }
}
