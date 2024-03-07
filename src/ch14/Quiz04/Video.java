package ch14.Quiz04;

public class Video extends Thread{
    @Override
    public void run() {
        for(int i=0;i<3;i++) {
            try {
                Thread.sleep(1000);
            System.out.println("동영상을 재생합니다.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
