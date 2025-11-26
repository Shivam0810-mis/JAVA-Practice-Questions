 public interface Loggable{

 }
 public class loggerUtility {

    public static void log(Object obj, String message) {
        if (obj instanceof Loggable) {
            System.out.println("LOG [" + obj.getClass().getSimpleName() + "]: " + message);
        }
    }
}
 public class PaymentProcessor implements Loggable {
    public void processPayment() {
        LoggerUtility.log(this, "Processing payment...");
    }
}
public class NotificationService {
    public void sendNotification() {
        LoggerUtility.log(this, "Sending notification...");
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment = new PaymentProcessor();
        NotificationService notification = new NotificationService();

        payment.processPayment();       
        notification.sendNotification(); 
    }   
}


    

