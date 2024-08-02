// c. Cricketer's Pension Continuing our journey in mastering the conditional statements & our
// interest with cricket.
// Let us help the Indian cricket's governing body (BCCI) to automate its plan of allotting pensions
// to former players.
// The rules are given below:
// If a player has played more than 10 test matches and 100 ODI's he receives Rs.50,000.
// If a player has played more than 10 test matches he receives Rs.25,000.
// If a player has played more than 100 ODI's he receives Rs.15,000.
// If a player has played for India he receives Rs.10,000.
// The amount is incremented by 1/4th for every 'man of the match' award.
// If a player has not played for India but played IPL he receives an amount of Rs.8,000.
// If a player has not played for India nor IPL he receives an amount of Rs.7,000.

import java.util.Scanner;

public class test1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Has he played for India? (y/n)");
        char playedForIndia = sc.next().charAt(0);

        System.out.println("Has he played IPL? (y/n)");
        char playedIPL = sc.next().charAt(0);

        float amount = 0.0f;

        if (playedForIndia == 'y') {
            System.out.println("Enter number of Test matches:");
            int testMatches = sc.nextInt();

            System.out.println("Enter number of ODIs:");
            int odiMatches = sc.nextInt();

            System.out.println("Enter the number of 'man of the match' awards:");
            int momAwards = sc.nextInt();

            if (testMatches > 10 && odiMatches > 100) {
                amount += 50000;
            } else if (testMatches > 10) {
                amount += 25000;
            } else if (odiMatches > 100) {
                amount += 15000;
            } else {
                amount += 10000;
            }

            amount += amount * 0.25f * momAwards;
            System.out.println(amount);
        } else if (playedIPL == 'y') {
            System.out.println("Enter the number of 'man of the match' awards:");
            int momAwards = sc.nextInt();

            amount += 8000;
            amount += amount * 0.25f * momAwards;
            System.out.println(amount);
        } else {
            amount += 7000;
            System.out.println(amount);
        }

        sc.close();
    }
}
