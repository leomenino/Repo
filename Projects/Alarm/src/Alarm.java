import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {

    private Timer timer;

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Number of rings: ");

        try {
            System.out.println("Number of rings: ");
            int numRings = Integer.parseInt(reader.readLine());
            System.out.println("Ring interval ");
            int ringInterval = Integer.parseInt(reader.readLine());

            System.out.println(Thread.currentThread().getName());
            Alarm alarm = new Alarm();
            Alarm alarm1 = new Alarm();
            alarm.start(numRings, ringInterval);
            alarm1.start(numRings, ringInterval);
            System.out.println("O Rui é lindo");
            String input = reader.readLine();
            while (!input.equals("exit")){
                System.out.println("ahahahahahahaha" + input);
                input = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(int numRings, int ringInterval) {
        /*System.out.println(Thread.currentThread().getName());
        while (numRings>0){
            System.out.println("Ring Ring");

            try {
                Thread.sleep(ringInterval*1000);
                numRings --;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

         */

        timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(numRings), 0,ringInterval + 1000);
    }

    private class Ring extends TimerTask {
        int numRings;

        public Ring(int numRings) {
            this.numRings = numRings;
        }

        @Override
        public void run() {
            numRings --;
            System.out.println("ring ring");
            if(numRings ==0){
                System.out.println("Alarm canceled");
                stop();
            }
        }
    }

    private void stop(){
        timer.cancel();;
    }
}
