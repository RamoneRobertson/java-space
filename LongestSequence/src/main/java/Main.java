import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] arr = new Random().ints(10, 35, 45 + 1).toArray();
        int [] numbers = {100,4,200,1,3,2};
        int [] numbers2 = {};

        Sequence seq = new Sequence();
        System.out.println("Array Data: ");
        for(int num : arr){
            System.out.println(num);
        }
        System.out.println(seq.sortedLongestSequence(arr));
        System.out.println(seq.hashFindLongestSequence(arr));
    }
}
