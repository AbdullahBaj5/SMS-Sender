import util.send;

import java.util.Scanner;

public class SendSMS {

     static final String number = "+17854250352";

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println(" *** Welcome to SEND SMS service *** ");

        System.out.print("[?] Specify the number you want to send [TO]: ");
        String to = read.next();

//        System.out.print("[?] Specify the number you want to send [FROM]: ");
//        String from = read.next();

        System.out.print("[?] Specify the text you want to send: ");
        String body = read.next();

        send.send(to, number, body);

    }

}
