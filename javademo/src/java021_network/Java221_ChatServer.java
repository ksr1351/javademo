package java021_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Java221_ChatServer {

	public static void main(String[] args) {
		ServerSocket server = null;

		try {
			server = new ServerSocket(7777);
			while (true) {
				Socket client = server.accept();
				System.out.printf("client가 %s로 접속", client.getInetAddress().getHostAddress()); // client ip주소 가져오기
				
				Java221_ChatHandler handle = new Java221_ChatHandler(client);
				handle.initStart();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end main()

}// end class
