import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int ballState = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing" , args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        firstBall();
        secondBall();
        thirdBall();
        fourthBall();
        ballState++;
    }

    private void firstBall() {
        int firstBallHeight = HEIGHT / 5;
        ellipse(ballState, firstBallHeight, DIAMETER, DIAMETER);
    }

    private void secondBall() {
        int secondBallHeight = 2 * HEIGHT / 5;
        int secondBallState = 2 * ballState;
        ellipse(secondBallState, secondBallHeight, DIAMETER, DIAMETER);
    }

    private void thirdBall() {
        int thirdBallHeight = 3 * HEIGHT / 5;
        int thirdBallState = 3 * ballState;
        ellipse(thirdBallState, thirdBallHeight, DIAMETER, DIAMETER);
    }

    private void fourthBall() {
        int fourthBallHeight = 4 * HEIGHT / 5;
        int fourthBallState = 4 * ballState;
        ellipse(fourthBallState, fourthBallHeight, DIAMETER, DIAMETER);
    }
}
