/*
2) this: to invoke current class method(Implicitly)
 */
package com.click2career.this_keyword_exercise;

public class Demo {
    public void greet() {
        System.out.println("hello there");
    }

    void celebrate() {
        // this: to invoke current class method(Implicitly) it is same as greet()
        this.greet();
        System.out.println("yey!!!!!");

    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.celebrate();
    }
}
