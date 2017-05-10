package java_client;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;


public class Client {

    public static final String Host="128.124.12.5";
    public static final int Port=1256;

    public static void main(String[] args){

        System.out.println("Client initialization");
        try {
            Socket client = new Socket(Host, Port);
            InputStream in=client.getInputStream();
            OutputStream out=client.getOutputStream();

            String messages="saliut server!!!";
            out.write(messages.getBytes());
        }
        catch (Exception ConnectException){
          System.out.println("Failed connection to server!!!");
        }
    }


}
