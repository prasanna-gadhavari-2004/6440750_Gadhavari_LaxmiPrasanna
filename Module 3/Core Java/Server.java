import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        Socket socket = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while (!(msg = in.readLine()).equals("exit")) {
            System.out.println("Client: " + msg);
            System.out.print("Server: ");
            out.println(console.readLine());
        }

        socket.close();
        server.close();
    }
}