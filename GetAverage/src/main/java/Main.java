public class Main {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int oddsCount = 0;
        int sum = 0;

        for(int number : numbers){
            if(number % 2 != 0){
                sum += number;
                oddsCount++;
            }
        }

        double average = (double) sum / oddsCount;

        System.out.println("Odd Numbers Average: " + average);
    }
}
