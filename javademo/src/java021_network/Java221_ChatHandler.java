package java021_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

public class Java221_ChatHandler implements Runnable {

	Socket socket;
	Thread th;
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	private static Vector<Java221_ChatHandler> userVect = new Vector<Java221_ChatHandler>();

	public Java221_ChatHandler() {

	}

	public Java221_ChatHandler(Socket socket) {
		this.socket = socket;
	}

	public void initStart() {
		if (th == null) {
			try {
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				dataIn = new DataInputStream(new BufferedInputStream(is));
				dataOut = new DataOutputStream(new BufferedOutputStream(os));
				th = new Thread(this);
				th.start();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}// end initStart()//////////////////////////////////////

	@Override
	public void run() {
		userVect.addElement(this);
		while (!Thread.interrupted()) {
			try {
				String message = dataIn.readUTF();
				broadcast(message);
			} catch (IOException e) {
				System.out.println(socket.getInetAddress().getHostAddress()+"나갔습니다.");
				userVect.remove(this);
				break;
			}
		}
	}// end run()/////////////////////////////////

	public void broadcast(String message) { //userVect에 동기화가 되어있기 때문에 syncro어쩌고 안써도 됨
		Enumeration<Java221_ChatHandler> enu = userVect.elements();
		while (enu.hasMoreElements()) {
			Java221_ChatHandler handler = enu.nextElement();
			try {
				handler.dataOut.writeUTF(message);
				handler.dataOut.flush();
			} catch (IOException e) {
				handler.stop(); // handler의 stop
			}
		}
	}// end message()//////////////////////////////

	public void stop() { // 자원들 반납
		if (th != null) {
			if (th != Thread.currentThread()) {
				th.interrupt(); 
				th = null;
				
				try {
					dataIn.close();
					dataOut.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				}

			}
		}
	}/////////////////////////////////////////////////

}// end class
