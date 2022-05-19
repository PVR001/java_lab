package Java_Lab_9;

import java.util.*;


interface Slry {
    void getSalary(float Qty, int Qlty);

    // implement the Static Interface
    static void MemberName() {
        System.out.println("\n\nUser : Joshua Stalin .S\nID  : 2147118");
    }
}

// 4.Nested Interface
interface UserDAta {
    static void UD() {
        System.out.println("User Data");
    }
}

class UserSalary implements Slry {

    float Bonus = 0;

    // implementation of abstract method
    public void getSalary(float Qty, int Qlty) {
        if (Qlty == 1) {
            Bonus = 50;
        } else if (Qlty == 2) {
            Bonus = 25;
        } else if (Qlty == 3) {
            Bonus = 10;
        }
        System.out.println("Amount to be Payed is :" + (Qty * 20 + Bonus));
        System.out.println("\nLiters of Milk : " + Qty + "Liters" + "\nCost Per Liter :" + 20 + " .Rs"
                + "\nBonus Amt : " + Bonus + " .Rs\n");
    }

}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // UserSalary car = new UserSalary();
        // car.cleanVehicle();
        Slry.MemberName();

        try {
            System.out.print("\nLiters of Milk  : ");
            float L_Milk = sc.nextInt();
            System.out.print("Quality of Milk \n     Enter\n  1-> A Quality \n  2-> B Quality \n  3-> C Quality\n");
            int Q_Milk = sc.nextInt();
            UserSalary r1 = new UserSalary();
            r1.getSalary(L_Milk, Q_Milk);
        } catch (Exception e) {
            System.out.println("Enter the right details");
        } finally {
            System.out.println("Code executed");
        }

    }
}
