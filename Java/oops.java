import javax.print.DocFlavor.STRING;

public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //Created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(6);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Sarbeswar";
        // myAcc.setPassword("abcde");

        Student s1 = new Student("Sarbeswar");
        System.out.println(s1.name);


        Fish shark = new Fish();
        shark.eat();
        shark.swim();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// class BankAccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }

// }
class  Pen{
     private String color;
     private int tip;

     String getColor(){
        return this.color;
     }

     int getTip(){
        return this.tip;
     }

     void setColor(String newColor){
        this.color = newColor;
     }

     void setTip(int newTip){
        tip = newTip;
     }
}

class Student {
    String name;
    int role;
    
    Student(String name){
        this.name = name;
    }
}

//Base class
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammals extends Animal {
    int legs;
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal {

    void swim(){
        System.out.println("swim");
    }
}

class Dog extends Mammals{
String Bread;
}

//Derived class
// class Fish extends Animal {
//     int fins;

//     void swim(){
//          System.out.println("Swims");
//     }
// }