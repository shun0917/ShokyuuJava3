
public class Animation extends MyFrame {
	public void run() {
		int y = 60;
		int x = 30;

		while (y >= 20) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y + 100, 10, 100);
			y -= 5;
			sleep(0.1);

		}
		while (x <= 200) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y + 100, 10, 100);
			x += 5;
			sleep(0.1);
		}


	}

}
