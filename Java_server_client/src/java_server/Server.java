package java_server;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
/**
 * Created by Admin on 09.05.2017.
 */
public class Server {

  public static final int Port=1256;


    public static void main(String[] args){

       try {
           ServerSocket server = new ServerSocket(Port);
           Socket accese_serv=server.accept();

           System.out.println("adress:"+accese_serv.getInetAddress());

           InputStream in= accese_serv.getInputStream();
           OutputStream out=accese_serv.getOutputStream();

          byte[] buf=new byte[32*1024];
          int readByte=in.read(buf);

          String text=new String(buf,0,readByte);

       }catch (Exception ConnectException){
         System.out.println("Server field start!!!");
       }


    }

}
