public class Main {
    public static void main(String[] args) {
//        int age = 31;
//        int ticketPrice = 0;
//        if (age < 5){
//            ticketPrice = 0;
//        }
//        else if(age < 12){
//            ticketPrice = 5;
//        }
//        else if(age < 18){
//            ticketPrice = 10;
//        }
//        else {
//            ticketPrice = 15;
//        }
//
//        System.out.println("Ticket Details: \n\t" +
//                "Price: " + ticketPrice);
//        char grade = 'A';
//
//        switch(grade){
//            case 'A':
//                System.out.println("Nicely Done. This is peak. A for Astounding!");
//                break;
//            case 'B':
//                System.out.println("Great job! B for Brilliant!");
//                break;
//            case 'C':
//                System.out.println("It's not bad but you could do better. Hit the books.");
//                break;
//            case 'D':
//                System.out.println("D's get degrees");
//                break;
//            case 'F':
//                System.out.println("Uhhhh. Youre cooked");
//                break;
//            default:
//                System.out.println("Invalid grade. Oops");
//        }

//        int [] numbers = {1, 2, 3, 4, 5};
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

//        int n = 31;
//        int counter = 1;
//
//        while(counter < n){
//            if(counter % 2 == 0){
//                System.out.println(counter);
//            }
//            counter++;
//        }
        int n = 100;
        int i = 1;

        do {
            System.out.println(i);
            i++;
        }while(i <= n);

        int [] evenNums = {2,40,56};
        int sum = 0;
        for(int evenNum : evenNums ){
            sum += evenNum;
        }

        System.out.println(sum);
    }
}
