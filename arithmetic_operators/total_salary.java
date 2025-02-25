package arithmetic_operators;

//Find the total salary for the given salary of Employee (basic=23000, hra=12%, da=5%,ta=5%, pf=7%, esi=3%)

public class total_salary {
    public static void main(String args[])
    {
        int basic = 23000;
        double hra = 0.12 * basic;
        double da = 0.05 * basic;
        double ta = 0.05 * basic;
        double pf = 0.07 * basic;
        double esa = 0.03 * basic;
        double total_salary = basic + hra + da + ta - (pf + esa);//pf and esa are deducted from salary
        System.out.println("Salary is Rs " + total_salary);
    }   
}