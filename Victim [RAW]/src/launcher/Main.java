package launcher;

import java.io.IOException;

import control.Controller;

public class Main {
	public static void main(String[] args) throws IOException {
		//Controller ctrl = new Controller("0.tcp.ngrok.io", 11939);
		Controller ctrl = new Controller("192.168.0.159", 5123);
		ctrl.run();
	}
}