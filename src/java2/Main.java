package java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
       Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees:  ");
        int n = sc.nextInt();

        for (int i = 1; i<=n;i++){
            System.out.println( "Employee # " + i + " data:");
            System.out.print(" Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print(" Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch== 'y' | ch == 'Y'){
                System.out.print(" Additional charge: ");
                double additionalCharge = sc.nextDouble();
               //as variaveis são diferentes do construtor, porém  ele pega a estrutura.
               //Employee emp = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge); list.add(emp);

                list.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));

            }
            else{

                list.add(new Employee(name,hours,valuePerHour));  //Employee emp = new Employee(name,hours,valuePerHour);list.add(emp);
            }}

            System.out.println();
            System.out.println("PAYMENTS: ");
            for (Employee emp : list){ // para cada funcionário emp na minha lista
                System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
            }
            sc.close();
        }
    }


