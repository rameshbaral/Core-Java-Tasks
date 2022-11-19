package com.click2career.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SetTwoQueries {
    public static Connection connection = ConnectDB.getConnection();
    public static void executeSetTwoQuery(){
        // 1  Display first name and last name after converting the first letter of each name to upper
        //case and the rest to lower case.
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update employees set first_name=Concat(upper(left(first_name,1)),Lower(substring(first_name,2,LENGTH(first_name)-1 ))),last_name=Concat(upper(left(last_name,1)),Lower(substring(last_name,2,LENGTH (last_name)-1)))");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("select first_name,last_name from employees");
            ResultSet rs = preparedStatement.executeQuery();
            System.out.println("1) Display first name and last name after converting the first letter of each name to upper \n" +
                    "case and the rest to lower case.\n");
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//2 Display first name and experience of the employees.
            preparedStatement = connection.prepareStatement("Select first_name,((current_date-hire_date)::integer/365) as experience from employees");
            rs = preparedStatement.executeQuery();
            System.out.println("2) Display first name and experience of the employees.");
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//3 Display manager ID and number of employees managed by the manager.
            preparedStatement = connection.prepareStatement("Select manager_id,count(manager_id)number from employees where manager_id is not null group by (manager_id)");
            rs = preparedStatement.executeQuery();
            System.out.println("3) Display manager ID and number of employees managed by the manager.");
            while (rs.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

// 4 Display the country ID and number of cities we have in the country.
            preparedStatement = connection.prepareStatement("Select country_id,count(country_id) as city_number from locations group by (country_id)");
            rs = preparedStatement.executeQuery();
            System.out.println("4) Display the country ID and number of cities we have in the country.");
            while (rs.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//5 Display average salary of employees in each department who have commission percentage.
            preparedStatement = connection.prepareStatement("select department_id,avg(salary)::decimal(20,2) as average_salary from employees where commission_pct is not null group by (department_id)");
            rs = preparedStatement.executeQuery();
            System.out.println("5)");
            while (rs.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

// 6 Display job ID, number of employees, sum of salary, and difference between the highest salary and lowest salary of the employees of the job.
            preparedStatement = connection.prepareStatement("select job_id,count(job_id),sum(salary),(max(salary)-min(salary)) as difference from employees group by (job_id)");
            rs = preparedStatement.executeQuery();
            System.out.println("6)Display job ID, number of employees, sum of salary, and difference between the highest salary and lowest salary of the employees of the job.");
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= 4; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//7  Display job ID for jobs with average salary more than 10000.
            preparedStatement = connection.prepareStatement("select job_id from employees group by (job_id) having avg(salary)>10000");
            rs = preparedStatement.executeQuery();
            System.out.println("7) Display job ID for jobs with average salary more than 10000.");
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= 1; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//8 Display employee ID for employees who did more than one job in the past.
            preparedStatement = connection.prepareStatement("select employee_id,count(job_id) from job_history group by (employee_id) having count(job_id)>1");
            rs = preparedStatement.executeQuery();
            System.out.println("8)Display employee ID for employees who did more than one job in the past");
            while (rs.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

// 9 Display department name and number of employees in the department
            preparedStatement = connection.prepareStatement("select departments.department_name,count(employees.employee_id) from employees join departments on departments.department_id=employees.department_id group by (departments.department_name)");
            rs = preparedStatement.executeQuery();
            System.out.println("9) Display department name and number of employees in the department");
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

// 10 Display department name, employee first name, and city.
            preparedStatement = connection.prepareStatement("select departments.department_name,employees.first_name,locations.city from departments inner join employees on departments.department_id=employees.department_id inner join locations on locations.location_id=departments.location_id");
            rs = preparedStatement.executeQuery();
            System.out.println("10) Display department name, employee first name, and city.");
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

