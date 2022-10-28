package part1;

import java.util.Scanner;

public class totalSalary {

	public static void main(String[] args) {
		int basic_salary;
		double hra,da;
		int allow;
		double pf;
		String grade;
		Scanner sc =new Scanner(System.in);
		basic_salary =sc.nextInt();
		grade=sc.next();
		if(grade.equalsIgnoreCase("A")) {
			allow=1700;
		}
		else if(grade.equalsIgnoreCase("B")) {
			allow=1500;
		}
		else {
			allow=1300;
		}
		hra=basic_salary*0.2;
		da=basic_salary*0.5;
		pf=(basic_salary*11)/100;
		
		int total_salary=(int) (basic_salary+hra+da+allow-pf);
		System.out.println(total_salary);
		
		
		
		
		sc.close();
		

	}

}
