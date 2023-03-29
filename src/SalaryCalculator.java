
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args)
    {
        System.out.println("This is your salary calculator");
        Scanner scan = new Scanner(System.in);
        int[] hoursPerDay = new int[7];
        int totalSalary = 0;
        int remaining;
        int totalHours=0;
        for(int iterator = 0; iterator < 7; iterator++)
        {
            hoursPerDay[iterator] = scan.nextInt();
            totalHours+= hoursPerDay[iterator];
        }

        for(int iterator = 0; iterator < 7; iterator++)
        {


            if(iterator > 0 && iterator <= 5)
            {
                if(hoursPerDay[iterator] <= 8)
                    totalSalary+= hoursPerDay[iterator]*100;
                else
                {

                    remaining = hoursPerDay[iterator] - 8;
                    totalSalary += 800 + remaining * 115;

                }
            }
            else if(iterator == 6)
                totalSalary+= hoursPerDay[iterator]*125;
            else if(iterator == 0)
                totalSalary+= hoursPerDay[iterator]*150;
        }

        if(totalHours > 40)
        {
            remaining = totalHours-40;
            totalSalary+= remaining*125;
        }

        System.out.println("The total salary is "+totalSalary);

    }
}