package com.click2career.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SetOneQueries {
    public static PreparedStatement preparedStatement = null;
    public static ResultSet resultSet = null;
    public static Connection connection = ConnectDB.getConnection();

    public static void executeSetOneQueries() {
        try {
//          1. Display details of jobs where the minimum salary is greater than 10000.
            preparedStatement = connection.prepareStatement("select * from jobs where min_salary>10000");
            resultSet = preparedStatement.executeQuery();
            System.out.println("1) Displays the details of jobs where the minimum salary is greater than 10000.");
            while (resultSet.next()) {
                System.out.print(resultSet.getString(1));
                System.out.print("\t");
                System.out.print(resultSet.getString(2));
                System.out.print("\t");
                System.out.print(resultSet.getString(3));
                System.out.print("\t");
                System.out.print(resultSet.getString(4));
                System.out.println();
            }

//2. Display the first name and join date of the employees who joined between 2002 and 2005.
            preparedStatement = connection.prepareStatement("SELECT first_name,hire_date FROM employees where hire_date>='2002/01/01' AND hire_date<'2005/01/01'");
            resultSet = preparedStatement.executeQuery();
            System.out.println("2) Displays the first name and join date of the employees who joined between 2002 and 2005.");
            while (resultSet.next()) {
                System.out.print(resultSet.getString(1));
                System.out.print("\t");
                System.out.print(resultSet.getString(2));
                System.out.println();
            }

//3. Display first name and join date of the employees who is either IT Programmer or Salesman.
            preparedStatement = connection.prepareStatement("SELECT first_name,hire_date FROM employees where job_id=3 or job_id=4");
            resultSet = preparedStatement.executeQuery();
            System.out.println("3) Display first name and join date of the employees who is either IT Programmer or Salesman.");
            while (resultSet.next()) {
                System.out.print(resultSet.getString(1));
                System.out.print("\t");
                System.out.print(resultSet.getString(2));
                System.out.println();
            }

// 4. Displays employees who joined after 1st January 2008.
            preparedStatement = connection.prepareStatement("SELECT * from employees where hire_date>'2008/01/01'");
            resultSet = preparedStatement.executeQuery();
            System.out.println("4) Displays employees who joined after 1st January 2008.");
            while (resultSet.next()) {
                for (int i = 1; i <= 11; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//5.Display details of employees with ID 150 or 160.
            preparedStatement = connection.prepareStatement("SELECT * from employees where employee_id=150 or employee_id=160");
            resultSet = preparedStatement.executeQuery();
            System.out.println("5) Display details of employees with ID 150 or 160.");
            while (resultSet.next()) {
                for (int i = 1; i <= 11; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//6. Display first name, salary, commission pct, and hire date for employees with salary less than 10000
            preparedStatement = connection.prepareStatement("select first_name,salary,commission_pct,hire_date from employees where salary<=10000");
            resultSet = preparedStatement.executeQuery();
            System.out.println("6) Display first name, salary, commission pct, and hire date for employees with salary less than 10000");
            while (resultSet.next()) {
                for (int i = 1; i <= 4; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

// 7 Display job Title, the difference between minimum and maximum salaries for jobs with max salary in the range 10000 to 20000.
            System.out.println("7)Display job Title, the difference between minimum and maximum salaries for jobs with \n" +
                    "max salary in the range 10000 to 20000.");
            preparedStatement = connection.prepareStatement("SELECT job_title,(max_salary-min_salary) as salary_differences from jobs where max_salary<20000 and max_salary>10000");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

// 8. Displays details of jobs in the descending order of the title.
            preparedStatement = connection.prepareStatement("SELECT * from jobs order by job_title desc ");
            resultSet = preparedStatement.executeQuery();
            System.out.println("8) Display details of jobs in the descending order of the title.");
            while (resultSet.next()) {
                for (int i = 1; i <= 4; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//9. Display employees where the first name or last name starts with S.
            preparedStatement = connection.prepareStatement("select * from employees where first_name like 'S%' or last_name like 'S%'");
            resultSet = preparedStatement.executeQuery();
            System.out.println("9) Display employees where the first name or last name starts with S.");
            while (resultSet.next()) {
                for (int i = 1; i <= 11; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//10. Display details of the employees where commission percentage is null and salary in the range 5000 to 10000 and department is 30.
            preparedStatement = connection.prepareStatement("select * from employees where  commission_pct is null and salary>5000 and salary<10000 and department_id=30");
            resultSet = preparedStatement.executeQuery();
            System.out.println("10) Display details of the employees where commission percentage is null and salary in the range 5000 to 10000 and department is 30.");
            while (resultSet.next()) {
                for (int i = 1; i <= 11; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

// 11 Change salary of employee 115 to 800
            preparedStatement = connection.prepareStatement("update employees set salary=8000 where employee_id=115");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("select * from employees where employee_id=115");
            resultSet = preparedStatement.executeQuery();
            System.out.println("11) Change salary of employee 115 to 800");
            while (resultSet.next()) {
                for (int i = 1; i <= 11; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//12 Delete department 20.
            preparedStatement = connection.prepareStatement("delete from departments where department_id=20");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("select * from departments");
            resultSet = preparedStatement.executeQuery();
            System.out.println("12) Delete department 20.");
            while (resultSet.next()) {
                for (int i = 1; i <= 4; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

// 13  Change job ID of employee 110 to IT_PROG if the employee belongs to department 10
            //First we change the data type of job_id
            preparedStatement = connection.prepareStatement("ALTER table employees alter column job_id type varchar(20)");
            preparedStatement.executeUpdate();
            //rerun table creation before running the program
            preparedStatement = connection.prepareStatement("update employees set job_id='it_prog' where department_id=10");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("select * from employees where department_id=10");
            resultSet = preparedStatement.executeQuery();
            System.out.println("13)Changes job ID of employee 110 to IT_PROG if the employee belongs to department 10");
            while (resultSet.next()) {
                for (int i = 1; i <= 11; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

