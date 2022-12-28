package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitie.Department;
import entitie.Worker;
import entitie.hourContract;
import entitie.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department´s name:");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,new Department(departmentName));
		System.out.println("how many contracts to this worker? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + i + "data:");
			System.out.println("date (DD/MM/YYYY): ");
		    Date contractDate = sdf.parse(sc.next());
		    System.out.println("Value per hour: ");
		    double valuePerHour = sc.nextDouble();
		    System.out.println("Duration (hours): ");
		    int hours = sc.nextInt();
		    hourContract contract = new hourContract(contractDate, valuePerHour, hours);
		    worker.addContract(contract);
		}
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)) );
	    sc.close();
        
	}

}
