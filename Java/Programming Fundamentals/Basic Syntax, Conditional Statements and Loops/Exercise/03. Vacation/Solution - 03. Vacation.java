import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNum = scanner.nextInt();
        scanner.nextLine();
        String peopleType =  scanner.nextLine();
        String day = scanner.nextLine();
        double price = 1;
        double discount = 0;

        if(peopleType.equals( "Students")) {
            switch (day){
                case "Friday": price= 8.45;
                    break;
                case "Saturday": price = 9.80;
                    break;
                case "Sunday": price = 10.46;
                    break;
            }

            if (peopleNum >= 30){
                discount = 0.15;
            }

            System.out.printf("Total price: %.2f%n",(peopleNum*price)-(peopleNum*price*discount) );
        }

        else if(peopleType.equals("Business")) {
            switch (day) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16.0;
                    break;
            }

            if (peopleNum >= 100){
                peopleNum = peopleNum-10;
            }

            System.out.printf("Total price: %.2f%n",(peopleNum*price));
        }

        else {
            switch (day){
                case "Friday": price = 15.0;
                    break;
                case  "Saturday": price =  20.0;
                    break;
                case  "Sunday": price = 22.50;
                    break;
            }

            if (peopleNum >= 10 && peopleNum <= 20){
                discount = 0.05;
            }
            System.out.printf("Total price: %.2f%n",(peopleNum*price)-(peopleNum*price*discount) );
        }
        
    }
}





