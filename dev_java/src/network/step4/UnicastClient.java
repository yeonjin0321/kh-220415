package network.step4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
/*
 * 서버측에서는 클라이언트에서 들은 걸 전달만 합니다.
 * 서버측에서는 말하기가 필요하지 않습니다.
 * 클라이언트측에서 하는 말을 서버가 들은 후 클라이언트 측에 내보내게 됩니다.
 *
 */
 
public class UnicastClient {
	private String ip;
	private int port;
	private String message;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	Scanner scan = new Scanner(System.in);
	public UnicastClient(String ip, int port) throws Exception {
		this.ip = ip;
		this.port = port;
		boolean isStop = false;
		Socket tcpSocket = getSocket();
		oos = new ObjectOutputStream(tcpSocket.getOutputStream());
		ois = new ObjectInputStream(tcpSocket.getInputStream());
		while(!isStop) {
			System.out.print("message : ");
			message =scan.next();
			oos.writeObject(message);
			
			message = (String)ois.readObject();
			if("exit".equals(message)) {
				isStop = true;
				System.out.println("종료되었습니다.");
			}else {
				System.out.println("Received message : " + message);
			}
		}
	}
	public Socket getSocket() {
		Socket tcpSocket = null;
		try {
			tcpSocket = new Socket(ip, port);
		} catch (IOException ie) {
			ie.printStackTrace();
			System.exit(0);
		}
		return tcpSocket;
	}
	public static void main(String args[]) throws Exception{
		new UnicastClient("localhost", 3000);
	}
}
