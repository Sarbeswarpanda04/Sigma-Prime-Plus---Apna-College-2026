import javax.print.DocFlavor.STRING;

public class oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); //Created a pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(6);
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());

        // // BankAccount myAcc = new BankAccount();
        // // myAcc.username = "Sarbeswar";
        // // myAcc.setPassword("abcde");

        // Student s1 = new Student("Sarbeswar");
        // System.out.println(s1.name);


        // Fish shark = new Fish();
        // shark.eat();
        // shark.swim();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 8));
        System.out.println(calc.sum(8.5f, 2.5f));

        Deer d = new Deer();
        d.eat();
    }
}  
class Animal {
    void eat(){
        System.out.println("eat Anything");
    }
}

class Deer extends Animal {
    void eat(){
        System.out.println("Eat Grass");
    }
}
class Calculator {
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}


// class BankAccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }

// }
// class  Pen{
//      private String color;
//      private int tip;

//      String getColor(){
//         return this.color;
//      }

//      int getTip(){
//         return this.tip;
//      }

//      void setColor(String newColor){
//         this.color = newColor;
//      }

//      void setTip(int newTip){
//         tip = newTip;
//      }
// }

// class Student {
//     String name;
//     int role;
    
//     Student(String name){
//         this.name = name;
//     }
// }

// //Base class
// class Animal {
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("Breathes");
//     }
// }

// class Mammals extends Animal {
//     int legs;
//     void walk(){
//         System.out.println("walks");
//     }
// }
// class Fish extends Animal {

//     void swim(){
//         System.out.println("swim");
//     }
// }

// class Dog extends Mammals{
// String Bread;
// }

// //Derived class
// // class Fish extends Animal {
// //     int fins;

// //     void swim(){
// //          System.out.println("Swims");
// //     }
// // }