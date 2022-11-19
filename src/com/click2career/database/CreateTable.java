package com.click2career.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateTable {
    public static void createTable() {
        Connection connection = ConnectDB.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //Creates Regions table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS Regions CASCADE");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("CREATE TABLE Regions(Region_ID integer primary key not null," +
                    "Region_Name varchar(30) not null)");
            preparedStatement.execute();
            preparedStatement = connection.prepareStatement("INSERT INTO Regions VALUES(1,'Asia')");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT INTO Regions VALUES(2,'Europe')");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT INTO Regions VALUES (3,'North America')");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT INTO Regions VALUES (4,'South America')");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT INTO Regions VALUES (5,'Africa')");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT INTO Regions VALUES (6,'Antarctica')");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT INTO Regions VALUES (7,'Australia')");
            preparedStatement.executeUpdate();

            //Creates Countries table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS Countries CASCADE");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("CREATE TABLE Countries(Country_Id integer primary key," +
                    "Country_Name varchar(30) not null," +
                    "Region_Id integer," +
                    "foreign key (Region_Id) references Regions(Region_ID))");
            preparedStatement.execute();
            preparedStatement = connection.prepareStatement("INSERT into Countries values (1,'Nepal',1)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into Countries values (2,'Brazil',4)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into Countries values (3,'USA',3)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into Countries values (4,'Spain',2)");
            preparedStatement.executeUpdate();

//          Creating location table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS Locations CASCADE");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("CREATE TABLE Locations(Location_id Integer primary key not null," +
                    "Street_Address varchar(30) not null," +
                    "Postal_Code integer not null," +
                    "City varchar(30) not null," +
                    "State_Province varchar (30) not null," +
                    "Country_Id INTEGER," +
                    "FOREIGN KEY (Country_Id) references Countries(Country_Id))");
            preparedStatement.execute();
            preparedStatement = connection.prepareStatement("INSERT INTO locations values (1,'ringroad',4600,'Kathmandu','bagmati',1)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT INTO locations values (2,'Delhi Road',10011,'Rio','State of Rio de Janeiro',2)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT INTO locations values (3,'New Your Street',8000,'New York City','New York',3)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT INTO locations values (4,'Madrid street',10021,'Madrid','Central Spain',4)");
            preparedStatement.executeUpdate();

            //Creates Departments table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS Departments CASCADE ");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("CREATE TABLE Departments(Department_id Integer primary key not null," +
                    "Department_Name varchar(50) not null," +
                    "Manager_ID integer," +
                    "Location_Id integer, " +
                    "FOREIGN KEY (Location_Id) references Locations(Location_Id))");
            preparedStatement.execute();

            //Create Jobs table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS Jobs CASCADE");
            int update = preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("CREATE TABLE Jobs(Job_id Integer primary key ," +
                    "Job_Title varchar(50)," +
                    "Min_Salary integer," +
                    "Max_Salary integer)");
            preparedStatement.execute();
            preparedStatement = connection.prepareStatement("INSERT into jobs values (1,'SE',15000,100000)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into jobs values (2,'CE',8000,100000)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into jobs values (3,'IT',8000,100000)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into jobs values (4,'Sales',8000,16000)");
            preparedStatement.executeUpdate();

            //Creates Employees table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS Employees CASCADE");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("create table Employees(Employee_id integer primary key ," +
                    "First_Name varchar(40)," +
                    "Last_Name varchar(10), " +
                    "Email varchar(40)," +
                    "Phone_Number bigint," +
                    "Hire_Date date," +
                    "job_id integer," +
                    "salary integer," +
                    "Commission_Pct integer," +
                    "Manager_Id integer," +
                    "Department_Id integer," +
                    "FOREIGN KEY (Manager_Id) references Employees(Employee_id)," +
                    "FOREIGN KEY (Department_Id) references Departments(Department_Id)," +
                    "constraint emp_mail unique (Email)," +
                    "constraint salary_pos check(salary>(0)::numeric ))");
            preparedStatement.execute();
            preparedStatement = connection.prepareStatement("ALTER table departments add constraint dpt_mgr_fk foreign key (manager_id) references employees(employee_Id)");
            preparedStatement.executeUpdate();

            //Adds to departments tables values
            preparedStatement = connection.prepareStatement("INSERT into departments values (10,'IT',null,1)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into departments values (2,'CE',null,1)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into departments values (30,'HR',null,4)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into departments values (20,'SE',null,1)");
            preparedStatement.executeUpdate();

