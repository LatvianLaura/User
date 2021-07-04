public class User {

    public static void main(String[] args) {
        // write your code here

        String nameOfUser;
        short ageOfUser;
        boolean isFemale;
        float heightOfUser;
        int salesPlanPerQuarter;
        double averagePlanPerMonth;
        char currencyOfSales;
        byte workoutPerYear;
        String userTask1, userTask2, userTask3;

        nameOfUser = "Laura";
        ageOfUser = 30;
        heightOfUser = 1.67F;
        isFemale = true;
        salesPlanPerQuarter = 2200000;
        averagePlanPerMonth = (double)salesPlanPerQuarter / 3;
        currencyOfSales = '$';
        workoutPerYear = 104;

        userTask1 = "Morning MS Teams call with colleagues";
        userTask2 = "Marketing offer discussion with manufacturer and client";
        userTask3 = "Product Ordering";

        System.out.println("************************************************************");
        System.out.println();
        System.out.print("User name: ");
        System.out.println(nameOfUser);
        System.out.print("User age: ");
        System.out.println(ageOfUser);
        System.out.print("User height (m) : ");
        System.out.println(heightOfUser);

        System.out.println("------------");
        System.out.println();
        System.out.println("User hobbies:");
        System.out.println(userTask1);
        System.out.println(userTask2);
        System.out.println(userTask3);

        System.out.println("------------");
        System.out.println();
        System.out.print("Sales plan per quarter for " + nameOfUser + ": ");
        System.out.println(salesPlanPerQuarter + " (" + currencyOfSales + ")");
        System.out.print("Average sales plan per month for " + nameOfUser + ": ");
        System.out.println(averagePlanPerMonth + " (" + currencyOfSales + ")");

        System.out.println("------------");

        System.out.print("Is " + nameOfUser + " a female? - ");
        System.out.println(isFemale);
        System.out.print("Workouts per year taken: ");
        System.out.println(workoutPerYear);
        System.out.println("\n");
        System.out.println("************************************************************");
    }
}
