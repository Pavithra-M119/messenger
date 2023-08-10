public class Main {
    public static void main(String[] args) {
        SMSMessagingService smsMessagingService = new SMSMessagingService();
        EmailMessagingService emailMessagingService = new EmailMessagingService();
        WhatsAppMessagingService whatsAppMessagingService = new WhatsAppMessagingService();
        smsMessagingService.sendMessage();
        MessagingService.message();
        emailMessagingService.sendMessage();
        whatsAppMessagingService.sendMessage();
        MessagingService.message();

    }
}
interface MessagingService {
    static void message()
    {
        System.out.println("Hello");
    }
    abstract  void sendMessage();
}
class SMSMessagingService implements MessagingService
{
    @Override
    public void sendMessage() {
        System.out.println("hi im sms");
    }
}
class EmailMessagingService implements MessagingService
{
    @Override
    public void sendMessage() {
        System.out.println("im email");
    }
}
class WhatsAppMessagingService implements MessagingService
{
    @Override
    public void sendMessage() {
        System.out.println("im whatsapp");
    }
}