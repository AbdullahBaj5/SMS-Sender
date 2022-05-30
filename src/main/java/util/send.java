package util;

import com.twilio.rest.api.v2010.account.Message;

public class send {
    public static final String ACCOUNT_SID = System.getenv("sid");
    public static final String AUTH_TOKEN = System.getenv("tok");

    public static void send(String TO, String FROM, String body) {

        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(TO), // TO
                        new com.twilio.type.PhoneNumber(FROM),  // FROM
                        body)
                .create();

        System.out.println("[!] " + message.getStatus());
    }
}
