import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static int beginTime = 4;
	public static void main(String[] args) {
		Secret.secret_1();
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				if (beginTime == 0) {
					System.out.println("Terrorists Win");
					timer.cancel();
					Secret.secret_2();
				} else {
					beginTime--;
					System.out.println(beginTime);
				}
			}
		}, 0, 1000);
	}	
}
