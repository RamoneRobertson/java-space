public class Main {
    public static void main(String [] args){
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int index = -1;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                index = i;
            }
        }

        System.out.println(String.format("%s is located at index %s", target, index));
    }
}
