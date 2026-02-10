import java.util.*;
public class MyGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.print("Enter yor Year of birth : ");
        year = sc.nextInt();

        if (year>=1946 && year<=1964){
            System.out.println("You are Baby Boomers");
        }
        else if (year>=1965 && year<=1980){
            System.out.println("You are Gen X");  
        }
        else if (year>=1981 && year<=1996){
            System.out.println("You are Gen Y");
        }
        else if (year>=1997 && year<=2012){
            System.out.println("You are a Gen Z");  
        }
        else if (year>=2010 && year<=2024){
            System.out.println("You are Gen Alpha");
        }
        else if (year>=2025 && year<=2039){
            System.out.println("You are Gen Beta");  
        }
        else{
            System.out.println("Invalid year");
        }

    }
}



/*
Baby Boomers (1946–1964): Post-WWII, rapid economic growth.
Generation X (1965–1980): "Latchkey kids," witnessed the rise of personal computing.
Millennials (Gen Y, 1981–1996): Digital pioneers, shaped by the internet.
Generation Z (1997–2012): Digital natives, highly diverse, pragmatic.
Generation Alpha (2010–2024): Children of Millennials, born entirely within the 21st century.
Generation Beta (2025–2039): The upcoming generation starting in 2025. 

  */