import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        int port = 8069;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String question = in.readLine();
            System.out.println(question);
            out.println("Andrey");
            System.out.println("Andrey");

            String question2 = in.readLine();
            System.out.println(question2);
            out.println("no");
            System.out.println("no");

            String message = in.readLine();
            System.out.println(message);
        }
    }
}
