import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {

		ServerSocket serverSocket = new ServerSocket(8000);
		/**
		 * new ServerSocket(port) does the following: creates a new socket binds the
		 * socket to (ip, port) pair starts listening
		 */
		System.out.println("Started listening...");

		while (true) {
			Socket client = serverSocket.accept();

			Date now = new Date();

			String date = now.toString();

			String msg = "HTTP/1.1 200 OK\r\n\r\nTime = " + date;

			client.getOutputStream().write(msg.getBytes());

			client.close();
			System.out.println("Client closed!");
		}

	}

}
