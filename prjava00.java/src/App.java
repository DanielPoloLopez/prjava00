public class App {
import java.net.*;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
     
public static void main(String[] args) {
    System.out.println("Hola món");
    System.out.println("versió 0.2 del projecte prjava00");
    try {
    InetAddress addr = InetAddress.getLocalHost();
    String ipAddr = addr.getHostAddress();
    String hostname = addr.getHostName();
    System.out.println("hostname="+hostname);
    System.out.println("Adreça IP:" +ipAddr);
    System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
    System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
    System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
    System.out.println("Versió OS: " + System.getProperty("os.version"));
    }
    catch (UnknownHostException e) {
    e.printStackTrace();
    }
    }    
}