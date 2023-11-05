package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImp;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		EmployeeService eservice = new EmployeeServiceImp(); 
		do {
			
			System.out.println("1. addEmployee\n2. displayAll\n3. displayById\n4. deleteEmpById\n5. mpdifyBySal\n6. sortBySal\n7. sortByName\n8. display n topmost\n9. exit\nchoice:");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("select from\n1. SaleriedEmp\n2. ContractEmp");
				int x = sc.nextInt();
				eservice.addEmployee(x);
				break;
			case 2:
				Map<Integer, Employee> elst = eservice.displayAll();
				if(elst!=null)
				{
					System.out.println(elst);
				}
				break;
			case 3:
				System.out.println("enter id");
				int id = sc.nextInt();
				Employee emp1 = eservice.displayById(id);
				Stream.of(emp1).forEach(System.out::println);
				break;
			case 4:
				System.out.println("enter id which you want to delete");
				id = sc.nextInt();
				boolean status =eservice.deleteById(id);
				if(status)
				{
					System.out.println("deleted");
				}
				else
				{
					System.out.println("enter correct id");
				}
				break;
			case 5:
				System.out.println("enter id");
				id = sc.nextInt();
				System.out.println("enter salary updation");
				int sal = sc.nextInt();
				status = eservice.updateSal(id,sal);
				if(status)
				{
					System.out.println("updated");
				}
				else
				{
					System.out.println("enter correct data");
				}
				break;
			case 6:
				List<Employee> lst= eservice.sortBySal();
				lst.stream().forEach(System.out::println);
				break;
			case 7:
				Set<Employee> elit = eservice.sortByName();
				 elit.stream().forEach(System.out::println);
				break;
			case 8:
				System.out.println("enter number of employee you want");
				int n = sc.nextInt();
				Employee[] emp = eservice.findTopMost(n);
				Stream.of(emp).forEach(System.out::println);
				break;
			case 9:
				System.out.println("thank you..");
				sc.close();
				break;
			}
		}while(choice != 9);
		
	}

}
