import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {

    public static void main(String[] args) {
        String from = "BohoTravelTnsurance@gmail.com";
        String password = "BohoTravelInsurance123";

        String to = "BohoTravelTnsurance@gmail.com";

        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();
        

         
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587"); // TLS port
        properties.put("mail.smtp.auth", "true");

        properties.put("mail.smtp.starttls.enable", "true"); // Enable STARTTLS
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2"); // Force TLSv1.2 or higher

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        session.setDebug(true);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is the Subject Line!");
            message.setText("This is the actual message");

            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
