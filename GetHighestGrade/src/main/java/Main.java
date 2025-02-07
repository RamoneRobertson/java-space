public class Main {
    public static void main(String [] args){
        int [] grades = {77, 80, 83, 75, 68, 91};

        int highestGrade = grades[0];
        int lowestGrade = grades[0];

        for(int grade : grades){
            if(grade > highestGrade){
                highestGrade = grade;
            }

            if(grade < lowestGrade){
                lowestGrade = grade;
            }
        }

        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
    }
}
