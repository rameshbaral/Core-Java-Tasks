package com.click2career.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SetThreeQueries {
    public static Connection connection = ConnectDB.getConnection();
    public static PreparedStatement preparedStatement = null;
    public static ResultSet resultSet = null;

    public static void runSetThreeQuery() {
        try {
//1.Display country name, city, and department name.
            preparedStatement = connection.prepareStatement("select c.country_name,l.city,d.department_name from locations l inner join countries c on c.country_id=l.country_id inner join departments d on l.location_id=d.location_id");
            resultSet = preparedStatement.executeQuery();
            System.out.println("1) Display country name, city, and department name.\n");
            while (resultSet.next()) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//2.Display job title, department name, employee last name, starting date for all jobs from 2000 to 2005.
            preparedStatement = connection.prepareStatement("select j.job_title, d.department_name, e.last_name, e.hire_date" +
                    "from employees e" +
                    "inner join departments d" +
                    "on d.department_id = e.department_id" +
                    "inner join jobs j" +
                    "on j.job_id = e.job_id" +
                    "where e.hire_date > '2000/01/01' and e.hire_date < '2005/01/01';");
            resultSet = preparedStatement.executeQuery();
            System.out.println("2)Display job title, department name, employee last name, starting date for all jobs from 2000 to 2005.\n");
            while (resultSet.next()) {
                for (int i = 1; i <= 4; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//3. Display job title and average salary of employees
            preparedStatement = connection.prepareStatement("SELECT j.job_title, avg(e.salary)::decimal(20,2)" +
                    "from jobs j" +
                    "inner join employees e on j.job_id = e.job_id" +
                    "group by j.job_title;");
            resultSet = preparedStatement.executeQuery();
            System.out.println("3) Display job title and average salary of employees \n");
            while (resultSet.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }

//4. Display department name, manager name, and salary of the manager for all managers whose experience is more than 5 years.
            preparedStatement = connection.prepareStatement("select d.department_name,e.first_name,e.salary" +
                    "from employees e" +
                    "    inner join departments d" +
                    "        on d.department_id=e.department_id" +
                    "where ((current_date-hire_date)/365)>5" +
                    "  and e.manager_id is null");
            resultSet = preparedStatement.executeQuery();
            System.out.println("4)");
            while (resultSet.next()) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
//5. Display employee name and country in which he is working.
            preparedStatement = connection.prepareStatement("select  e.first_name,c.country_name" +
                    "from employees e " +
                    "inner join departments d " +
                    "on" +
                    "            d.department_id=d.department_id" +
                    "    inner join locations l" +
                    "        on d.location_id=l.location_id" +
                    "    inner join countries c on" +
                    "        c.country_id=l.country_id");
            resultSet = preparedStatement.executeQuery();
            System.out.println("5) Display employee name and country in which he is working.");
            while (resultSet.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
//6. Display department name, average salary and number of employees with commission within the department.
            preparedStatement = connection.prepareStatement("select d.department_name, avg(e.salary)::decimal(20,2),count(e.employee_id)" +
                    "from departments d" +
                    "    inner join employees e" +
                    "        on d.department_id=e.department_id" +
                    "where e.commission_pct is not null" +
                    "group by (d.department_name)");
            resultSet = preparedStatement.executeQuery();
            System.out.println("6) Display department name, average salary and number of employees with commission within the department. \n");
            while (resultSet.next()) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
//7.Display employees who did not do any job in the past.
            preparedStatement = connection.prepareStatement("select first_name from employees" +
                    "where employee_id not in (select employee_id from job_history)");
            resultSet = preparedStatement.executeQuery();
            System.out.println("7) Display employees who did not do any job in the past.\n");
            while (resultSet.next()) {
                for (int i = 1; i <= 1; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
//8. Display job title and average salary for employees who did a job in the past.
            preparedStatement = connection.prepareStatement("select j.job_title,avg(SALARY)" +
                    "from employees e" +
                    "    inner join job_history jh" +
                    "    on e.employee_id = jh.employee_id" +
                    "    inner join jobs j" +
                    "        on jh.job_id = j.job_id" +
                    "group by j.job_title");
            resultSet = preparedStatement.executeQuery();
            System.out.println("8)Display job title and average salary for employees who did a job in the past.\n");
            while (resultSet.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
//9. Display country name, city, and number of departments where the department has more than 5 employees.
            preparedStatement = connection.prepareStatement("select c.country_name,l.city,count(d.department_id)" +
                    "from countries c" +
                    "    inner join locations l" +
                    "        on c.country_id=l.country_id" +
                    "    inner join departments d" +
                    "        on l.location_id=d.location_id" +
                    "where d.department_id in (SELECT department_id FROM employees GROUP BY department_id HAVING COUNT(department_id)>=5)" +
                    "group by (c.country_name,l.city)");
            resultSet = preparedStatement.executeQuery();
            System.out.println("9)Display country name, city, and number of departments where the department has more than 5 employees.");
            while (resultSet.next()) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
//10. Display employee name, job title, start date, and end date of past jobs of all employees with commission percentage null.
            preparedStatement = connection.prepareStatement("select e.first_name, j.job_title, jh.start_date, jh.end_date" +
                    "from employees e" +
                    "    inner join job_history jh" +
                    "        on e.employee_id = jh.employee_id" +
                    "    inner join jobs j on jh.job_id = j.job_id" +
                    "where COMMISSION_PCT is null");
            resultSet = preparedStatement.executeQuery();
            System.out.println("10) Display employee name, job title, start date, and end date of past jobs of all employees with commission percentage null.\n");
            while (resultSet.next()) {
                for (int i = 1; i <= 4; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
            //11. Display the city of employees whose employee ID is 105.
            preparedStatement = connection.prepareStatement("select city from employees e" +
                    "    inner join departments" +
                    "        on e.employee_id = d.manager_id" +
                    "    inner join locations" +
                    "        on d.location_id = l.location_id" +
                    "where e.employee_id =105");
            resultSet = preparedStatement.executeQuery();
            System.out.println("11) Display the city of employees whose employee ID is 105.\n");
            while (resultSet.next()) {
                for (int i = 1; i <= 1; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t");
                }
                System.out.println();
            }
            //12.Display third second salary of  employees
            preparedStatement = connection.prepareStatement("select max(salary) as second_largest_salary" +
                    "from employees" +
                    "where salary not in (select max(salary) from employees)");
            resultSet = preparedStatement.executeQuery();
            System.out.println("12)Display third second salary of  employees.\n");
            while (resultSet.next()) {
                for (int i = 1; i <= 1; i++) {
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
