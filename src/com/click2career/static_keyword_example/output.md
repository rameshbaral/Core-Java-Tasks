1.  What will be the output of the following program

       ` public class Time {
             int a = 50;
             int b = 10;

             public static void main(String args[]) {
                a += b--;
                System.out.println(a);
             }
        }`

Ans.  There will be compilation error in this code it will show non-static variable a cannot be referenced from a static context.This is because we need to create object of the class to access it's non static members.
Correct way to do it would be

`public static void main(String args[]) {
Time time = new Time();
time.a += time.b--;
System.out.println(a);
}`

                       Then the output will be : 60

========================================================================================================================================================================

2.    What is the output of the following program?

                  ` public class AutoFare {

                       private static final double MINIMUM_CHARGE = 16.0;
                       protected static final double PRICE_PER_KM = 9.25;
                       public static final double WAITING_CHARGE_PER_MIN = 0.50;

                       public static void main(String[] args) {
                           System.out.print(calculate(0.5, 12) + "@");
                           System.out.print(calculate(12, 0) + "@");
                           System.out.print(calculate(1, 200) + "@");
                           System.out.print(calculate(8.25, 3) + "@");
                       }

                       private static int calculate(double kms, int minutes) {
                           return Math.rint(Math.min(kms * PRICE_PER_KM + WAITING_CHARGE_PER_MIN, MINIMUM_CHARGE));
                       }
                   }`

Ans- This program gives an compile time error "java: incompatible types: possible lossy conversion from double to int" as calculate method takes a parameter in double type and trys to apply arithmetic calculation and return in integer type.
If we type cast this return value to int then it'll give output or otherwise we can convert the return type of the method calculate to double.


=========================================================================================================================================================================

3.    What will be the output of the following program?
      `public class CallBy {
      static void execute(Byte x, Byte y) {
      System.out.println("execute, execute");
      }
      static void execute(Byte x, Byte y, Byte z) {
      System.out.println("execute, execute, execute");
      }
      static void execute(byte... x) {
      System.out.println("execute");
      }
      public static void main(String[] args) {
      byte b = 5;
      execute(b);
      execute(b, b);
      execute(b, b, b);
      execute(b, b, b, b);
      }
      }`

Ans-   This program gives the following output
execute
execute, execute
execute, execute, execute
execute
As, byte... means if the number parameter is not defined in other method then it'll will print this method respectively.

=========================================================================================================================================================================

4.     What will be the output of the following program?

              `public class FireAlarm {
                   public static void main(String[] args) {
                       double d[] = {2.3,3.4,4.5};
                       p(d);
                       modify(d); p(d);
                       modify2(d); p(d);
                       modify(d); p(d);
                   }
                   private static void p(double[] d) {
                       System.out.print("{");
                       for (double d1 : d) {
                           System.out.print(d1 + ",");
                       }
                       System.out.print("},");
                   }
                   private static void modify(double[] d) {
                       d[0] = d[1];
                       d[1] = d[2];
                       d[2] = d[0];
                   }
                   private static void modify2(double[] d) {
                       d = new double[3];
                       d[0] = d[1] = d[2] = 1.0;
                   }
               }`
Ans-    The output of this program will be,
{2.3,3.4,4.5},{3.4,4.5,3.4},{3.4,4.5,3.4},{4.5,3.4,4.5}

Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
