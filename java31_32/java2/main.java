package org.example;

public class Main {
    public static void main(String[] args) {
        // 8時間超えを残業とみなす。
        double overWorkingHours1 = EmployeePrac.calculateOverWorkingHours(6);
        System.out.println(overWorkingHours1);

        EmployeePrac e = new EmployeePrac();
        System.out.println(e.getPayment(10));
    }
}

class EmployeePrac {
    public static final int STANDARD_WORK_HOURS_PER_DAY = 8;
    int paymentPerHour = 1000;

    public double getPayment(int workingHours) {
        double overWorkingHours = calculateOverWorkingHours(workingHours);
        double paymentForOverWorkingHours = this.paymentPerHour * 1.5 * overWorkingHours;
        double standardWorkingHours = workingHours - overWorkingHours;
        double paymentForStandardWorkHours = this.paymentPerHour * standardWorkingHours;
        return paymentForOverWorkingHours + paymentForStandardWorkHours;
    }

    public static double calculateOverWorkingHours(double workingHours) {
        if (workingHours < STANDARD_WORK_HOURS_PER_DAY) {
            return 0;
        } else {
            return workingHours - STANDARD_WORK_HOURS_PER_DAY;
        }
    }
}
