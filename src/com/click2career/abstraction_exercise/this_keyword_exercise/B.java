/*
5) this: to pass as argument in the constructor call

 */
package com.click2career.abstraction_exercise.this_keyword_exercise;

class B{
    PassArgumentInConstructorCall obj;
    B(PassArgumentInConstructorCall obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);//using data member of PassArgumentInConstructorCall class
    }
}

class PassArgumentInConstructorCall {
    int data=10;
    PassArgumentInConstructorCall(){
        B b=new B(this);
        b.display();
    }
    public static void main(String[] args){
        PassArgumentInConstructorCall a=new PassArgumentInConstructorCall();
    }
}