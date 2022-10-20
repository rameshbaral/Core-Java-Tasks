1. What is inheritance ? 
Ans: Inheritance is a mechanism in Java where one class acquires/uses the property of another
   class. These properties include fields as well as methods.

2. Why do we need inheritance ?
Ans:Inheritance is one of the most important aspects of Object Oriented Programming (
   OOP). The key to understanding Inheritance is that it provides code re-usability. In place of writing the same code,
   again and again, we can simply inherit the properties of one class into the other.

3. What are the types of inheritance and which types of inheritance is supported in java ? 
Ans: The types of inheritance
   are
    1. Single Inheritance
    2. Multiple Inheritance
    3. Multi-level Inheritance
    4. Hierarchical Inheritance
    5. Hybrid Inheritance
     Java supports all above inheritance type except multiple inheritance because handling the
     complexity that causes due to multiple inheritances is very complex.

4. Can we extend more than one class in java?
      Ans.  No, we cannot extend more than one class in java because if we inherit more than once class in java then it's called multiple inheritance which is not supported
      by java as, in child class there will be ambiguity about which method to use if there are same method in parent class called as diamond problem.

5. What is the use of the super keywords?
      Ans.  Super means or refers to parent class object. It is used to call parentClass method,and access to the parentClass constructor.

6. Can we access subclass method using superclass objects?
         Ans.  Yes, if we initialize a constructor of subclass while initializing the object of the superclass then we can access method of subclass using superclass objects.
         eg- If Class A is parent class and Class B is the child class then.
         ClassA obj = new ClassB(); //initializing the object of class A.
         now using classA object obj we can call class B methods.

7. What are the types of inheritance and which are not supported by java?
     Ans. Types of inheritance in java are-
     1.Single Inheritance
     2.MultiLevel Inheritance
     3.Hierarchical Inheritance
     4.Multiple Inheritance
     5.Hybrid Inheritance

     among these type of inheritance multiple inheritance and hybird inheritance is not supported by java.

8. Why is multiple inheritance is not supported by java?
     Ans. Multiple Inheritance is not supported in java because, as multiple inheritance means one child class inheriting from the two parent class. In inheriting from the
     two parent class, if two parent class has the same method then, after inheriting child class also have these method. Now after creating an object and
     typing to call this method, java will be confused which method to call as both the parent class have same method. This is also called as the diamond problem.
     So, in short to prevent diamond problem multiple inheritance is not supported in java.


