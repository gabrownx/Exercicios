import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 */

public class Temporizador {
    Timer timer;

    public Temporizador(int seconds) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new RemindTask(), 5000, seconds*1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Acabou o tempo!");
        }
    }

    public static void main(String args[]) {
        new Temporizador(2);
        System.out.println("Task scheduled.");
    }
}