//          Adds to employee
            preparedStatement = connection.prepareStatement("INSERT into employees values (1,'Ramesh','Baral','baralrmesh07@gmail.com',9813256955,'2022/06/11',1,30000,null,null,10)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into employees values (2,'Ashish','Bista','bists@g.c',9999999999,'2003/03/12',1,50000,10000,1,10)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into employees values (3,'Atul','Kayastha','atul@g.c',9999999999,'2005/03/12',3,70000,10000,null,2)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into employees values (4,'Ram','Dai','d@gfds.c',9999999999,'2004/03/12',4,60000,15000,3,2)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into employees values (5,'Kasi','Shrestha','e@gmail.c',9999999999,'2009/03/12',2,80000,30000,3,2)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into employees values (150,'Deekshya','Maharjan','f@gmaik.c',9999999999,'2008/12/12',4,40000,80000,3,2)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into employees values (160,'Aditi','Prasain','g@gdafs.c',9999999999,'2011/12/12',1,8000,2000,1,10)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into employees values (115,'Laxman','Bahadur','h@gfds.c',9999999999,'2009/12/12',2,9000,6000,1,2)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into employees values (6,'Rajendra','lingden','i@gdsfdfs.c',9999999999,'2006/12/12',4,9000,null,3,30)");
            preparedStatement.executeUpdate();

            //Creates Job_History table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS Job_History CASCADE");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("CREATE TABLE Job_History(Employee_Id Integer not null ," +
                    "Start_Date date not null ," +
                    "End_Date date," +
                    "Job_Id integer not null," +
                    "Department_id integer not null," +
                    "foreign key (Employee_Id) references Employees(Employee_Id)," +
                    "foreign key (Job_Id) references Jobs(Job_Id)," +
                    "foreign key (Department_id) references  Departments(Department_id))");
            preparedStatement.execute();
            preparedStatement = connection.prepareStatement("INSERT into job_history values (1,'2001/06/11',null,1,10)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into job_history values (1,'1999/06/11','2001/05/11',2,2)");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("INSERT into job_history values (2,'2001/06/11','2003/06/03',1,30)");
            preparedStatement.executeUpdate();

            //Alter table departments to add manager id
            preparedStatement = connection.prepareStatement("update departments set manager_ID=1 where department_id=10");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("update departments set manager_ID=3 where department_id=2");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("update departments set manager_ID=3 where department_id=30");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("update departments set manager_ID=1 where department_id=20");
            preparedStatement.executeUpdate();

            //Creates members table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS members CASCADE");
            preparedStatement.executeUpdate();
//            preparedStatement = connection.prepareStatement("CREATE TABLE members(memid integer NOT NULL," +
//                    "surname character varying(200) NOT NULL," +
//                    "firstname character varying(200) NOT NULL," +
//                    "address character varying(300) NOT NULL," +
//                    "zipcode integer NOT NULL," +
//                    "telephone character varying(20) NOT NULL," +
//                    "recommendedby integer," +
//                    "joindate timestamp NOT NULL," +
//                    "CONSTRAINT members_pk PRIMARY KEY (memid)," +
//                    "CONSTRAINT fk_members_recommendedby FOREIGN KEY (recommendedby)" +
//                    "REFERENCES members(memid) ON DELETE SET NULL)");
//            preparedStatement.execute();

            //Creates facilities table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS facilities CASCADE");
            preparedStatement.executeUpdate();
//            preparedStatement = connection.prepareStatement("CREATE TABLE facilities (facid integer NOT NULL," +
//                    "name character varying(100) NOT NULL," +
//                    "membercost numeric NOT NULL," +
//                    "guestcost numeric NOT NULL," +
//                    "initialoutlay numeric NOT NULL," +
//                    "monthlymaintenance numeric NOT NULL," +
//                    "CONSTRAINT facilities_pk PRIMARY KEY (facid))");
//            preparedStatement.execute();
            //Creates facilities table
            preparedStatement = connection.prepareStatement("DROP TABLE  IF EXISTS bookings CASCADE");
            preparedStatement.executeUpdate();
//            preparedStatement = connection.prepareStatement(" CREATE TABLE bookings (bookid integer NOT NULL," +
//                    "facid integer NOT NULL," +
//                    "memid integer NOT NULL," +
//                    "starttime timestamp NOT NULL," +
//                    "slots integer NOT NULL," +
//                    "CONSTRAINT bookings_pk PRIMARY KEY (bookid)," +
//                    "CONSTRAINT fk_bookings_facid FOREIGN KEY (facid) REFERENCES facilities(facid)," +
//                    "CONSTRAINT fk_bookings_memid FOREIGN KEY (memid) REFERENCES members(memid))");
//            preparedStatement.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

